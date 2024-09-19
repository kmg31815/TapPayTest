package tw.com.example.app.tappayTest.feign;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RefundRS {

    private String msg;
    private String bank_result_code;
    private String bank_result_msg;
    private int refund_amount;
    private boolean is_captured;
    private String currency;
    private String refund_id;
    private int status;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RefundRS [").append("msg=").append(msg);
        builder.append(", bank_result_code=").append(bank_result_code);
        builder.append(", bank_result_msg=").append(bank_result_msg);
        builder.append(", refund_amount=").append(refund_amount);
        builder.append(", is_captured=").append(is_captured);
        builder.append(", currency=").append(currency);
        builder.append(", refund_id=").append(refund_id);
        builder.append(", status=").append(status);
        builder.append("]");
        return builder.toString();
    }
}
