package tekshila.chatapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "groups")
@NoArgsConstructor
@Getter @Setter
public class Group {

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer groupId;

    private String name;

    private Date createDate;

    private Integer groupOwner;
}
