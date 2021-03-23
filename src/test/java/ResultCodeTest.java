import com.allen.utils.ResultCode;
import org.junit.Test;

/**
 * @author ifree
 */
public class ResultCodeTest {
    @Test
    public static void main(String[] args) {
        ResultCode resultCode = ResultCode.FAIL;
        if ( resultCode.code() == 400) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
