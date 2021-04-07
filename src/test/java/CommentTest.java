import com.allen.pojo.Comment;
import com.allen.service.CommentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ifree
 */
public class CommentTest {
    @Test
    public void test() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final CommentService commentServiceImpl = context.getBean("commentServiceImpl", CommentService.class);
    }
}
