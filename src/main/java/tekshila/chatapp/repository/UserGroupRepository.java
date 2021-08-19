package tekshila.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekshila.chatapp.domain.UserGroup;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {
}
