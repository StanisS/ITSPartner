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

import java.io.UnsupportedEncodingException;

/**
 * Created by Stepanov_SI
 */
@Controller
@RequestMapping("/userCrud")
public class UserCrudImpl implements UserCrud{

    private static final Logger logger = LogManager.getLogger(UserCrudImpl.class);

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> userCreate(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Create operation");
        String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
        String requestBody = requestEntity.getBody();
        // do something with request header and body

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "{Create operation}";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.CREATED);
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> userRead(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Read operation");
        String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
        String requestBody = requestEntity.getBody();
        // do something with request header and body

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "{Read operation}";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.FOUND);
    }

    @Override
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<String> userUpdate(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Update operation");
        String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
        String requestBody = requestEntity.getBody();
        // do something with request header and body

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "{Update operation}";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.OK);
    }

    @Override
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> userDelete(HttpEntity<String> requestEntity) throws UnsupportedEncodingException{
        logger.debug("Delete operation");
        String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
        String requestBody = requestEntity.getBody();
        // do something with request header and body

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set(HttpHeaders.CONTENT_TYPE, "text/json; charset=utf-8");
        String body = "{Delete operation}";

        return new ResponseEntity<String>(body, responseHeaders, HttpStatus.OK);
    }
}