package com.study.studytest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class StudyTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(StudyTest1Application.class, args);
    }

}
