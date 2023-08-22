package com.cg.api;


import com.cg.exception.DataInputException;
import com.cg.model.Customer;
import com.cg.model.dto.CustomerDepositResDTO;
import com.cg.service.customer.ICustomerService;
import com.cg.service.history.IHistoryService;
import com.cg.utils.ValidateUtils;
import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/histories")
public class HistoryApi {

    @Autowired
    private IHistoryService historyService;

    @Autowired
    private ICustomerService customerService;


    @GetMapping("/{id}")
    public ResponseEntity<?> getInfoAndDeposits(@PathVariable String id) {

        if (!ValidateUtils.isNumberValid(id)) {
            throw new DataInputException("Mã khách hàng không hợp lệ");
        }

        Customer customer = customerService.findById(Long.parseLong(id)).orElseThrow(() -> {
           throw new DataInputException("Mã khách hàng không tồn tại");
        });

        CustomerDepositResDTO customerDepositResDTO = historyService.getInfoAndDeposits(customer);

        return new ResponseEntity<>(customerDepositResDTO, HttpStatus.OK);
    }
}
