package com.pony.test.api;


import com.pony.test.service.AdminService;
import com.pony.test.service.WxCommonService;
import com.pony.test.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {

    @Autowired
    AdminService service;
    @Autowired
    WxCommonService wxCommonService;

    @RequestMapping(value = "/get-session-key", method = RequestMethod.POST)
    public Result getSessionKeyByFactory(String code) {
        return wxCommonService.getSessionKeyByFactory(code);
    }
}
