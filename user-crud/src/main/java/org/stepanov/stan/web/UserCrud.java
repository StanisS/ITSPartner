package org.stepanov.stan.web;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;

/**
 * Created by Stepanov_SI
 */
public interface UserCrud {
    ResponseEntity<String> userCreate(HttpEntity<String> requestEntity) throws UnsupportedEncodingException;
    ResponseEntity<String> userRead(HttpEntity<String> requestEntity) throws UnsupportedEncodingException;
    ResponseEntity<String> userUpdate(HttpEntity<String> requestEntity) throws UnsupportedEncodingException;
    ResponseEntity<String> userDelete(HttpEntity<String> requestEntity) throws UnsupportedEncodingException;
}
