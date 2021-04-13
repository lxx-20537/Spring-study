import com.lxx.pojo.Student;
import com.lxx.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());
    }

    @Test
    public  void Test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
//        System.out.println(user.toString());
        System.out.println(user==user2);
    }
}
