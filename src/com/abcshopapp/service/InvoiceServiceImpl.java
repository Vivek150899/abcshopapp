package com.abcshopapp.service;

import java.util.List;
import com.abcshopapp.dao.InvoiceDao;
import com.abcshopapp.dao.InvoiceDaoImpl;
import com.abcshopapp.dao.ProductDao;
import com.abcshopapp.dao.ProductDaoImpl;
import com.abcshopapp.dto.Invoice;
import com.abcshopapp.dto.Product;

public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceDao invoiceDao = new InvoiceDaoImpl();

	@Override
	public void createInvoice(Invoice invoice) {
		
		
	}

	@Override
	public double calculateOrderAmount(int invoiceNo, int qty, int gst) {
         InvoiceDao invoiceDao = new InvoiceDaoImpl();
		
		Invoice Invoice = invoiceDao.findById(invoiceNo);
		
		double totalCost = Invoice.getUnitPrice() * qty;
		
		
		double orderAmount = totalCost+((totalCost*gst)/100);
		
		
		return orderAmount;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		
		return null;
	}

	

    
}
