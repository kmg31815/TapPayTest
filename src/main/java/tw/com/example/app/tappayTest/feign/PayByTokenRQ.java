package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayByTokenRQ {

    @JsonProperty(value = "card_key")
    private String cardKey;
    @JsonProperty(value = "card_token")
    private String cardToken;
    @JsonProperty(value = "partner_key")
    private String partnerKey;
    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "merchant_id")
    private String merchantId;
    @JsonProperty(value = "details")
    private String details;
    @JsonProperty(value = "amount")
    private String amount;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PayByTokenRQ [").append("cardKey=").append(cardKey);
        builder.append(", cardToken=").append(cardToken);
        builder.append(", partnerKey=").append(partnerKey);
        builder.append(", currency=").append(currency);
        builder.append(", merchantId=").append(merchantId);
        builder.append(", details=").append(details);
        builder.append(", amount=").append(amount);
        builder.append("]");
        return builder.toString();
    }
}
