import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import java.net.URI;

public class DiscordNotif {
    String url = "https://discordapp.com/api/webhooks/<<yourwebhook>>":

    DiscordNotif() throws Exception {
    }
    public void sendNotif(String message) throws Exception {
        ToJSON toJSON = new ToJSON();
        toJSON.setContent(message);

        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(URI.create(this.url));
        post.setHeader("Content-Type", "application/json");
        StringEntity stringEntity = new StringEntity(toJSON.getJSON(), "UTF-8");
        stringEntity.setContentType("application/json");
        post.setEntity(stringEntity);
        HttpResponse response = httpClient.execute(post);
    }
}
