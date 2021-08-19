package tekshila.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tekshila.chatapp.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
