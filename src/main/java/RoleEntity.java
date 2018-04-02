import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @Column(name = "roleid")
    private Integer roleId;
    @Column(name = "name")
    private String name;
   @OneToMany(mappedBy = "roleEntity",fetch = FetchType.LAZY)
   private List<UserEntity> userEntityList;

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
