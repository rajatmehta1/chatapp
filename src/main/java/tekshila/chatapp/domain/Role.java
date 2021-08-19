package tekshila.chatapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Getter @Setter
public class Role {

    @Id
    @Column(name = "id")
    private Integer roleId;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;
}
