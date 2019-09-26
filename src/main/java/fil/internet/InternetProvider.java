package fil.internet;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class InternetProvider {

    public static String getResponse(String urlQueryString) throws Exception {
        URL url = new URL(urlQueryString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        //connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");
        connection.connect();
        InputStream inStream = connection.getInputStream();
        return new Scanner(inStream, "UTF-8").useDelimiter("\\Z").next();
    }
}
