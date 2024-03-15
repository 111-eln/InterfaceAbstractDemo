package com.turkcell.Concrete;

import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
