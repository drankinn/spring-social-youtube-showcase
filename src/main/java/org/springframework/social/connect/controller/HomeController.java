package org.springframework.social.connect.controller;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 1:13 PM
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Inject
    private Provider<ConnectionRepository> connectionRepositoryProvider;

    @RequestMapping(method= RequestMethod.GET)
    public String index(Model model){


        return "home.index";
    }
}
