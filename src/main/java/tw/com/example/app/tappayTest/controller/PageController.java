package tw.com.example.app.tappayTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/pay")
    public String payPage() {
        return "pay_page";
    }

}
