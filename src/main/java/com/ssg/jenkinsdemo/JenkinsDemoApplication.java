package com.ssg.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Slf4j
public class JenkinsDemoApplication {

    public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
    @PostConstruct
    public void init(){
        logger.info("Jenkins Demo Application Started !!!");
    }

    public static void main(String[] args) {
        logger.info("Application executed!!");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
