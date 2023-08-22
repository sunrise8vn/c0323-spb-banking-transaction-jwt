package com.cg.service.history;

import com.cg.model.Customer;
import com.cg.model.dto.CustomerDepositResDTO;

public interface IHistoryService {

    CustomerDepositResDTO getInfoAndDeposits(Customer customer);
}
