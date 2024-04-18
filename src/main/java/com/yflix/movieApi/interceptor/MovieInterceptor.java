package com.yflix.movieApi.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MovieInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Perform pre-processing tasks before the request reaches the controller
        System.out.println("MovieInterceptor - preHandle: " + request.getRequestURI());
        // Return true to continue with the request processing, false to abort
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Perform post-processing tasks after the controller has processed the request but before rendering the view
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Perform post-processing tasks after the request has been handled by the controller
        System.out.println("MovieInterceptor - afterCompletion: " + request.getRequestURI());
    }
}