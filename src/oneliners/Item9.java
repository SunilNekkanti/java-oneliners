package oneliners;

import java.util.ArrayList;
import java.util.List;

/**
 * Parallel Processing
 */
public class Item9 {

  public static class LineItem {
    private final String someData;

    public LineItem(String someData) {
      this.someData = someData;
    }
  }

  public static long processItem(LineItem item) {
    //perform cpu intensive task
    return 1L;
  }

  public static void main(String[] args) {

    List<LineItem> dataList = new ArrayList<LineItem>() {
      {
        add(new LineItem("HPQ 100 BUY $10.75 LIMIT"));
      }

      {
        add(new LineItem("MSFT 500 BUY $15.50 LIMIT"));
      }

      {
        add(new LineItem("FB 500 BUY"));
      }

      {
        add(new LineItem("M 2000 SELL"));
      }
    };

    long result = dataList.parallel().map(line -> processItem(line)).reduce(0L, (a, b) -> a + b);

  }
}
