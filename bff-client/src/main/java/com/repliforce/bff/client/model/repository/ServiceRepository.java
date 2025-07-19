package com.repliforce.bff.client.model.repository;

import com.repliforce.bff.client.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
