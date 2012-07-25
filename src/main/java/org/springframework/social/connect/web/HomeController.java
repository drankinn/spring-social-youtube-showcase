package org.springframework.social.connect.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 1:13 PM
 */
@Controller
public class HomeController {

    @RequestMapping(value="index", method= RequestMethod.GET)
    public String index(Model model){
        return "home:index";
    }
}
