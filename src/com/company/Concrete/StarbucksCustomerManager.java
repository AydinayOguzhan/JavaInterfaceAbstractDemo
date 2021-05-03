package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.CustomerService;
import com.company.Abstract.PersonCheckService;
import com.company.entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    PersonCheckService personCheckService;

    public StarbucksCustomerManager(PersonCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (personCheckService.CheckIfRealPerson(customer))
            super.save(customer);
        else
            System.out.println("Not a real person");
    }
}
