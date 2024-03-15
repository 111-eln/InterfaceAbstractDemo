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
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.FirstName = "Elnur";
        customer.LastName = "Akkurt";
        customer.DateOfBirth = new Date(2001, 12, 25);
        customer.id = 1;
        

        customerManager.Save(customer);
    }






        }






