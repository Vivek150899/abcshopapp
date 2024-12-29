package com.abcshopapp.dao;

import java.util.List;
import com.abcshopapp.dto.Invoice;

public interface InvoiceDao {

    // Method to save an invoice to the database
    void save(Invoice invoice);
    
    // Method to fetch an invoice by its ID
    Invoice findById(int invoiceNo);
    
    // Method to fetch all invoices
    List<Invoice> findAll();
}
