
package fil.seven_timer.civil;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SevenTimerForecast {

    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("init")
    @Expose
    private String init;
    @SerializedName("dataseries")
    @Expose
    private List<Dataseries> dataseries = null;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public List<Dataseries> getDataseries() {
        return dataseries;
    }

    public void setDataseries(List<Dataseries> dataseries) {
        this.dataseries = dataseries;
    }

}
