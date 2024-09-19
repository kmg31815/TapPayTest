package tw.com.example.app.tappayTest.feign;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayByPrimeRQ {

    private String partner_key;
    private String prime;
    private String amount;
    private String merchant_id;
    private String details;
    private Boolean three_domain_secure;
    private Cardholder cardholder;

    @Setter
    @Getter
    public static class Cardholder {
        private String phone_number;
        private String name;
        private String email;
        private String zip_code;
        private String address;
        private String national_id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PayByPrimeRQ [").append("partner_key=").append(partner_key);
        builder.append(", prime=").append(prime);
        builder.append(", amount=").append(amount);
        builder.append(", merchant_id=").append(merchant_id);
        builder.append(", details=").append(details);
        builder.append(", three_domain_secure=").append(three_domain_secure);
        builder.append(", cardholder=").append(cardholder);
        builder.append("]");
        return builder.toString();
    }
}
