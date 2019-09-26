package fil.core;

import java.util.Locale;

public class UrlCivil implements IUrl{


    private static String BASE_URL_PATTERN
            = "http://www.7timer.info/bin/civil.php?lon=%f&lat=%f&ac=0&unit=metric&output=json&tzshift=0";

    private final double lon; //17.3
    private final double lat; //52.2

    public UrlCivil(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }


    @Override
    public String getUrl() {
        String result = String.format(Locale.US, BASE_URL_PATTERN, lon, lat);
        return result;
    }
}
