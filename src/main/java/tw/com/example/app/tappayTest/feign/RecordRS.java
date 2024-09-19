package tw.com.example.app.tappayTest.feign;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class RecordRS {

    private String msg;
    private int records_per_page;
    private int total_page_count;
    private int number_of_transactions;
    private int page;
    private ArrayList<Object> trade_records;
    private int status;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RecordRS [").append("msg=").append(msg);
        builder.append(", records_per_page=").append(records_per_page);
        builder.append(", total_page_count=").append(total_page_count);
        builder.append(", number_of_transactions=").append(number_of_transactions);
        builder.append(", page=").append(page);
        builder.append(", trade_records=").append(trade_records);
        builder.append(", status=").append(status);
        builder.append("]");
        return builder.toString();
    }
}
