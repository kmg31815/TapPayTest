package tw.com.example.app.tappayTest.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "TapPay", url = "https://sandbox.tappaysdk.com/tpc")
public interface TappayFeignClient {

    @PostMapping("/payment/pay-by-prime")
    PayByPrimeRS payByPrime(@RequestBody PayByPrimeRQ payByPrimeRQ, @RequestHeader("x-api-key") String apikey);

    @PostMapping("/transaction/query")
    RecordRS record(@RequestBody RecordRQ recordRQ, @RequestHeader("x-api-key") String apikey);

    @PostMapping("/transaction/refund")
    RefundRS refund(@RequestBody RefundRQ refundRQ, @RequestHeader("x-api-key") String apikey);

}
