package tw.com.example.app.tappayTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/pay")
    public String payPage() {
        return "pay_page";
    }

    @RequestMapping("/record")
    public String recordPage() {
        return "record_page";
    }

    @RequestMapping("/payment")
    public String paymentPage() {
        return "payment_page";
    }

}
