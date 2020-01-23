package com.cognito.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.cognitoidentityprovider.CognitoIdentityProviderClient;

@Configuration
public class CognitoApiClientConfig {

    @Bean
    public CognitoIdentityProviderClient cognitoClient() {
        return CognitoIdentityProviderClient.builder().region(Region.EU_WEST_1).build();
    }

}
