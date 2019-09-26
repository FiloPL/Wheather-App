
package fil.geocode.name;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alt {

    @SerializedName("loc")
    @Expose
    private List<Loc> loc = null;

    public List<Loc> getLoc() {
        return loc;
    }

    public void setLoc(List<Loc> loc) {
        this.loc = loc;
    }

}
