package com.turkcell.Adapters;

import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Entities.Customer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
       return  true;

        }


    }

