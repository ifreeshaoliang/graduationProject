package com.allen.utils;


import com.allen.utils.constants.JWTConstant;
import io.jsonwebtoken.*;


import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

/**
 * @author ifree
 */
public class JWTUtil {
    /*
     * @Author ifree
     * @Description //创建token
     * @Param [id, subject, ttlMillis]
     * @return java.lang.String
     **/
    public static String createJWT(String id, String subject, long ttlMillis) throws Exception{
        JwtBuilder builder = Jwts.builder()
                .setId(id)
                .setSubject(subject) //主体
                .setIssuer(JWTConstant.ISSUER)//签发者
                .setAudience(JWTConstant.ISSUER)//受众(接收方)
                .setIssuedAt(new Date(System.currentTimeMillis()))//签发时间
                .signWith(SignatureAlgorithm.HS512, getSecretKey())//签名算法和密钥
                .setHeaderParam("typ","JWT"); //jwt的header参数
        if (ttlMillis > 0){
            builder.setExpiration(new Date(System.currentTimeMillis() + ttlMillis));//设置过期时间
        }
        return builder.compact();
    }

    /*
     * @Author ifree
     * @Description //创建密钥
     * @Param []
     * @return javax.crypto.SecretKey
     **/
    public static SecretKey getSecretKey() {
        byte[] encodedKey = Base64.getEncoder().encode(JWTConstant.JWT_SECERT.getBytes(StandardCharsets.UTF_8)) ;
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");// 根据给定的字节数组使用AES加密算法构造一个密钥，使用
        return key;
    }

    /*
     * @Author ifree
     * @Description //解析token，返回主体字符串
     * @Param [jwt]
     * @return java.lang.String
     **/
    public static Claims parseJWT(String jwt){
        return Jwts.parser()
                .setSigningKey(getSecretKey())
                .parseClaimsJws(jwt)
                .getBody();
    }

    /*
     * @Author ifree
     * @Description //验证token
     * @Param [jwt]
     * @return boolean
     **/
    public static boolean validToken(String jwt) {
        try {
            parseJWT(jwt);
        } catch (Throwable e) {
            return false;
        }
        return true;
    }
}
