package com.cg.service.history;


import com.cg.model.Customer;
import com.cg.model.Deposit;
import com.cg.model.dto.CustomerDepositResDTO;
import com.cg.model.dto.DepositResDTO;
import com.cg.repository.ICustomerRepository;
import com.cg.repository.IDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class HistoryServiceImpl implements IHistoryService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private IDepositRepository depositRepository;


    @Override
    public CustomerDepositResDTO getInfoAndDeposits(Customer customer) {

        CustomerDepositResDTO customerDepositResDTO = customer.toCustomerDepositResDTO();

//        List<Deposit> deposits = customer.getDeposits();

        List<DepositResDTO> depositResDTOS = depositRepository.findAllDepositResDTOS(customer);

//        for (Deposit item : deposits) {
//            DepositResDTO depositResDTO = new DepositResDTO();
//            depositResDTO.setId(item.getId());
//            depositResDTO.setTransactionAmount(item.getTransactionAmount());
//            depositResDTO.setCreatedAt(item.getCreatedAt());
//            depositResDTOS.add(depositResDTO);
//        }

        customerDepositResDTO.setDeposits(depositResDTOS);

        return customerDepositResDTO;
    }
}
