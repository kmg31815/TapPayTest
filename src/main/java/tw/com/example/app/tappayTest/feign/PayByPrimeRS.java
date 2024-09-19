package tw.com.example.app.tappayTest.feign;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayByPrimeRS {

    private int status;
    private String msg;
    private int amount;
    private String acquirer;
    private String currency;
    private String rec_trade_id;
    private String bank_transaction_id;
    private String order_number;
    private String auth_code;
    private CardInfo card_info;
    private long transaction_time_millis;
    private BankTransactionTime bank_transaction_time;
    private String bank_result_code;
    private String bank_result_msg;
    private String card_identifier;
    private String merchant_id;
    private boolean is_rba_verified;
    private TransactionMethodDetails transaction_method_details;

    @Setter
    @Getter
    private static class BankTransactionTime{
        private String start_time_millis;
        private String end_time_millis;
    }

    @Setter
    @Getter
    private static class CardInfo{
        private String issuer;
        private int funding;
        private int type;
        private String level;
        private String country;
        private String last_four;
        private String bin_code;
        private String issuer_zh_tw;
        private String bank_id;
        private String country_code;
    }

    @Setter
    @Getter
    private static class TransactionMethodDetails{
        private String transaction_method_reference;
        private String transaction_method;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PayByPrimeRS [").append("status=").append(status);
        builder.append(", msg=").append(msg);
        builder.append(", amount=").append(amount);
        builder.append(", acquirer=").append(acquirer);
        builder.append(", currency=").append(currency);
        builder.append(", rec_trade_id=").append(rec_trade_id);
        builder.append(", bank_transaction_id=").append(bank_transaction_id);
        builder.append(", order_number=").append(order_number);
        builder.append(", auth_code=").append(auth_code);
        builder.append(", card_info=").append(card_info);
        builder.append(", transaction_time_millis=").append(transaction_time_millis);
        builder.append(", bank_transaction_time=").append(bank_transaction_time);
        builder.append(", bank_result_code=").append(bank_result_code);
        builder.append(", bank_result_msg=").append(bank_result_msg);
        builder.append(", card_identifier=").append(card_identifier);
        builder.append(", merchant_id=").append(merchant_id);
        builder.append(", is_rba_verified=").append(is_rba_verified);
        builder.append(", transaction_method_details=").append(transaction_method_details);
        builder.append("]");
        return builder.toString();
    }
}
