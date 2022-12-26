package edu.restAPI;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.Closeable;
import java.io.IOException;

public class RestApiGet {
    static HttpResponse response;
    public static String Get(String url) {
        String stringResponse;
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        try {
            response = httpClient.execute(new HttpGet(url));
            stringResponse = EntityUtils.toString(response.getEntity());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return stringResponse;
        }
        public int getResponseCode() {
        return response.getStatusLine().getStatusCode();
        }
}
