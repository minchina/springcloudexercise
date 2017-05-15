package org.ncmao;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Contract feignContractg() {
        return new feign.Contract.Default();
    }
}