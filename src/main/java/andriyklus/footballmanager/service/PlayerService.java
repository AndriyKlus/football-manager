package andriyklus.footballmanager.service;

import andriyklus.footballmanager.entity.Player;
import andriyklus.footballmanager.repository.PlayerRepository;
import andriyklus.footballmanager.repository.TeamRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Player not found"));
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, Player updatedPlayer) {
        Player player = getPlayerById(id);
        player.setName(updatedPlayer.getName());
        player.setAge(updatedPlayer.getAge());
        player.setExperienceMonths(updatedPlayer.getExperienceMonths());
        player.setTeam(updatedPlayer.getTeam());
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}