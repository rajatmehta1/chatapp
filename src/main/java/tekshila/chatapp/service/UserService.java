package tekshila.chatapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tekshila.chatapp.domain.User;
import tekshila.chatapp.dto.UserDTO;
import tekshila.chatapp.repository.UserRepository;

import javax.transaction.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserDTO addUser(UserDTO userDTO) {
        User newUser = new User(userDTO);
        User u = userRepository.save(newUser);
        return new UserDTO(u);
    }

    public UserDTO getUser(Integer userId) {
        UserDTO u = new UserDTO(userRepository.getById(userId));
            return u;
    }

}
