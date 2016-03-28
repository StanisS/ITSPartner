package org.stepanov.stan.cache;

import org.stepanov.stan.beans.UserBean;
import org.stepanov.stan.utils.JsonRead;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stepanov_SI
 */
public class Storage {
    private List<UserBean> actualLIst;

    public Storage() {
        actualLIst = new JsonRead().readUsersBeanData();
    }

    public Storage (List<UserBean> beansList){
        actualLIst = beansList;
    }

    public List<UserBean> getActualLIst() {
        if (actualLIst == null) {
            actualLIst = new ArrayList<>();
        }
        return actualLIst;
    }

    public void setActualLIst(List<UserBean> actualLIst) {
        this.actualLIst = actualLIst;
    }
}
