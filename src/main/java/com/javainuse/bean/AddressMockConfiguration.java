package com.javainuse.bean;


import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class AddressMockConfiguration {
   @Bean
   @Primary
   public Address addressService() {
      return Mockito.mock(Address.class);
   }
}