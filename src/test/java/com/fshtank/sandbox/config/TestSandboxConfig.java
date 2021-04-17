/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fshtank.sandbox.config;

import com.fshtank.sanbox.config.SpringFoxConfig;
import com.fshtank.sanbox.model.SanboxWebRequest;
import com.fshtank.sanbox.model.SanboxWebResponse;
import com.fshtank.sanbox.service.SbxService;
import com.fshtank.sanbox.service.impl.SbxServiceImpl;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author sznlf0
 */
@Configuration
@EnableWebMvc
@Import({SpringFoxConfig.class})
@ComponentScan(basePackages = "com.fshtank")

@PropertySources({
        @PropertySource("classpath:application.properties"),
})

public class TestSandboxConfig {

    @Value("${application.name}")
    private String applicationName;

    private String userName="userName";

    private String secret="pwd";


    /*
     * GETTERS and SETTERS
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        System.out.println("Starting Application Name: " + this.applicationName);
    }

    @Bean
    public SanboxWebRequest getSanboxWebRequest() {
        return new SanboxWebRequest();
    };

    @Bean
    public SbxService getSbxService () {
        return new SbxServiceImpl();
    }

    @Bean
    public SanboxWebResponse getSanboxWebResponse() {
        return new SanboxWebResponse();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders getRestTemplateHeaders() {

        HttpHeaders headers = new HttpHeaders();
        String plainClientCredentials = userName + ":" + secret;
        String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));
        headers.add("Authorization", "Basic " + base64ClientCredentials);

        return headers;
    }

}

