package com.company.Adapters;

import com.company.Abstract.PersonCheckService;
import com.company.entity.Customer;

public class MernisServiceAdapter implements PersonCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
