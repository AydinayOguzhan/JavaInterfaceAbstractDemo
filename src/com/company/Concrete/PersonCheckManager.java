package com.company.Concrete;

import com.company.Abstract.PersonCheckService;
import com.company.entity.Customer;

public class PersonCheckManager implements PersonCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
