package org.springframework.social.connect.controller;

import org.springframework.social.youtube.model.repository.OAuth2UserProviderConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * User: lancea10
 * Date: 8/23/12
 * Time: 2:43 PM
 */

@Controller
@RequestMapping("/model/connection")
public class ConnectionController {

    @Inject
    private OAuth2UserProviderConnectionRepository repository;

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public String getAll(Model model){
        model.addAttribute("connections", repository.findAll());
        return "model/connection/all";
    }



}
