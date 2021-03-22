package com.allen.utils.constants;

/**
 * @author ifree
 */
public class JWTConstant {
    //密钥
    public static final String JWT_SECERT = "Dwed3f2KjsdYbep2==";
    //签发者
    public static final String ISSUER = "Allen";
    /****************************************************************/
    //JWT过期错误
    public static final Integer JWT_ERRCODE_EXPIRE = 85201;
    //JWT验证失败
    public static final Integer JWT_ERRCODE_FAIL = 85202;
    /****************************************************************/
    //请求头
    public static final String HEADER_TOKEN = "Authorization";
    //请求头内容前缀
    public static final String HEADER_TOKEN_PREFIX = "Bearer ";
}
