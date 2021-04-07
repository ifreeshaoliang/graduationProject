import com.allen.pojo.User;
import com.allen.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ifree
 * 测试userDao
 */
public class UserDaoTest {
    @Test
    public void test() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);

       final User user1 = new User(2,"梅十三", "meiabc", "123456", "女", 0);

        userServiceImpl.addUser(user1);
//        System.out.println(userServiceImpl.queryUserByID(2));
//        userServiceImpl.updateUser(user1);
//        userServiceImpl.deleteUser(2);
//        System.out.println(userServiceImpl.queryUserByID(2));

        userServiceImpl.deleteUser(5);
        List<User> users = userServiceImpl.queryAllUser();
        for (User user : users) {
            System.out.println(user);
        }

//
    }
}
