package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefundRQ {

    @JsonProperty(value = "partner_key")
    private String partnerKey;

    @JsonProperty(value = "rec_trade_id")
    private String recTradeId;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RefundRQ [").append("partnerKey=").append(partnerKey);
        builder.append(", recTradeId=").append(recTradeId);
        builder.append("]");
        return builder.toString();
    }
}
