package ac.za.cput.cardealership.repositories.finance;


import ac.za.cput.cardealership.domain.finance.CashSale;



public interface CashSaleRepository{

    CashSale create(CashSale cashSale);

    CashSale read(String payType);

    CashSale update(CashSale cashSale);

    void delete(String payType);
}
