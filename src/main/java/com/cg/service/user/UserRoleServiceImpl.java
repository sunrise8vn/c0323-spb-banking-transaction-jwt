package com.cg.service.user;

import com.cg.model.UserRole;
import com.cg.repository.IUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserRoleServiceImpl implements IUserRoleService {

    @Autowired
    private IUserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAll() {
        return null;
    }

    @Override
    public Optional<UserRole> findById(Long id) {
        return userRoleRepository.findById(id);
    }

    @Override
    public UserRole save(UserRole userRole) {
        return null;
    }

    @Override
    public void delete(UserRole userRole) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<UserRole> findByCode(String code) {
        return Optional.empty();
    }
}
