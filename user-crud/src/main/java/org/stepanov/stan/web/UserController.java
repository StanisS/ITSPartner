package org.stepanov.stan.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Stepanov_SI
 */
@Controller
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);


    @RequestMapping(value = "/userlist", method = RequestMethod.GET)
    public ModelAndView userListGet() {

        logger.debug("userList() is executed - ");

        ModelAndView model = new ModelAndView();
        model.setViewName("userList");

        model.addObject("title", "UserListGet");
        model.addObject("msg", "DescGet");

        return model;
    }

    @RequestMapping(value = "/userlist", method = RequestMethod.POST)
    public ModelAndView userListPost() {

        logger.debug("userList() is executed - ");

        ModelAndView model = new ModelAndView();
        model.setViewName("userList");

        model.addObject("title", "UserListPost");
        model.addObject("msg", "DescPost");

        return model;
    }


}