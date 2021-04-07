import com.allen.utils.ResultCode;
import org.junit.Test;

/**
 * @author ifree
 */
public class ResultCodeTest {
    @Test
    public void test() {
        ResultCode resultCode = ResultCode.FAIL;
        if ( resultCode.code() == 400) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
