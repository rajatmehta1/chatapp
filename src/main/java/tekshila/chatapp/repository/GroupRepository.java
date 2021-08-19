package tekshila.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekshila.chatapp.domain.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group,Integer> {
}
