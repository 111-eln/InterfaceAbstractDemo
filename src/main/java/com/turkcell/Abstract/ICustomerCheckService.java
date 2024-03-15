package com.turkcell.Abstract;

import com.turkcell.Entities.Customer;

public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
