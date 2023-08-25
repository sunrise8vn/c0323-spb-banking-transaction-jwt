package com.cg.service.customerAvatar;


import com.cg.model.CustomerAvatar;
import com.cg.repository.ICustomerAvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerAvatarServiceImpl implements ICustomerAvatarService {

    @Autowired
    private ICustomerAvatarRepository customerAvatarRepository;

    @Override
    public List<CustomerAvatar> findAll() {
        return null;
    }

    @Override
    public Optional<CustomerAvatar> findById(String id) {
        return Optional.empty();
    }

    @Override
    public CustomerAvatar save(CustomerAvatar customerAvatar) {
        return null;
    }

    @Override
    public void delete(CustomerAvatar customerAvatar) {

    }

    @Override
    public void deleteById(String s) {

    }
}
