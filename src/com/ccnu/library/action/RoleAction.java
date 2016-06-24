package com.ccnu.library.action;

import com.ccnu.library.Utils;
import com.ccnu.library.data.UserinfoEntity;
import com.opensymphony.xwork2.ActionSupport;


public class RoleAction extends ActionSupport {

    public String execute() throws Exception {
        UserinfoEntity user = Utils.getUserinfo();
        if(0 != user.getAdmin()) {
            return SUCCESS;
        }
        return ERROR;
    }

}
