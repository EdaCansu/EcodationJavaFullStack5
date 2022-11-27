package com.edacansu.bean;

import com.edacansu.business.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDtoMethod(){
        return BeanDto.builder().beanData("bean data24").beanName("bean name24").id(1L).build();
    }
}
