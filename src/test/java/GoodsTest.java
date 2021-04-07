import com.allen.pojo.Goods;
import com.allen.service.GoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ifree
 */
public class GoodsTest {
    @Test
    public void test() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final GoodsService goodsServiceImpl = context.getBean("goodsServiceImpl", GoodsService.class);
        //final Goods goods = new Goods(1, "法国原瓶进口红酒", 127.0, "其它", 7.5, 300,
          //      10, "常温，避光，卧放", "甜型", 2017);
        //goodsServiceImpl.addGoods(goods);
        //goodsServiceImpl.deleteGoods(2);
        //goodsServiceImpl.updateGoods(goods);
        final List<Goods> goodsList = goodsServiceImpl.queryAllGoods();
        for (Goods goods1 : goodsList) {
            System.out.println(goods1);
        }
//        final Goods goods1 = goodsServiceImpl.queryGoodsByID(1);
//        System.out.println(goods1);
    }
}
