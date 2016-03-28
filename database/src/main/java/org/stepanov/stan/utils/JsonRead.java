package org.stepanov.stan.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.stepanov.stan.beans.UserBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stepanov_SI
 */
public class JsonRead {

    private static final Logger logger = LogManager.getLogger(JsonRead.class);


    public List<UserBean> readUsersBeanData() {
        logger.debug("Start read");

        InputStream is = getClass().getResourceAsStream("/userList/user.json");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);

        JSONParser parser = new JSONParser();
        JSONArray jsonArray = null;
        try {
            jsonArray = (JSONArray) parser.parse(reader);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return value_requestUsersBean(jsonArray);
    }

    private List<UserBean> value_requestUsersBean(JSONArray jsonArray) {
        logger.debug(jsonArray.toJSONString());
        List<UserBean> userBeanList = new ArrayList<>();
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            UserBean userBean = new UserBean();
            userBean.setName((String) jsonObject.get("name"));
            userBean.setPosition((String) jsonObject.get("position"));
            userBean.setOffice((String) jsonObject.get("office"));
            userBean.setAge(Integer.parseInt((String) jsonObject.get("age")));
            userBean.setDateStart((String) jsonObject.get("startDate"));
            userBean.setSalary(Integer.parseInt((String) jsonObject.get("salary")));
            userBeanList.add(userBean);
        }
        return userBeanList;
    }

//    private Function<JSONArray, List<UserBean>> value_requestUsersBean = jsonArray -> {
//
//        List<UserBean> userBeanList = new ArrayList<>();
//        for (Object o : jsonArray) {
//            JSONObject jsonObject = (JSONObject) o;
//            UserBean userBean = new UserBean();
//            userBean.setName((String) jsonObject.get("name"));
//            userBean.setPosition((String) jsonObject.get("position"));
//            userBean.setOffice((String) jsonObject.get("office"));
//            userBean.setAge(Integer.parseInt((String) jsonObject.get("age")));
//            userBean.setDateStart((String) jsonObject.get("startDate"));
//            userBean.setSalary(Integer.parseInt((String) jsonObject.get("salary")));
//            userBeanList.add(userBean);
//        }
//        return userBeanList;
//    };
}
