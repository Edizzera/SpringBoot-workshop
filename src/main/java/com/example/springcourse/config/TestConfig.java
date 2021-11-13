package com.example.springcourse.config;

import com.example.springcourse.entities.User;
import com.example.springcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Edizzera","edi@gmail.com","999999","1234");
        User u2 = new User(null,"Iuri","hts@gmail", "8888888","54321");

        //salvar no banco de dados
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
