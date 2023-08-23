package com.cg.service.user;

import com.cg.model.User;
import com.cg.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User, String>, UserDetailsService {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

}
