import com.allen.utils.JWTUtil;
import com.allen.utils.constants.JWTConstant;
import io.jsonwebtoken.Claims;
import org.junit.Test;

/**
 * @author ifree
 */
public class TokenTest {
    @Test
    public void test() throws Exception {
        System.out.println(JWTUtil.getSecretKey());
        final String jwt = JWTUtil.createJWT("1", "username", JWTConstant.JWT_TIME_TO_LIVE_MILLIS);
        System.out.println(jwt);

        final Claims claims = JWTUtil.parseJWT(jwt);
        System.out.println(claims);
        System.out.println(claims.getId());
        System.out.println(claims.getSubject());
        System.out.println(claims.getIssuer());
    }
}
