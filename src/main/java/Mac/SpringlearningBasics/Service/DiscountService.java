package Mac.SpringlearningBasics.Service;





import Mac.SpringlearningBasics.Pojo.DiscountResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    private static final Logger log = LoggerFactory.getLogger(DiscountService.class);

    public DiscountResponse calculateDiscount(String customerType, double purchaseAmount) {

        log.info("Calculating discount | customerType={}, purchaseAmount={}",
                customerType, purchaseAmount);

        int discountPercentage = 0;

        if ("premium".equalsIgnoreCase(customerType)) {

            if (purchaseAmount >= 15000) {
                discountPercentage = 20;
            } else {
                discountPercentage = 10;
            }

        } else if ("regular".equalsIgnoreCase(customerType)) {

            if (purchaseAmount >= 5000) {
                discountPercentage = 10;
            } else {
                discountPercentage = 0;
            }

        } else {
            log.error("Invalid customerType received: {}", customerType);
            throw new IllegalArgumentException("Invalid customer type: " + customerType);
        }

        double finalAmount =
                purchaseAmount - (purchaseAmount * discountPercentage / 100.0);

        log.info("Discount applied | discountPercentage={}, finalAmount={}",
                discountPercentage, finalAmount);

        return new DiscountResponse(
                customerType,
                purchaseAmount,
                discountPercentage,
                finalAmount
        );
    }
}

