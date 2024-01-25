package com.ssg.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Test executing");
        assertEquals(true, true);
    }

}
