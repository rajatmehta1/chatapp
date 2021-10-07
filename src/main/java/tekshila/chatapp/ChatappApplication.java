package tekshila.chatapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tekshila.chatapp.dto.UserDTO;
import tekshila.chatapp.service.UserService;

@SpringBootApplication
public class ChatappApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChatappApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
//        userService.addUser(new UserDTO("mehrajat","GreenPython","admin"));
//        userService.addUser(new UserDTO("chacha_deepak","chachaji","admin"));
    }

}
