package com.example.springcourse.config;

import com.example.springcourse.entities.Order;
import com.example.springcourse.entities.User;
import com.example.springcourse.entities.enums.OrderStatus;
import com.example.springcourse.repositories.OrderRepository;
import com.example.springcourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository oderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Edizzera","edi@gmail.com","999999","1234");
        User u2 = new User(null,"Iuri","hts@gmail", "8888888","54321");

        Order o1 = new Order(null, Instant.parse("2021-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2021-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT ,u2);
        Order o3 = new Order(null, Instant.parse("2021-07-22T15:21:22Z"),OrderStatus.DELIVERED, u1);

        //salvar no banco de dados
        userRepository.saveAll(Arrays.asList(u1,u2));
        oderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
