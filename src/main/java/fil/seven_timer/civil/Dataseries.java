
package fil.seven_timer.civil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dataseries {

    @SerializedName("timepoint")
    @Expose
    private Integer timepoint;
    @SerializedName("cloudcover")
    @Expose
    private Integer cloudcover;
    @SerializedName("lifted_index")
    @Expose
    private Integer liftedIndex;
    @SerializedName("prec_type")
    @Expose
    private String precType;
    @SerializedName("prec_amount")
    @Expose
    private Integer precAmount;
    @SerializedName("temp2m")
    @Expose
    private Integer temp2m;
    @SerializedName("rh2m")
    @Expose
    private String rh2m;
    @SerializedName("wind10m")
    @Expose
    private Wind10m wind10m;
    @SerializedName("weather")
    @Expose
    private String weather;

    public Integer getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(Integer timepoint) {
        this.timepoint = timepoint;
    }

    public Integer getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Integer getLiftedIndex() {
        return liftedIndex;
    }

    public void setLiftedIndex(Integer liftedIndex) {
        this.liftedIndex = liftedIndex;
    }

    public String getPrecType() {
        return precType;
    }

    public void setPrecType(String precType) {
        this.precType = precType;
    }

    public Integer getPrecAmount() {
        return precAmount;
    }

    public void setPrecAmount(Integer precAmount) {
        this.precAmount = precAmount;
    }

    public Integer getTemp2m() {
        return temp2m;
    }

    public void setTemp2m(Integer temp2m) {
        this.temp2m = temp2m;
    }

    public String getRh2m() {
        return rh2m;
    }

    public void setRh2m(String rh2m) {
        this.rh2m = rh2m;
    }

    public Wind10m getWind10m() {
        return wind10m;
    }

    public void setWind10m(Wind10m wind10m) {
        this.wind10m = wind10m;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

}
