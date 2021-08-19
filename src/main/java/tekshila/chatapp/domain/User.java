package tekshila.chatapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tekshila.chatapp.dto.UserDTO;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter @Setter
public class User {

    public User(String userName, String pwd, String screenName) {
        this.userName = userName;
        this.pwd = pwd;
        this.screenName = screenName;
    }

    public User(UserDTO userDTO) {
        this.userName = userDTO.getUserName();
        this.pwd = userDTO.getPwd();
        this.screenName = userDTO.getScreenName();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String pwd;

    @Column(name = "screen_name")
    private String screenName;
}
