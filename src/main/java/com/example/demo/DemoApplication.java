package com.example.demo;

import com.example.demo.Pmb_System.Pmb;
import com.example.demo.Pmb_System.PmbRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(PmbRepository pmbRepository){
        return args -> {

            Pmb RimaF = new Pmb(
                    1,
                    "Rima Farniamul Munaimah",
                    "089453422",
                    123
            );

            Pmb halimah = new Pmb(
                    2,
                    "Halimatus Sya'diyah",
                    "08945377897",
                    456
            );

            Pmb vira = new Pmb(
                    3,
                    "Vira Al Firqotun Najiah",
                    "089453422",
                    789
            );

            Pmb nayla = new Pmb(
                    4,
                    "Nayla Sahidah",
                    "0894524356",
                    987
            );

            Pmb anggun = new Pmb(
                    5,
                    "Anggun Agustina",
                    "08945476543",
                    765
            );
            List<Pmb>Pmb = List.of(RimaF,halimah,vira,anggun,nayla);
            pmbRepository.saveAll(Pmb);
        };
    }
}
