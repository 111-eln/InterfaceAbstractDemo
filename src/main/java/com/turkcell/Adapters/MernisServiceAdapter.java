package com.turkcell.Adapters;

import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Entities.Customer;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        try {
            String url = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?op=TCKimlikNoDogrula";
            URL obj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
            String xml = String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                    "  <soap12:Body>\n" +
                    "    <TCKimlikNoDogrula xmlns=\"http://tckimlik.nvi.gov.tr/WS\">\n" +
                    "      <TCKimlikNo>%s</TCKimlikNo>\n" +
                    "      <Ad>%s</Ad>\n" +
                    "      <Soyad>%s</Soyad>\n" +
                    "      <DogumYili>%s</DogumYili>\n" +
                    "    </TCKimlikNoDogrula>\n" +
                    "  </soap12:Body>\n" +
                    "</soap12:Envelope>",customer.NationalityId,customer.FirstName,customer.LastName,customer.DateOfBirth);
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(xml);
            wr.flush();
            wr.close();
            String responseStatus = con.getResponseMessage();
            System.out.println(responseStatus);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputline;
            StringBuffer response = new StringBuffer();
            while ((inputline = in.readLine()) != null) {
                response.append(inputline);
            }
            in.close();
            //System.out.println("response:" + response.toString());
           // System.out.println("response:" + response.toString().substring(306, 310));
            if (response.toString().substring(306, 310).equals("true")) {

                return true;
            } else {

                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;

        }


    }
    }

