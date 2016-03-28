package org.stepanov.stan.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.stepanov.stan.beans.UserBean;
import org.stepanov.stan.cache.Storage;

import java.io.UnsupportedEncodingException;

/**
 * Created by Stepanov_SI
 */
@Controller
@RequestMapping("/userCrud")
public class UserCrudImpl implements UserCrud{

    private static final Logger logger = LogManager.getLogger(UserCrudImpl.class);

    private Storage storage = new Storage();


    @Override
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> userCreate(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Create operation");
        String requestBody = requestEntity.getBody();
        for (String s : requestEntity.getHeaders().keySet()) {
            logger.debug("key: " + s + "; value: " + requestEntity.getHeaders().getFirst(s));
        }
        logger.debug("hasBody: "+requestEntity.hasBody());
        logger.debug("Body: "+requestBody);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "[{\"name\": \"Bradley Greer\", \"position\":\"Software Engineer\", \"office\":\"London\", \"age\":\"41\", \"startDate\":\"2012/10/13\", \"salary\":\"132,000\"}, " +
                "{\"name\": \"Ashton Cox\", \"position\":\"Junior Technical Author\", \"office\":\"San Francisco\", \"age\":\"66\", \"startDate\":\"2009/01/12\", \"salary\":\"86,000\"}]";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.CREATED);
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> userRead(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Read operation");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        StringBuilder body = new StringBuilder();
        body.append("[");
        for (int i = 0; i < storage.getActualLIst().size(); i++) {
            UserBean userBean = storage.getActualLIst().get(i);
            body.append(userBean.toJSONString());
            if ( i != storage.getActualLIst().size()-1) {
                body.append(", ");
            }
        }
        body.append("]");
        return new ResponseEntity<String>(body.toString(), responseHeaders, HttpStatus.OK);
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<String> userUpdate(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Update operation");

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "{Update operation}";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.OK);
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> userDelete(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Delete operation");

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "{Delete operation}";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.OK);
    }
}