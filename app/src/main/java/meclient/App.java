/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package meclient;

import java.io.IOException;
import java.util.Properties;

import com.azure.identity.DeviceCodeCredential;
import com.azure.identity.DeviceCodeCredentialBuilder;
import com.microsoft.graph.core.requests.BaseGraphRequestAdapter;
import com.microsoft.kiota.authentication.AzureIdentityAuthenticationProvider;
import com.microsoft.kiota.store.InMemoryBackingStoreFactory;

import meclient.apiclient.GraphBaseServiceClient;
import meclient.apiclient.models.User;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        final Properties properties = new Properties();
        properties.load(App.class.getResourceAsStream("oAuth.properties"));

        final String clientId = properties.getProperty("app.clientId");
        final String tenantId = properties.getProperty("app.tenantId");
        final String[] scopes = properties.getProperty("app.graphUserScopes").split(",");
        final String[] allowedHosts = new String[] {"graph.microsoft.com"};

        DeviceCodeCredential deviceCodeCredential = new DeviceCodeCredentialBuilder()
            .clientId(clientId)
            .tenantId(tenantId)
            .challengeConsumer(challenge -> {
                System.out.println(challenge.getMessage());
            })
            .build();
        
        //Create an authentication provider using the credential and scopes
        AzureIdentityAuthenticationProvider authProvider = new AzureIdentityAuthenticationProvider(deviceCodeCredential, allowedHosts, scopes);
        
        //Create a request adapter to use when instantiating the Graph client
        BaseGraphRequestAdapter requestAdapter = new BaseGraphRequestAdapter(authProvider);

        GraphBaseServiceClient graphClient = new GraphBaseServiceClient(requestAdapter, new InMemoryBackingStoreFactory());
        
        User me = graphClient.me().get(requestConfiguration ->
            requestConfiguration.queryParameters.select = new String[] {"displayName", "mail", "userPrincipalName"});

        System.out.printf("DisplayName: %s\nMail: %s\nUserPrincipalName: %s",
            me.getDisplayName(), me.getMail(), me.getUserPrincipalName());

        
    }
}