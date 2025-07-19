package com.repliforce.bff.client.model.repository;

import com.repliforce.bff.client.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
