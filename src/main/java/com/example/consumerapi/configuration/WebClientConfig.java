package com.example.consumerapi.configuration;

import com.example.consumerapi.rest.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientConfig {
    @Autowired
    ApplicationConfiguration applicationConfiguration;

    @Bean
    ProductClient productClient(){
        WebClient client = WebClient.builder()
                .baseUrl(applicationConfiguration.getBaseUrl())
                .build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        return factory.createClient(ProductClient.class);
    }
}
