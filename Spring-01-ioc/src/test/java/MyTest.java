import com.lxx.dao.UserDaoMysqlImpl;
import com.lxx.dao.UserDaoSqlServer;
import com.lxx.service.UserService;
import com.lxx.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /* public static void main(String[] args) {
         //用户实际上调用的是业务层，dao层他们不需要触碰
 //      UserService userService=new UserServiceImpl();
         UserServiceImpl userService = new UserServiceImpl();
         //用户动态的去更改需求
         userService.setUserDao(new UserDaoSqlServer());
         userService.getUser();
     }*/
    public static void main(String[] args) {
        //获取ApplicationContext 拿到spring容器上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有，需要什么就直接get什么
        //getBean中为beans中的id
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.getUser();
    }
}
