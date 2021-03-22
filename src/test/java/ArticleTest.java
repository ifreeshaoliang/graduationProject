import com.allen.pojo.Article;
import com.allen.service.ArticleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ifree
 */
public class ArticleTest {
    @Test
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final ArticleService articleServiceImpl = context.getBean("articleServiceImpl", ArticleService.class);
        final Article article = new Article(1, 1, "测试", "测试内容");
        articleServiceImpl.addArticle(article);
        System.out.println(articleServiceImpl.queryArticleByID(3));
        articleServiceImpl.deleteArticle(2);
        final List<Article> articles = articleServiceImpl.queryAllArticle();
        for (Article article1 : articles) {
            System.out.println(article1);
        }
    }
}
