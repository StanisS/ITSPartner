package org.stepanov.stan.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.stepanov.stan.service.HelloWorldService;

import java.util.Map;
/**
 * Created by Stepanov_SI
 */
@Controller
public class WelcomeController {

    private static final Logger logger = LogManager.getLogger(WelcomeController.class);

    private final HelloWorldService helloWorldService;

    @Autowired
    public WelcomeController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

        logger.debug("index() is executed!");

        model.put("title", helloWorldService.getTitle(""));
        model.put("msg", helloWorldService.getDesc());

        return "index";
    }

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String userList() {

        logger.debug("userList() is executed!");

        return "userList";
    }
}