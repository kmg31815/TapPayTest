package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayByTokenRS {

    @JsonProperty(value = "status")
    private int status;
    @JsonProperty(value = "msg")
    private String msg;
    @JsonProperty(value = "amount")
    private int mount;
    @JsonProperty(value = "acquirer")
    private String acquirer;
    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "rec_trade_id")
    private String recTradeId;
    @JsonProperty(value = "bank_transaction_id")
    private String bankTransactionId;
    @JsonProperty(value = "order_number")
    private String orderNumber;
    @JsonProperty(value = "auth_code")
    private String authCode;
    @JsonProperty(value = "card_info")
    private CardInfo cardInfo;
    @JsonProperty(value = "transaction_time_millis")
    private long transactionTimeMillis;
    @JsonProperty(value = "bank_transaction_time")
    private BankTransactionTime bankTransactionTime;
    @JsonProperty(value = "bank_result_code")
    private String bankResultCode;
    @JsonProperty(value = "bank_result_msg")
    private String bankResultMsg;
    @JsonProperty(value = "payment_url")
    private String paymentUrl;
    @JsonProperty(value = "card_identifier")
    private String cardIdentifier;
    @JsonProperty(value = "merchant_id")
    private String merchantId;
    @JsonProperty(value = "is_rba_verified")
    private boolean isRbaVerified;
    @JsonProperty(value = "transaction_method_details")
    private TransactionMethodDetails transactionMethodDetails;

    @Setter
    @Getter
    private static class BankTransactionTime {
        @JsonProperty(value = "start_time_millis")
        private String startTimeMillis;
        @JsonProperty(value = "end_time_millis")
        private String endTimeMillis;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("BankTransactionTime [").append("startTimeMillis=").append(startTimeMillis);
            builder.append(", endTimeMillis=").append(endTimeMillis);
            builder.append("]");
            return builder.toString();
        }
    }

    @Setter
    @Getter
    private static class CardInfo {
        @JsonProperty(value = "issuer")
        private String issuer;
        @JsonProperty(value = "funding")
        private int funding;
        @JsonProperty(value = "type")
        private int type;
        @JsonProperty(value = "level")
        private String level;
        @JsonProperty(value = "country")
        private String country;
        @JsonProperty(value = "last_four")
        private String lastfour;
        @JsonProperty(value = "bin_code")
        private String binCode;
        @JsonProperty(value = "issuer_zh_tw")
        private String issuerZhTw;
        @JsonProperty(value = "bank_id")
        private String bankId;
        @JsonProperty(value = "country_code")
        private String countryCode;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("CardInfo [").append("issuer=").append(issuer);
            builder.append(", funding=").append(funding);
            builder.append(", type=").append(type);
            builder.append(", level=").append(level);
            builder.append(", country=").append(country);
            builder.append(", lastfour=").append(lastfour);
            builder.append(", binCode=").append(binCode);
            builder.append(", issuerZhTw=").append(issuerZhTw);
            builder.append(", bankId=").append(bankId);
            builder.append(", countryCode=").append(countryCode);
            builder.append("]");
            return builder.toString();
        }
    }

    @Setter
    @Getter
    private static class TransactionMethodDetails {
        @JsonProperty(value = "transaction_method_reference")
        private String transactionMethodReference;
        @JsonProperty(value = "transaction_method")
        private String transactionMethod;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("TransactionMethodDetails [").append("transactionMethodReference=").append(transactionMethodReference);
            builder.append(", transactionMethod=").append(transactionMethod);
            builder.append("]");
            return builder.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PayByTokenRS [").append("status=").append(status);
        builder.append(", msg=").append(msg);
        builder.append(", mount=").append(mount);
        builder.append(", acquirer=").append(acquirer);
        builder.append(", currency=").append(currency);
        builder.append(", recTradeId=").append(recTradeId);
        builder.append(", bankTransactionId=").append(bankTransactionId);
        builder.append(", orderNumber=").append(orderNumber);
        builder.append(", authCode=").append(authCode);
        builder.append(", cardInfo=").append(cardInfo);
        builder.append(", transactionTimeMillis=").append(transactionTimeMillis);
        builder.append(", bankTransactionTime=").append(bankTransactionTime);
        builder.append(", bankResultCode=").append(bankResultCode);
        builder.append(", bankResultMsg=").append(bankResultMsg);
        builder.append(", paymentUrl=").append(paymentUrl);
        builder.append(", cardIdentifier=").append(cardIdentifier);
        builder.append(", merchantId=").append(merchantId);
        builder.append(", isRbaVerified=").append(isRbaVerified);
        builder.append(", transactionMethodDetails=").append(transactionMethodDetails);
        builder.append("]");
        return builder.toString();
    }
}
