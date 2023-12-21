package com.lindar.id3global;

import com.lindar.id3global.api.AuthenticateApi;
import com.lindar.id3global.api.CredentialsApi;
import com.lindar.id3global.api.SearchApi;
import com.lindar.id3global.support.WSSESecurityHeaderRequestWebServiceMessageCallback;
import com.lindar.id3global.vo.AccessSettings;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

public class ID3GlobalClient {

    private static final String CONTEXT_PATH = "com.lindar.id3global.schema";

    private final AuthenticateApi authenticateApi;
    private final SearchApi searchApi;
    private final CredentialsApi credentialsApi;

    private ID3GlobalClient(AccessSettings accessSettings){
        WSSESecurityHeaderRequestWebServiceMessageCallback authenticationCallback = new WSSESecurityHeaderRequestWebServiceMessageCallback(accessSettings.getUsername(), accessSettings.getPassword());
        WebServiceTemplate webServiceTemplate = buildWebServiceTemplate(accessSettings.getReadTimeout(), accessSettings.getConnectionTimeout());

        this.authenticateApi = new AuthenticateApi(accessSettings, webServiceTemplate, authenticationCallback);
        this.searchApi = new SearchApi(accessSettings, webServiceTemplate, authenticationCallback);
        this.credentialsApi = new CredentialsApi(accessSettings, webServiceTemplate);
    }

    public AuthenticateApi authenticate() {
        return authenticateApi;
    }

    public SearchApi search() {
        return searchApi;
    }

    public CredentialsApi credentials() {
        return credentialsApi;
    }

    public static ID3GlobalClient build(String apiUrl, String username, String password, String defaultProfileId, int defaultProfileVersion, String defaultOrgId) {
        AccessSettings accessSettings = new AccessSettings();
        accessSettings.setApiUrl(apiUrl);
        accessSettings.setProfileId(defaultProfileId);
        accessSettings.setProfileVersion(defaultProfileVersion);
        accessSettings.setUsername(username);
        accessSettings.setPassword(password);
        accessSettings.setOrgId(defaultOrgId);
        return new ID3GlobalClient(accessSettings);
    }

    public static ID3GlobalClient build(AccessSettings accessSettings) {
        return new ID3GlobalClient(accessSettings);
    }

    private WebServiceTemplate buildWebServiceTemplate(int readTimeout, int connectionTimeout){
        HttpComponentsMessageSender httpComponentsMessageSender = buildMessageSender(readTimeout, connectionTimeout);

        Jaxb2Marshaller jaxb2Marshaller = buildMarshaller();
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMessageSender(httpComponentsMessageSender);
        webServiceTemplate.setMarshaller(jaxb2Marshaller);
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller);

        return webServiceTemplate;
    }

    private static HttpComponentsMessageSender buildMessageSender(int readTimeout, int connectionTimeout) {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        if (connectionTimeout > 0) {
            httpComponentsMessageSender.setConnectionTimeout(connectionTimeout);
        }
        if (readTimeout > 0) {
            httpComponentsMessageSender.setReadTimeout(readTimeout);
        }
        return httpComponentsMessageSender;
    }

    private Jaxb2Marshaller buildMarshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(CONTEXT_PATH);

        return marshaller;
    }
}
