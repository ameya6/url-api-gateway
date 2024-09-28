package org.gateway;

import io.netty.handler.logging.LogLevel;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.gateway.config.HttpClientCustomizer;
import org.springframework.cloud.gateway.config.HttpClientFactory;
import org.springframework.cloud.gateway.config.HttpClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Log4j2
public class ApplicationConfig {

    /*@Bean
    HttpClient httpClient() {
        return HttpClient.create().wiretap("LoggingFilter", LogLevel.INFO, AdvancedByteBufFormat.TEXTUAL);
    }

    @Autowired
    HttpClientProperties properties;

    @Autowired
    ServerProperties serverProperties;*/


    /*@Bean
    HttpClientFactory httpClientFactory() {
        List<HttpClientCustomizer> list = new ArrayList<>();
        list.add(httpClient -> {
            log.info("Applying Logging filter to {}", httpClient);
            return httpClient.wiretap("LoggingFilter", LogLevel.INFO, AdvancedByteBufFormat.TEXTUAL);
        });
        HttpClientFactory factory = new HttpClientFactory(properties, serverProperties, list);
        return factory;
    }*/
}
