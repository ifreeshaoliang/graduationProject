import com.allen.utils.JWTUtil;
import com.allen.utils.constants.JWTConstant;
import io.jsonwebtoken.Claims;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author ifree
 */
public class TokenTest {
    @Test
    public static void main(String[] args) throws Exception {
//        final byte[] bytes = JWTConstant.JWT_SECERT.getBytes(StandardCharsets.UTF_8);
//        final String s = Base64.getEncoder().encodeToString(bytes);
//        final byte[] decode = Base64.getDecoder().decode(JWTConstant.JWT_SECERT);
//        System.out.println(decode);
          System.out.println(JWTUtil.generalKey());
        final String jwt = JWTUtil.createJWT("1", "username", 10 * 60 * 60);
        System.out.println(jwt);

        final Claims claims = JWTUtil.parseJWT(jwt);
        final String subject = claims.getSubject();
        System.out.println(claims);
        System.out.println(subject);
    }
}
