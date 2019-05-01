package ac.za.cput.cardealership.domain;

public class CashSale extends Sale{

    private String payType;

    public String getPayType() {
        return payType;
    }

    public CashSale(Builder builder, String payType) {
        super(builder);
        this.payType = payType;
    }
}
