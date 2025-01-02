package andriyklus.footballmanager.service;

import andriyklus.footballmanager.entity.Player;
import andriyklus.footballmanager.entity.Team;
import andriyklus.footballmanager.exception.InsufficientFundsException;
import andriyklus.footballmanager.exception.TransferSameTeamException;
import andriyklus.footballmanager.repository.PlayerRepository;
import andriyklus.footballmanager.repository.TeamRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransferService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    public void transferPlayer(Long playerId, Long targetTeamId) {
        Player player = playerRepository.findById(playerId)
                .orElseThrow(() -> new EntityNotFoundException("Player not found"));
        Team currentTeam = player.getTeam();
        Team targetTeam = teamRepository.findById(targetTeamId)
                .orElseThrow(() -> new EntityNotFoundException("Target team not found"));

        if (currentTeam == targetTeam) {
            throw new TransferSameTeamException("Player can't transfer to his current team.");
        }

        double transferFee = (double) (player.getExperienceMonths() * 100_000) / player.getAge();

        double commission = transferFee * (targetTeam.getCommissionRate() / 100);

        double totalCost = transferFee + commission;

        if (targetTeam.getBalance().compareTo(totalCost) < 0) {
            throw new InsufficientFundsException("Target team has insufficient balance");
        }

        targetTeam.setBalance(targetTeam.getBalance() - totalCost);
        currentTeam.setBalance(currentTeam.getBalance() + totalCost);

        player.setTeam(targetTeam);

        teamRepository.save(targetTeam);
        teamRepository.save(currentTeam);
        playerRepository.save(player);
    }
}