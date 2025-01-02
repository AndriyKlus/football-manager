package andriyklus.footballmanager.repository;

import andriyklus.footballmanager.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}