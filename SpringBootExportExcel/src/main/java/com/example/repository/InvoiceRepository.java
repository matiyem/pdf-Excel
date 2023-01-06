package com.example.repository;

/*
    created by Atiye Mousavi
    Date: 1/6/2023
    Time: 3:48 PM
*/


import com.example.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}