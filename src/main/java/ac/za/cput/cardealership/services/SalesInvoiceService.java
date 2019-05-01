package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.SalesInvoice;

public interface SalesInvoiceService {

    SalesInvoice create(SalesInvoice salesInvoice);

    SalesInvoice read(String invoiceID);

    SalesInvoice update(SalesInvoice salesInvoice);

    void delete(String invoiceID);
}
