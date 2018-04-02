import java.util.List;
import org.junit.Test;




public class RoleTest {
  @Test
  public void checkFindAll(){
     RoleDao roleDao = new RoleDaoImpl();
         List<RoleEntity> list = roleDao.findAll();
   }
}
