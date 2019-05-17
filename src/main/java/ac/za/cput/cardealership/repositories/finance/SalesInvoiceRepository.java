package ac.za.cput.cardealership.repositories.finance;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;

public interface SalesInvoiceRepository {

    SalesInvoice create(SalesInvoice salesInvoice);

    SalesInvoice read(String invoiceID);

    SalesInvoice update(SalesInvoice salesInvoice);

    void delete(String invoiceID);
}
