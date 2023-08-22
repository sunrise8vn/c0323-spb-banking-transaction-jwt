package com.cg.service.user;


import com.cg.model.UserRole;
import com.cg.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface IUserRoleService extends IGeneralService<UserRole, Long> {
    Optional<UserRole> findByCode (String code);
}
