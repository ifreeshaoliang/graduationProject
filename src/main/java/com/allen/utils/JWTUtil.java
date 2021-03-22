package com.allen.utils;


import com.allen.utils.constants.JWTConstant;
import io.jsonwebtoken.*;


import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

/**
 * @author ifree
 */
public class JWTUtil {
    //static String SECRET_KEY = "KJHUhjjJYgYUllVbXhKDHXhkSyHjlNiVkYzWTBac1Yxkjhuad";

    /*
     * @Description //创建java web token
     * @Param [id, subject, ttlMillis, claims]
     * @return java.lang.String
     **/
    public static String createJWT(String id, String subject, long ttlMillis) throws Exception{
        //加密算法
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS512;
        //获得当前时间
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        //密钥
        SecretKey secretKey = generalKey();

        JwtBuilder builder = Jwts.builder()
                .setId(id)
                .setSubject(subject) //主体
                .setIssuer(JWTConstant.ISSUER)//签发者
                .setAudience(JWTConstant.ISSUER)//受众(接收方)
                .setIssuedAt(now)//签发时间
                .signWith(signatureAlgorithm,secretKey)//签名算法和密钥
                .setHeaderParam("typ","JWT"); //jwt的header参数
        if (ttlMillis > 0){
            long expMillis = nowMillis + ttlMillis;
            Date expDate = new Date(expMillis);
            builder.setExpiration(expDate);//设置过期时间
        }
        return builder.compact();
    }

    /*
     * @Description //创建密钥
     * @Param []
     * @return javax.crypto.SecretKey
     **/
    public static SecretKey generalKey() {
        byte[] encodedKey = Base64.getEncoder().encode(JWTConstant.JWT_SECERT.getBytes(StandardCharsets.UTF_8)) ;
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");// 根据给定的字节数组使用AES加密算法构造一个密钥，使用
        return key;
    }

    /*
     * @Description //解析token
     * @Param [jwt]
     * @return io.jsonwebtoken.Claims
     **/
    public static Claims parseJWT(String jwt){
        SecretKey secretKey = generalKey();
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(jwt)
                .getBody();
    }

//    public static <CheckResult> CheckResult validateJWT(String jwt) {
//        //生成返回类
//        CheckResult checkResult = new CheckResult();
//        Claims claims = null;
//        try {
//            claims = parseJWT(jwt);
//            if (claims == null){
//                checkResult.setSuccess(false);
//                checkResult.setErrCode(JWTConstant.JWT_ERRCODE_FAIL);
//            } else if (claims.getAudience().equals(JWTConstant.ISSUER)){
//                checkResult.setSuccess(false);
//                checkResult.setErrCode(JWTConstant.JWT_ERRCODE_FAIL);
//            }else if (claims.getIssuer().equals(JWTConstant.ISSUER)){
//                checkResult.setSuccess(false);
//                checkResult.setErrCode(JWTConstant.JWT_ERRCODE_FAIL);
//            }
//            checkResult.setSuccess(true);
//            checkResult.setClaims(claims);
//        }catch (ExpiredJwtException e){
//            //JWT过期
//            checkResult.setSuccess(false);
//            checkResult.setErrCode(JWTConstant.JWT_ERRCODE_EXPIRE);
//        }catch (SignatureException e){
//            //签名错误
//            checkResult.setSuccess(false);
//            checkResult.setErrCode(JWTConstant.JWT_ERRCODE_FAIL);
//        }
//
//        return checkResult;
//    }

}
