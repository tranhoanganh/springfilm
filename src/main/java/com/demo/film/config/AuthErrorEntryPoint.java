package com.demo.film.config;

import com.demo.film.dto.BaseResponse;
import com.google.gson.Gson;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@Component
public class AuthErrorEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json;charset=UTF-8");
        BaseResponse res = new BaseResponse(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        response.getWriter().write(new Gson().toJson(res));
//        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}
