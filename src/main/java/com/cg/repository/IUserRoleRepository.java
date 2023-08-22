package com.cg.repository;

import com.cg.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findByCode (String code);
}
