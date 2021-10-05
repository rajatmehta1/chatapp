package tekshila.chatapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chatgroups")
@NoArgsConstructor
@Getter @Setter
public class Group {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer groupId;

    @Column(name = "name")
    private String name;

    @Column(name = "create_dt")
    private Date createDate;

    @Column(name = "owner")
    private Integer groupOwner;
}
