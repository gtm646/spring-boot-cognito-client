package com.cognito.client.service;

import com.cognito.client.model.UserPoolInfo;
import com.cognito.client.util.DomainConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.cognitoidentityprovider.CognitoIdentityProviderClient;
import software.amazon.awssdk.services.cognitoidentityprovider.model.ListUserPoolsRequest;
import software.amazon.awssdk.services.cognitoidentityprovider.model.ListUserPoolsResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CognitoUserPoolServiceImpl implements CognitoUserPoolService{

    private final CognitoIdentityProviderClient cognitoClient;

    @Autowired
    public CognitoUserPoolServiceImpl(CognitoIdentityProviderClient cognitoClient) {
        this.cognitoClient = cognitoClient;
    }

    public List<UserPoolInfo> listUserPools(){
        List<UserPoolInfo> userPoolInfos;
        ListUserPoolsResponse listUserPoolsResponse = cognitoClient.listUserPools(ListUserPoolsRequest.builder().maxResults(5).build());
        userPoolInfos = listUserPoolsResponse.userPools().stream().map(DomainConverter::toUserPoolInfo).collect(Collectors.toList());
       return userPoolInfos;
    }


}
