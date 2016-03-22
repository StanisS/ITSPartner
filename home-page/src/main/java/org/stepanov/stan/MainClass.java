package org.stepanov.stan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Stepanov_SI
 */
public class MainClass {
    private static final Logger logger = LogManager.getLogger(MainClass.class);

    public static void main(String[] args) {
        String s = "Hello my gradle app.";
        System.out.println(s);
        logger.debug(s);
    }
}
