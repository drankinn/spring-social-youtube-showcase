package org.springframework.social.connect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: lancea10
 * Date: 8/15/12
 * Time: 6:05 PM
 */
@Controller
public class SecurityController {

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String login(){
        return "security.login";
    }

    @RequestMapping(value="/loginFailed", method= RequestMethod.GET)
    public String loginError(Model model){
        model.addAttribute("error", true);
        return "security.login";

    }
}
