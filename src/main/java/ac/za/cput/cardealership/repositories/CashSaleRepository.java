package ac.za.cput.cardealership.repositories;


import ac.za.cput.cardealership.domain.CashSale;



public interface CashSaleRepository{

    CashSale create(CashSale cashSale);

    CashSale read(String payType);

    CashSale update(CashSale cashSale);

    void delete(String payType);
}
