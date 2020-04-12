package com.restcurrency.myapp.intercaptor;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RestTemplateHeaderModifierInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(
            HttpRequest request,
            byte[] body,
            ClientHttpRequestExecution execution) throws IOException {

        ClientHttpResponse response = execution.execute(request, body);
//        response.getHeaders().add("Foo", "bar");
        System.out.println("Request was intercapted");
        System.out.println("Method: " + request.getMethod());
        System.out.println("Url: " + request.getURI());
        System.out.println("Methodvalue: " + request.getMethodValue());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Date: " + simpleDateFormat.format(new Date()));
        System.out.println("---Request Completed---");
        System.out.println("=========================");
        System.out.println("Response body: " + response.getBody());
        System.out.println("Responce headers: " + response.getHeaders());
        System.out.println("Responce statustext: " + response.getStatusText());
        System.out.println("Responce class: " + response.getClass());
        System.out.println("Responce raw status code: " + response.getRawStatusCode());
        return response;
    }
}
