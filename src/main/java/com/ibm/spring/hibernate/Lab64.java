package com.ibm.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Lab64 {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ibmindia.xml");
        CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

        CustomerTO cto = new CustomerTO(483, "srini", "s@ibm.com", 7768686, "Bangalore");
        cdao.addCustomer(cto);


        //2. updateCustomer

        CustomerTO cto1 = new CustomerTO(484, "vyankat", "v@ibm.com", 87767676, "Bangalore");
        cdao.addCustomer(cto1);

        //3. delete Customer
        cdao.deleteCustomer(477);
        System.out.println("Check Your Database");

        //4. grtCustomerByCid
        System.out.println("getCustomerByCid");
        cto = cdao.getCustomerByCid(481);
        System.out.println(cto);

        //5. getALL Customers

        System.out.println("getallCustomers");
        List<CustomerTO> list = cdao.getAllCustomers();

        for (CustomerTO ct : list) {
            System.out.println(ct);
        }


        //6. getAll customerByEmail
        System.out.println("getCustomerByEmail");
        cto = cdao.getCustomerByEmail("a@gmail.com");
        System.out.println(cto);


        //7. getcustomerByCity

        System.out.println("getCustomerByCity");
        list = cdao.getCustomerByCity("bangalore");
        for(CustomerTO ct : list)
        {
            System.out.println(ct);
        }

        //8. get customer Bycount
        System.out.println("get customer By Count");
        int count = cdao.getCustomersCount();
        System.out.println("No of cust:" +count);


        //9. getCustomerCityByEmail
        System.out.println("getCoustomerCityByEmail");
        String ci = cdao.getCustomerCityByEmail("a@ibm.com");
        System.out.println(ci);


        //10 getCustomerPhoneByemail

        System.out.println("getCustomerPhoneByEmail");
        long ph = cdao.getCustomerPhoneByEmail("a@gmail.com");
        System.out.println(ph);
        


    }
}
