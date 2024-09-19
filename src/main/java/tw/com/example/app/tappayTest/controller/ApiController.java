package tw.com.example.app.tappayTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tw.com.example.app.tappayTest.feign.*;

@RestController
public class ApiController {

    @Autowired
    private TappayFeignClient tappayFeignClient;

    @PostMapping("/pay-by-prime")
    public ResponseEntity<PayByPrimeRS> payByPrimeTest(@RequestBody PayByPrimeRQ payByPrimeRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(payByPrimeRQ);
        PayByPrimeRS payByPrimeRs = tappayFeignClient.payByPrime(payByPrimeRQ, apikey);
        System.out.println(payByPrimeRs);
        return new ResponseEntity<>(payByPrimeRs, HttpStatus.OK);
    }

    @PostMapping("/record")
    public ResponseEntity<RecordRS> recordTest(@RequestBody RecordRQ recordRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(recordRQ);
        RecordRS recordRS = tappayFeignClient.record(recordRQ, apikey);
        System.out.println(recordRS);
        return new ResponseEntity<>(recordRS, HttpStatus.OK);
    }

    @PostMapping("/refund")
    public ResponseEntity<RefundRS> refundTest(@RequestBody RefundRQ refundRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(refundRQ);
        RefundRS refundRS = tappayFeignClient.refund(refundRQ, apikey);
        System.out.println(refundRS);
        return new ResponseEntity<>(refundRS, HttpStatus.OK);
    }

}
