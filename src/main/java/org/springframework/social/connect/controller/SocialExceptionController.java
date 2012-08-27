package org.springframework.social.connect.controller;

import org.springframework.social.NotAuthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: lancea10
 * Date: 8/23/12
 * Time: 2:17 PM
 */
public class SocialExceptionController {

    @ExceptionHandler(NotAuthorizedException.class)
    public ModelAndView handleMissingAuthorizationException(HttpServletRequest request, HttpServletResponse response, NotAuthorizedException ex){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("connect");
        return mav;
    }
}
