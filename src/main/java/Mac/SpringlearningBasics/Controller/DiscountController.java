package Mac.SpringlearningBasics.Controller;


import Mac.SpringlearningBasics.Pojo.DiscountRequest;
import Mac.SpringlearningBasics.Pojo.DiscountResponse;
import Mac.SpringlearningBasics.Service.DiscountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discount")
public class DiscountController {

    private static final Logger log = LoggerFactory.getLogger(DiscountController.class);

    @Autowired
    DiscountService discountService;

    @PostMapping("/check")
    public DiscountResponse calculateDiscount(@RequestBody DiscountRequest discountRequest) {
        log.info("Discount request is received |customerTye={},purchaseAmount={}",
                discountRequest.getCustomerType(), discountRequest.getPurchaseAmount());

        DiscountResponse discountResponse = discountService.calculateDiscount(discountRequest.getCustomerType(),
                discountRequest.getPurchaseAmount());
        log.info("Discount response sent | finalAmount ={},discountPercentage={}",
                discountResponse.getFinalAmount(),discountResponse.getDiscountPercentage());
        return discountResponse;
    }
}




