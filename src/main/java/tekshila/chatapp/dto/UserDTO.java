package tekshila.chatapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import tekshila.chatapp.domain.User;

@Data
@NoArgsConstructor
public class UserDTO {
    private Integer userId;
    private String userName;
    private String screenName;
    private String pwd;

    public UserDTO(String userName, String screenName, String pwd) {
        this.userName = userName;
        this.screenName = screenName;
        this.pwd = pwd;
    }

    public UserDTO(User user) {
        this.userId = user.getId();
        this.userName = user.getUserName();
        this.screenName = user.getScreenName();
    }

}
