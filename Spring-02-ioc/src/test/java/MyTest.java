import com.lxx.dao.UserDaoMysqlImpl;
import com.lxx.dao.UserDaoOracleImpl;
import com.lxx.service.UserService;
import com.lxx.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
      //  UserService userService=new UserServiceImpl();
        UserServiceImpl userService=new UserServiceImpl();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
