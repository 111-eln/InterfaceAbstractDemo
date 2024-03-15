package com.turkcell;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Adapters.MernisServiceAdapter;
import com.turkcell.Concrete.NeroCustomerManager;
import com.turkcell.Concrete.StarbucksCustomerManager;
import com.turkcell.Entities.Customer;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
      //  BaseCustomerManager customerManager = new NeroCustomerManager();
        BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.FirstName = "Elnur";
        customer.LastName = "Akkurt";
        customer.DateOfBirth = "2001";
        customer.id = 1;
        customer.NationalityId="123698547";
        customerManager2.Save(customer);


    }






        }






