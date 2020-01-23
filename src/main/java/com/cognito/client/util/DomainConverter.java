package com.cognito.client.util;

import com.cognito.client.model.UserPoolInfo;
import software.amazon.awssdk.services.cognitoidentityprovider.model.UserPoolDescriptionType;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DomainConverter {
    public static UserPoolInfo toUserPoolInfo(UserPoolDescriptionType userPoolDescriptionType){
        UserPoolInfo userPoolInfo = new UserPoolInfo();
        userPoolInfo.setId(userPoolDescriptionType.id());
        userPoolInfo.setName(userPoolDescriptionType.name());
        userPoolInfo.setStatus(userPoolDescriptionType.statusAsString());
        userPoolInfo.setCreationDate(LocalDateTime.ofInstant(userPoolDescriptionType.creationDate(), ZoneOffset.UTC));
        userPoolInfo.setLastModifiedDate(LocalDateTime.ofInstant(userPoolDescriptionType.lastModifiedDate(), ZoneOffset.UTC));
        return userPoolInfo;
    }
}
