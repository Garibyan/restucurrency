package com.restcurrency.myapp.intercaptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingInterceptor implements HandlerInterceptor  {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//            throws Exception {
//        System.out.println("---Before Method Execution---");
//        System.out.println("url: " + request.getRequestURI());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        System.out.println("date: " + simpleDateFormat.format(new Date()));
//        return true;
//    }
//
//    @Override
//    public void postHandle(	HttpServletRequest request, HttpServletResponse response,
//                               Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("---method executed---");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//                                Object handler, Exception ex) throws Exception {
//        System.out.println("---Request Completed---");
//        System.out.println("=========================");
//        System.out.println("responce outputstream: " + response.getOutputStream());
//        System.out.println("responce status: " + response.getStatus());
//        System.out.println("responce locale: " + response.getLocale());
//        System.out.println("responce class: " + response.getClass());
//        System.out.println("responce context type: " + response.getContentType());
//
//    }
}