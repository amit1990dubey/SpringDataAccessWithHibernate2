package com.ibm.spring.hibernate;

import java.util.List;

public interface CustomerDAO {

    public void addCustomer(CustomerTO cto);

    public void updateCustomer(CustomerTO cto);

    public void deleteCustomer(int cid);

    public List<CustomerTO> getAllCustomers();

    public CustomerTO getCustomerByCid(int cid);

    public List<CustomerTO> getCustomerByCity(String city);

    public int getCustomersCount();

    public String getCustomerCityByEmail(String email);

    public Long getCustomerPhoneByEmail(String email);

    public CustomerTO getCustomerByEmail(String email);


}
