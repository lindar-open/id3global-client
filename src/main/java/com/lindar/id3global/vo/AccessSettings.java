package com.lindar.id3global.vo;

import lombok.Data;

@Data
public class AccessSettings {
    private String apiUrl;
    private String profileId;
    private long profileVersion;
    private String orgId;

    private String username;
    private String password;

    private int connectionTimeout = -1;
    private int readTimeout = -1;
}