package com.yonyou.iuap.corp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value= {"classpath:yonsuite/apiuri.properties","classpath:yonsuite/productApiuri.properties"
                ,"classpath:yonbip/apiuri.properties"})
@EnableCaching
public class CorpDemoApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CorpDemoApplication.class, args);
    }

}

