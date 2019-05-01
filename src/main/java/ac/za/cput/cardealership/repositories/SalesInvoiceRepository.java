package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Sale;
import ac.za.cput.cardealership.domain.SalesInvoice;

import java.util.Set;

public interface SalesInvoiceRepository {

    SalesInvoice create(SalesInvoice salesInvoice);

    SalesInvoice read(String invoiceID);

    SalesInvoice update(SalesInvoice salesInvoice);

    void delete(String invoiceID);
}
