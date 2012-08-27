package org.springframework.social.connect.controller.youtube;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.social.connect.Connection;
import org.springframework.social.youtube.api.ProfileOperations;
import org.springframework.social.youtube.api.Youtube;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

/**
 * User: lancea10
 * Date: 7/25/12
 * Time: 12:40 PM
 */
@Controller
@RequestMapping("/youtube/profile")
public class YoutubeProfileController {

    @Inject
    @Qualifier("youtube")
    Connection<Youtube> connection;

   @RequestMapping(method= RequestMethod.GET)
    public String get(Model m){
       ProfileOperations operations = connection.getApi().profileOPerations();
       m.addAttribute("profile", operations.getProfile());
       return "youtube/profile";
    }

    @RequestMapping(value="/usernameSuggestions", method=RequestMethod.GET)
    public String getUsernameSuggestionsForm(Model model){
        return "youtube/profile/username-suggestions";
    }

    @RequestMapping(value="usernameSuggestions", method=RequestMethod.POST, params = {"hint"})
    public String getUSernameSuggestions(@RequestParam("hint")String hint, Model model){
        model.addAttribute("hint", hint);
        model.addAttribute("suggestions", connection.getApi().profileOPerations().getUsernameSuggestions(hint));
        return "youtube/profile/username-suggestions";
    }
}
