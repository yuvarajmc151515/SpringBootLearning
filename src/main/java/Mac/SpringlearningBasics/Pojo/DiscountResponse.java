package Mac.SpringlearningBasics.Pojo;

public class DiscountResponse {

    private String customerType;
    private double purchaseAmount;
    private int discountPercentage;
    private double finalAmount;

    public DiscountResponse(String customerType, double purchaseAmount, int discountPercentage, double finalAmount) {
        this.customerType = customerType;
        this.purchaseAmount = purchaseAmount;
        this.discountPercentage = discountPercentage;
        this.finalAmount = finalAmount;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public double getFinalAmount() {
        return finalAmount;
    }
}
