package org.stepanov.stan.beans;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stepanov_SI
 */
public class UserBean implements JSONAware {

    public UserBean() {
    }

    private int id;
    private String name;
    private String position;
    private String office;
    private int age;
    private String dateStart;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBean userBean = (UserBean) o;

        if (age != userBean.age) return false;
        if (salary != userBean.salary) return false;
        if (name != null ? !name.equals(userBean.name) : userBean.name != null) return false;
        if (position != null ? !position.equals(userBean.position) : userBean.position != null) return false;
        if (office != null ? !office.equals(userBean.office) : userBean.office != null) return false;
        return dateStart != null ? dateStart.equals(userBean.dateStart) : userBean.dateStart == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (office != null ? office.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toJSONString() {
        Map<String, Object> genreBeanJsonMap = new HashMap<>();
        genreBeanJsonMap.put("name", getName());
        genreBeanJsonMap.put("position", getPosition());
        genreBeanJsonMap.put("office", getOffice());
        genreBeanJsonMap.put("age", getAge());
        genreBeanJsonMap.put("dateStart", getDateStart());
        genreBeanJsonMap.put("salary", getSalary());
        return JSONObject.toJSONString(genreBeanJsonMap);
    }
}
