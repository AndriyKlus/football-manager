package andriyklus.footballmanager.repository;

import andriyklus.footballmanager.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}