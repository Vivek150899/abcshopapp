package com.abcshopapp.service;

import java.util.List;
import com.abcshopapp.dto.Invoice;

public interface InvoiceService {

    // Method to create and save an invoice
    void createInvoice(Invoice invoice);
    
    // Method to get an invoice by its ID
    double calculateOrderAmount(int invoiceNo, int qty,int gst);
    
    // Method to get all invoices
    List<Invoice> getAllInvoices();

	
}
