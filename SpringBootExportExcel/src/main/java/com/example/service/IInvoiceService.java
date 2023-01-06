package com.example.service;

/*
    created by Atiye Mousavi
    Date: 1/6/2023
    Time: 3:52 PM
*/


import com.example.entity.Invoice;

import java.util.List;

public interface IInvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}