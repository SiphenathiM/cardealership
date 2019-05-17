package ac.za.cput.cardealership.domain.product;

public class PartUsed {

    private String partsUsedID;
    private int numberUsed;
    private double price;

    public String getPartsUsedID() {
        return partsUsedID;
    }

    public int getNumberUsed() {
        return numberUsed;
    }

    public double getPrice() {
        return price;
    }

    public PartUsed(Builder builder) {

        this.partsUsedID= builder.partsUsedID;
        this. numberUsed  = builder. numberUsed ;
        this.price  = builder.price ;

    }
    public static class Builder {

        private String partsUsedID;
        private int numberUsed;
        private double price;


        public Builder partsUsedID(String partsUsedID) {
            this.partsUsedID = partsUsedID;
            return this;
        }
        public Builder numberUsed(int numberUsed) {
            this.numberUsed = numberUsed;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public PartUsed build() {
            return new PartUsed(this);

        }
    }
}
