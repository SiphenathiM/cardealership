package ac.za.cput.cardealership.repositories.impl;


import ac.za.cput.cardealership.domain.CashSale;
import ac.za.cput.cardealership.repositories.CashSaleRepository;

import java.util.HashMap;
import java.util.Map;

public class CashSaleRepositoryImpl implements CashSaleRepository {

    private static CashSaleRepositoryImpl respository = null;

    private Map<String, CashSale> cashSaleTable;

    private CashSaleRepositoryImpl() {
        cashSaleTable = new HashMap<String, CashSale>();
    }

    public static CashSaleRepositoryImpl getInstance(){
        if(respository==null)
            respository = new CashSaleRepositoryImpl();
        return respository;
    }

    @Override
    public CashSale create(CashSale cashSale) {
        cashSaleTable.put( cashSale.getPayType(), cashSale);
        CashSale savedCashSales= cashSaleTable.get( cashSale.getPayType());
        return savedCashSales;
    }

    @Override
    public CashSale read(String payType) {
        CashSale cashSale  =  cashSaleTable.get(payType);
        return cashSale ;
    }

    @Override
    public CashSale update(CashSale cashSale) {
        cashSaleTable.put(cashSale.getPayType(),cashSale);
        CashSale savedCashSale = cashSaleTable.get(cashSale.getPayType());
        return savedCashSale;
    }

    @Override
    public void delete(String payType) {
        cashSaleTable.remove(payType);
    }
}
