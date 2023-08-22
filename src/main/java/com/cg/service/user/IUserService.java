package com.cg.service.user;

import com.cg.model.User;
import com.cg.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User, String>, UserDetailsService {

    Boolean existsByUsername(String username);

}
