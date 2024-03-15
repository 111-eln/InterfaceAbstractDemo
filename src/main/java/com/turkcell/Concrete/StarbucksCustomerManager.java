package com.turkcell.Concrete;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Entities.Customer;

import javax.naming.InvalidNameException;

public class StarbucksCustomerManager extends BaseCustomerManager  {
    private ICustomerCheckService _customercheckservice;

    public StarbucksCustomerManager(ICustomerCheckService customercheckservice) {
        _customercheckservice = customercheckservice;
    }

    @Override
    public void Save(Customer customer)  {
        if(_customercheckservice.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else{
            System.out.println("gecersiz");
        }

    }


}
