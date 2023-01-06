package com.example.service;

/*
    created by Atiye Mousavi
    Date: 1/6/2023
    Time: 7:51 PM
*/


import com.example.model.Invoice;

import java.util.List;

public interface IInvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}