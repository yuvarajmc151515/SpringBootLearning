package Mac.SpringlearningBasics.Pojo;


public class IncomeResponse {
    private double taxAmount;

    public IncomeResponse(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }
}
