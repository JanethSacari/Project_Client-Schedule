package com.repliforce.bff.client;

import com.repliforce.bff.client.model.entity.Client;
import com.repliforce.bff.client.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClientRepository clientRepository) {
        return args -> {
            Client client = Client.builder()
                    .name("X")
                    .cpf("0000000000000")
                    .build();
            clientRepository.save(client);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
