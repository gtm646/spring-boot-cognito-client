package com.cognito.client.service;
import com.cognito.client.model.UserPoolInfo;

import java.util.List;

public interface CognitoUserPoolService {
    List<UserPoolInfo> listUserPools();
}
