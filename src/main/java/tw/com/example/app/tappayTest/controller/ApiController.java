package tw.com.example.app.tappayTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tw.com.example.app.tappayTest.feign.*;

@RestController
@RequestMapping("/tpc")
public class ApiController {

    @Autowired
    private TappayFeignClient tappayFeignClient;

    @PostMapping("/payment/pay-by-prime")
    public ResponseEntity<PayByPrimeRS> payByPrime(@RequestBody PayByPrimeRQ payByPrimeRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(payByPrimeRQ);
        PayByPrimeRS payByPrimeRs = tappayFeignClient.payByPrime(payByPrimeRQ, apikey);
        System.out.println(payByPrimeRs);
        return new ResponseEntity<>(payByPrimeRs, HttpStatus.OK);
    }

    @PostMapping("/payment/pay-by-token")
    public ResponseEntity<PayByTokenRS> payByToken(@RequestBody PayByTokenRQ payByTokenRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(payByTokenRQ);
        PayByTokenRS payByTokenRS = tappayFeignClient.payByToken(payByTokenRQ, apikey);
        System.out.println(payByTokenRS);
        return new ResponseEntity<>(payByTokenRS, HttpStatus.OK);
    }

    @PostMapping("/transaction/query")
    public ResponseEntity<RecordRS> record(@RequestBody RecordRQ recordRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(recordRQ);
        RecordRS recordRS = tappayFeignClient.record(recordRQ, apikey);
        System.out.println(recordRS);
        return new ResponseEntity<>(recordRS, HttpStatus.OK);
    }

    @PostMapping("/transaction/refund")
    public ResponseEntity<RefundRS> refund(@RequestBody RefundRQ refundRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(refundRQ);
        RefundRS refundRS = tappayFeignClient.refund(refundRQ, apikey);
        System.out.println(refundRS);
        return new ResponseEntity<>(refundRS, HttpStatus.OK);
    }

}
