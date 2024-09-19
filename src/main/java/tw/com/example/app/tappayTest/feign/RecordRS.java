package tw.com.example.app.tappayTest.feign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class RecordRS {

    @JsonProperty(value = "msg")
    private String msg;
    @JsonProperty(value = "records_per_page")
    private int recordsPerPage;
    @JsonProperty(value = "total_page_count")
    private int totalPageCount;
    @JsonProperty(value = "number_of_transactions")
    private int numberOfTransactions;
    @JsonProperty(value = "page")
    private int page;
    @JsonProperty(value = "trade_records")
    private ArrayList<Object> tradeRecords;
    @JsonProperty(value = "status")
    private int status;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RecordRS [").append("msg=").append(msg);
        builder.append(", recordsPerPage=").append(recordsPerPage);
        builder.append(", totalPageCount=").append(totalPageCount);
        builder.append(", numberOfTransactions=").append(numberOfTransactions);
        builder.append(", page=").append(page);
        builder.append(", tradeRecords=").append(tradeRecords);
        builder.append(", status=").append(status);
        builder.append("]");
        return builder.toString();
    }
}
