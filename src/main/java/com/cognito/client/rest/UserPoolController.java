package com.cognito.client.rest;

import com.cognito.client.model.UserPoolInfo;
import com.cognito.client.service.CognitoUserPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/userpools")
public class UserPoolController {

    private final CognitoUserPoolService cognitoUserPoolService;

    @Autowired
    public UserPoolController(CognitoUserPoolService cognitoUserPoolService) {
        this.cognitoUserPoolService = cognitoUserPoolService;
    }

    @GetMapping("/listall")
    public List<UserPoolInfo> listAllUserPools() {
        return cognitoUserPoolService.listUserPools();
    }
}
