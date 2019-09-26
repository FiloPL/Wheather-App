package fil.core;

import lombok.extern.slf4j.Slf4j;

import java.net.URLEncoder;
import java.util.Locale;

@Slf4j
public class UrlGeo implements IUrl{
    
    private static String BASE_URL_PATTERN = "https://nominatim.openstreetmap.org/search?q=%s&format=json";
    //private static String BASE_URL_PATTERN = "https://geocode.xyz/%s?json=1&auth={authcode}";

    private String name;

    public UrlGeo(String name) {
        this.name = name;
        log.debug("new UrlGeo("+name+")");
    }


    @Override
    public String getUrl() {
        log.debug("UrlGeo.getUrl()");
        String query;
        try {
            String enc = URLEncoder.encode(name, "UTF-8");
            query = String.format(Locale.US, BASE_URL_PATTERN, enc);
        } catch (Exception e) {
            query = String.format(Locale.US, BASE_URL_PATTERN, name);
        }
        log.debug("UrlGeo.getUrl() return: "+query);
        return query;
    }
}
