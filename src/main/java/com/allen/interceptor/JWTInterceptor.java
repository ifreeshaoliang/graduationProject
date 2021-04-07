package com.allen.interceptor;

import com.allen.utils.JWTUtil;
import com.allen.utils.constants.JWTConstant;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ifree
 */
public class JWTInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String jwt = request.getHeader(JWTConstant.HEADER_TOKEN);
        if (JWTUtil.validToken(jwt)) {
            final Claims claims = JWTUtil.parseJWT(jwt);
            //更新token
            response.addHeader(JWTConstant.HEADER_TOKEN, JWTUtil.createJWT(claims.getId(), claims.getSubject(), JWTConstant.JWT_TIME_TO_LIVE_MILLIS));

            return true;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
