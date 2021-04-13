import com.lxx.mapper.UserMapper;
import com.lxx.pojo.User;
import com.lxx.utils.MybatisUtils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession=  MybatisUtils.getSqlSession();
        //
        //方式一：getMapper
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList=userMapper.selectUser();
        for (User user:userList
             ) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
