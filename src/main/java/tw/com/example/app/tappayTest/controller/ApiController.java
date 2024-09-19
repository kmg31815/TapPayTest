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

    @PostMapping("/pay-by-prime-test")
    public ResponseEntity<PayByPrimeRS> payByPrimeTest(@RequestBody PayByPrimeRQ payByPrimeRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(payByPrimeRQ);
        PayByPrimeRS payByPrimeRs = tappayFeignClient.payByPrime(payByPrimeRQ, apikey);
        System.out.println(payByPrimeRs);
        return new ResponseEntity<>(payByPrimeRs, HttpStatus.OK);
    }

    @PostMapping("/pay-by-prime")
    public ResponseEntity<PayByPrimeRS> payByPrime(@RequestParam String prime) {
        PayByPrimeRQ payByPrimeRQ = new PayByPrimeRQ();
        payByPrimeRQ.setPrime(prime);
        payByPrimeRQ.setPartner_key("partner_vvmqxiKUMilxJOUzzxCPpqWa3m2HbC25tK9Or7QZ8qfUItmYnWDb1QfB");
        payByPrimeRQ.setMerchant_id("sherry_CTBC");
        payByPrimeRQ.setAmount("999");
        payByPrimeRQ.setDetails("something");
//        payByPrimeRQ.setThree_domain_secure(true);
        PayByPrimeRQ.Cardholder cardholder = new PayByPrimeRQ.Cardholder();
        cardholder.setPhone_number("+886923456789");
        cardholder.setName("王小明");
        cardholder.setEmail("LittleMing@Wang.com");
        cardholder.setZip_code("100");
        cardholder.setAddress("台北市天龍區芝麻街1號1樓");
        cardholder.setNational_id("A123456789");
        payByPrimeRQ.setCardholder(cardholder);
        PayByPrimeRS payByPrimeRs = tappayFeignClient.payByPrime(payByPrimeRQ, "partner_vvmqxiKUMilxJOUzzxCPpqWa3m2HbC25tK9Or7QZ8qfUItmYnWDb1QfB");
        System.out.println(payByPrimeRs);
        return new ResponseEntity<>(payByPrimeRs, HttpStatus.OK);
    }

    @PostMapping("/record-test")
    public ResponseEntity<RecordRS> recordTest(@RequestBody RecordRQ recordRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(recordRQ);
        RecordRS recordRS = tappayFeignClient.record(recordRQ, apikey);
        System.out.println(recordRS);
        return new ResponseEntity<>(recordRS, HttpStatus.OK);
    }

    @PostMapping("/record")
    public ResponseEntity<RecordRS> record(@RequestParam("record_id") String recordId) {
        RecordRQ recordRQ = new RecordRQ();
        recordRQ.setPartnerKey("partner_vvmqxiKUMilxJOUzzxCPpqWa3m2HbC25tK9Or7QZ8qfUItmYnWDb1QfB");
        RecordRQ.Filters filters = new RecordRQ.Filters();
        filters.setTime(new RecordRQ.Time(1726481540000L, 1727691115000L));
        filters.setRecTradeId(recordId);
        recordRQ.setFilters(filters);
        RecordRS recordRS = tappayFeignClient.record(recordRQ, "partner_vvmqxiKUMilxJOUzzxCPpqWa3m2HbC25tK9Or7QZ8qfUItmYnWDb1QfB");
        System.out.println(recordRS);
        return new ResponseEntity<>(recordRS, HttpStatus.OK);
    }

    @PostMapping("/refund-test")
    public ResponseEntity<RefundRS> refundTest(@RequestBody RefundRQ refundRQ, @RequestHeader("x-api-key") String apikey) {
        System.out.println(refundRQ);
        RefundRS refundRS = tappayFeignClient.refund(refundRQ, apikey);
        System.out.println(refundRS);
        return new ResponseEntity<>(refundRS, HttpStatus.OK);
    }

    @PostMapping("/refund")
    public ResponseEntity<RefundRS> refund(@RequestParam("rec_trade_id") String recordId) {
        RefundRQ refundRQ = new RefundRQ();
        refundRQ.setPartnerKey("partner_vvmqxiKUMilxJOUzzxCPpqWa3m2HbC25tK9Or7QZ8qfUItmYnWDb1QfB");
        refundRQ.setRecTradeId(recordId);
        RefundRS refundRS = tappayFeignClient.refund(refundRQ, "partner_vvmqxiKUMilxJOUzzxCPpqWa3m2HbC25tK9Or7QZ8qfUItmYnWDb1QfB");
        System.out.println(refundRS);
        return new ResponseEntity<>(refundRS, HttpStatus.OK);
    }

}
