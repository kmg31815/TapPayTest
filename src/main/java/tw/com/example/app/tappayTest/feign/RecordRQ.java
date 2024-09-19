package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class RecordRQ {

    @JsonProperty(value = "partner_key")
    private String partnerKey;
    private Filters filters;

    @Getter
    @Setter
    public static class Filters{
        private Time time;
        @JsonProperty(value = "rec_trade_id")
        private String recTradeId;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Time{
        private Long start_time;
        private Long end_time;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QueryRQ [").append("partnerKey=").append(partnerKey);
        builder.append(", filters=").append(filters);
        builder.append("]");
        return builder.toString();
    }
}
