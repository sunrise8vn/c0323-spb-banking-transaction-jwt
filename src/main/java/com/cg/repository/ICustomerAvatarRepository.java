package com.cg.repository;

import com.cg.model.CustomerAvatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerAvatarRepository extends JpaRepository<CustomerAvatar, String> {
}
