package com.example.staybooking.config;

import com.google.maps.GeoApiContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
@Configuration
public class GoogleGeoCodingConfig {


    @Value("${geocoding.apikey}")
    private String apiKey;


    @Bean
    public GeoApiContext geoApiContext() {
        return new GeoApiContext.Builder().apiKey(apiKey).build();
    }
}
