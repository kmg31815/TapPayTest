package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefundRS {

    @JsonProperty(value = "msg")
    private String msg;
    @JsonProperty(value = "bank_result_code")
    private String bankResultCode;
    @JsonProperty(value = "bank_result_msg")
    private String bankResultMsg;
    @JsonProperty(value = "refund_amount")
    private int refundAmount;
    @JsonProperty(value = "is_captured")
    private boolean isCaptured;
    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "refund_id")
    private String refundId;
    @JsonProperty(value = "status")
    private int status;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RefundRS [").append("msg=").append(msg);
        builder.append(", bankResultCode=").append(bankResultCode);
        builder.append(", bankResultMsg=").append(bankResultMsg);
        builder.append(", refundAmount=").append(refundAmount);
        builder.append(", isCaptured=").append(isCaptured);
        builder.append(", currency=").append(currency);
        builder.append(", refundId=").append(refundId);
        builder.append(", status=").append(status);
        builder.append("]");
        return builder.toString();
    }
}
