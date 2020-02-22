package com.greenfox.mycolor;

import com.greenfox.mycolor.services.MyColor;
import com.greenfox.mycolor.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycolorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MycolorApplication.class, args);
    }

    private Printer printer;

    @Autowired
    public MycolorApplication(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log();

    }
}
