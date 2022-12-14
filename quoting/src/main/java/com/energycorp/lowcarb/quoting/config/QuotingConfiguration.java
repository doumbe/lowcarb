package com.energycorp.lowcarb.quoting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class QuotingConfiguration {

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}