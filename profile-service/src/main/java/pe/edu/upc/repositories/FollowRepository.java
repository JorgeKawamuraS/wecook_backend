package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.Follow;

@Repository
public interface FollowRepository extends JpaRepository<Follow,Long> {

}
