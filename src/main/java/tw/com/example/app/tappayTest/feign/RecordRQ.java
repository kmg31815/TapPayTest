package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecordRQ {

    @JsonProperty(value = "partner_key")
    private String partnerKey;
    @JsonProperty(value = "filters")
    private Filters filters;

    @Getter
    @Setter
    private static class Filters {
        @JsonProperty(value = "time")
        private Time time;
        @JsonProperty(value = "rec_trade_id")
        private String recTradeId;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Filters [").append("time=").append(time);
            builder.append(", recTradeId=").append(recTradeId);
            builder.append("]");
            return builder.toString();
        }
    }

    @Getter
    @Setter
    private static class Time {
        @JsonProperty(value = "start_time")
        private Long startTime;
        @JsonProperty(value = "end_time")
        private Long endTime;

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Time [").append("startTime=").append(startTime);
            builder.append(", endTime=").append(endTime);
            builder.append("]");
            return builder.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RecordRQ [").append("partnerKey=").append(partnerKey);
        builder.append(", filters=").append(filters);
        builder.append("]");
        return builder.toString();
    }
}
