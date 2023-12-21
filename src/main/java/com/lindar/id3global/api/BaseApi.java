package com.lindar.id3global.api;

import com.lindar.id3global.vo.AccessSettings;
import com.lindar.id3global.schema.GlobalProfileIDVersion;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;

abstract class BaseApi {
    private final String endpoint;

    protected final AccessSettings accessSettings;
    protected final WebServiceTemplate webServiceTemplate;
    protected final GlobalProfileIDVersion defaultProfileVersion;

    public BaseApi(String endpoint, AccessSettings accessSettings, WebServiceTemplate webServiceTemplate) {
        this.endpoint = endpoint;
        this.accessSettings = accessSettings;
        this.webServiceTemplate = webServiceTemplate;
        this.defaultProfileVersion = buildProfileVersion(accessSettings.getProfileId(), accessSettings.getProfileVersion());
    }

    protected final Object marshalSendAndReceive(Object payload, WebServiceMessageCallback callback){
        return webServiceTemplate
                .marshalSendAndReceive(accessSettings.getApiUrl() + endpoint,
                                       payload, callback);
    }

    GlobalProfileIDVersion buildProfileVersion(String id, long version){
        GlobalProfileIDVersion profileVersion = new GlobalProfileIDVersion();
        profileVersion.setID(id);
        profileVersion.setVersion(version);
        return profileVersion;
    }
}
