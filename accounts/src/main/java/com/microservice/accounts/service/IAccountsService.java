package com.microservice.accounts.service;

import com.microservice.accounts.dto.AccountsDto;
import com.microservice.accounts.dto.CustomerDto;

public interface  IAccountsService {
/**
*
*@param customerDto - CustomerDto object
* */
    void createAccount(CustomerDto accountsDto);
}
