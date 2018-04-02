import java.util.List;

public interface RoleDao extends GenericDao<Integer, RoleEntity> {
  List<RoleEntity> findByRole(List<String> role);
}