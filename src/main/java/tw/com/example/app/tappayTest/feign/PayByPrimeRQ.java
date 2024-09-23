package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayByPrimeRQ {

    @JsonProperty(value = "partner_key")
    private String partnerKey;
    @JsonProperty(value = "prime")
    private String prime;
    @JsonProperty(value = "amount")
    private String amount;
    @JsonProperty(value = "merchant_id")
    private String merchantId;
    @JsonProperty(value = "details")
    private String details;
    @JsonProperty(value = "three_domain_secure")
    private Boolean threeDomainSecure;
    @JsonProperty(value = "result_url")
    private ResultUrl resultUrl;
    @JsonProperty(value = "cardholder")
    private Cardholder cardholder;
    @JsonProperty(value = "remember")
    private Boolean remember;

    @Setter
    @Getter
    private static class ResultUrl {
        @JsonProperty(value = "frontend_redirect_url")
        private String frontendRedirectUrl;
        @JsonProperty(value = "backend_notify_url")
        private String backendNotifyUrl;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("ResultUrl [").append("frontendRedirectUrl=").append(frontendRedirectUrl);
            builder.append(", backendNotifyUrl=").append(backendNotifyUrl);
            builder.append("]");
            return builder.toString();
        }
    }

    @Setter
    @Getter
    private static class Cardholder {
        @JsonProperty(value = "phone_number")
        private String phoneNumber;
        @JsonProperty(value = "name")
        private String name;
        @JsonProperty(value = "email")
        private String email;
        @JsonProperty(value = "zip_code")
        private String zipCode;
        @JsonProperty(value = "address")
        private String address;
        @JsonProperty(value = "national_id")
        private String nationalId;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Cardholder [").append("phoneNumber=").append(phoneNumber);
            builder.append(", name=").append(name);
            builder.append(", email=").append(email);
            builder.append(", zipCode=").append(zipCode);
            builder.append(", address=").append(address);
            builder.append(", nationalId=").append(nationalId);
            builder.append("]");
            return builder.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PayByPrimeRQ [").append("partnerKey=").append(partnerKey);
        builder.append(", prime=").append(prime);
        builder.append(", amount=").append(amount);
        builder.append(", merchantId=").append(merchantId);
        builder.append(", details=").append(details);
        builder.append(", threeDomainSecure=").append(threeDomainSecure);
        builder.append(", resultUrl=").append(resultUrl);
        builder.append(", cardholder=").append(cardholder);
        builder.append(", remember=").append(remember);
        builder.append("]");
        return builder.toString();
    }
}
