package com.greenfox.hellobeanworld;

import com.greenfox.hellobeanworld.services.MyColor;
import com.greenfox.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    HellobeanworldApplication(Printer printer, @Qualifier("green") MyColor myColor) {
        this.printer = printer;
        color = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(color);


    }
}
