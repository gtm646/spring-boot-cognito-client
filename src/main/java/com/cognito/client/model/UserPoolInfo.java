package com.cognito.client.model;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserPoolInfo {
    private String id;
    private String name;
    private String status;
    private LocalDateTime lastModifiedDate;
    private LocalDateTime creationDate;
}
