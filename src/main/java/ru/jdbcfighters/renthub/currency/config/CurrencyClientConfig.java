package ru.jdbcfighters.renthub.currency.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties(prefix = "currency.client")
public class CurrencyClientConfig {

    private String url;
}
