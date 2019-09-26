package fil.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyUtils {

    public static boolean assigned(Object object) {
        return object != null;
    }

    public static LocalDateTime stringToDateTime(String format, String stringDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(stringDateTime, dateTimeFormatter);
    }


    public static String dateTimeToString(String format, LocalDateTime dateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return dateTime.format(dateTimeFormatter);
    }
}
