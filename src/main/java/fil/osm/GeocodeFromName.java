package fil.osm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocodeFromName {
    
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("type")
    @Expose
    private String type;
    
    public String getLat() {
        return lat;
    }
    
    public String getLon() {
        return lon;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getType() {
        return type;
    }
    
}