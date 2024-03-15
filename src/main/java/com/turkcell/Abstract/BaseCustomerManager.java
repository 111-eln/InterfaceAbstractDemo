package com.turkcell.Abstract;

import com.turkcell.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public  void  Save(Customer customer) {
         System.out.println("Saved to db:"+customer.FirstName);
    }
}
