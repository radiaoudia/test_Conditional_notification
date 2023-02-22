package com.example.test_notification;

import com.example.test_notification.business.INotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestNotificationApplication {
    @Autowired
    INotification iNotification;


    @GetMapping("/")
    public String index() {
        iNotification.notifier("dddddddd");
        return "aaaaaa";
    }


    public static void main(String[] args) {
        SpringApplication.run(TestNotificationApplication.class, args);
    }

}
