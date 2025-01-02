package andriyklus.footballmanager.init;

import andriyklus.footballmanager.entity.Player;
import andriyklus.footballmanager.entity.Team;
import andriyklus.footballmanager.repository.PlayerRepository;
import andriyklus.footballmanager.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class DataInitializerService {

    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    public DataInitializerService(TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    @Transactional
    public void initializeDatabase() {

        Team team1 = new Team("Manchester City", 100000000.0, 2.0);
        Team team2 = new Team("Liverpool", 80000000.0, 9.0);

        teamRepository.saveAll(Arrays.asList(team1, team2));

        List<Player> team1Players = Arrays.asList(
                new Player("Erling Haaland", 22, 48, team1),
                new Player("Kevin De Bruyne", 31, 120, team1),
                new Player("Phil Foden", 22, 60, team1),
                new Player("Jack Grealish", 27, 96, team1),
                new Player("Ruben Dias", 25, 84, team1)
        );

        List<Player> team2Players = Arrays.asList(
                new Player("Mohamed Salah", 30, 96, team2),
                new Player("Virgil van Dijk", 31, 120, team2),
                new Player("Alisson Becker", 30, 108, team2),
                new Player("Trent Alexander-Arnold", 24, 72, team2),
                new Player("Darwin Nunez", 23, 48, team2)
        );

        playerRepository.saveAll(team1Players);
        playerRepository.saveAll(team2Players);

    }
}