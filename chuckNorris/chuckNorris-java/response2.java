package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class chuckJson2 {

    public static void main(String[] args) throws Exception {
        String url = "https://api.chucknorris.io/jokes/categories";

        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}
