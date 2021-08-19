package tekshila.chatapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_groups")
@AllArgsConstructor
@Getter @Setter
public class UserGroup {

    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "role_id")
    private Integer roleId;
}
