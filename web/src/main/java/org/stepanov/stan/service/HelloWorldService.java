package org.stepanov.stan.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
/**
 * Created by Stepanov_SI
 */
@Service
public class HelloWorldService {

    private static final Logger logger = LogManager.getLogger(HelloWorldService.class);

    public String getDesc() {

        logger.debug("getDesc() is executed!");

        return "A simple web application";

    }

    public String getTitle(String name) {

        logger.debug("getTitle() is executed! $name : {}", name);

        if (StringUtils.isEmpty(name)) {
            return "Hello Tester";
        } else {
            return "Hello " + name;
        }

    }

}