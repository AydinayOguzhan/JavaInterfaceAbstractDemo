package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Adapters.MernisServiceAdapter;
import com.company.Concrete.PersonCheckManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.entity.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setDateOfBirth(new Date(2999, Calendar.APRIL,23));
        customer.setFirstName("Oğuzhan");
        customer.setLastName("Aydınay");
        customer.setNationalityId("18434224480");
        customer.setId(1);

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.save(customer);
    }
}
