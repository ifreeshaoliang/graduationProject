package com.allen.utils.constants;

/**
 * @author ifree
 */
public class JWTConstant {
    //密钥
    public static final String JWT_SECERT = "Dwed3f2KjsdYbep2==";
    //签发者
    public static final String ISSUER = "Allen";
    //JWT过期时间，暂定15分钟
    public static final long JWT_TIME_TO_LIVE_MILLIS = 15 * 60 * 1000;
    //请求头
    public static final String HEADER_TOKEN = "Authorization";
    //请求头内容前缀
    public static final String HEADER_TOKEN_PREFIX = "Bearer ";
}
