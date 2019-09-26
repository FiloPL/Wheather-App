package fil.utils;

import java.time.LocalDateTime;


public class SevenTimerTranslator {

    public static String cloudCover(int value) {

        switch (value) {
            case 1:
                return "0-6%";
            case 2:
                return "6-19%";
            case 3:
                return "19-31%";
            case 4:
                return "31-44%";
            case 5:
                return "44-56%";
            case 6:
                return "56-69%";
            case 7:
                return "69-81%";
            case 8:
                return "81-94%";
            case 9:
                return "94-100%";
            default:
                return "n/a";
        }

    }

    public static String liftedIndex(int value) {

        switch (value) {
            case -10:
                return "below -7";
            case -6:
                return "-7 to -5";
            case -4:
                return "-5 to -3";
            case -1:
                return "-3 to 0";
            case 2:
                return "0 to 4";
            case 6:
                return "4 to 8";
            case 10:
                return "8 to 11";
            case 15:
                return "over 11";

            default:
                return "n/a";
        }

    }


    public static String liftedIndexString(int value) {
        // https://en.wikipedia.org/wiki/Lifted_index
        // >6 very stable
        // 2 stable
        // -1 slightly unstable
        // -4 unstable
        // <-6 very unstable


        switch (value) {
            case -10:
            case -6:
                return "very unstable";
            case -4:
            case -1:
                return "unstable";
            case 2:
                return "slightly unstable";
            case 6:
                return "stable";
            case 10:
            case 15:
                return "very stable";

            default:
                return "n/a";
        }
    }


    public static String precipitationAmount(int value) {
        switch (value) {
            case 0:
                return "---";
            case 1:
                return "<0.25mm";
            case 2:
                return "0.25-1mm";
            case 3:
                return "1-4mm";
            case 4:
                return "4-10mm";
            case 5:
                return "10-16mm";
            case 6:
                return "16-30mm";
            case 7:
                return "30-50mm";
            case 8:
                return "50-75mm";
            case 9:
                return "> 75mm";
            default:
                return "n/a";
        }
    }


    public static String windSpeed(int value) {
        switch (value) {

            case 1:
                return "below 0.3m/s";
            case 2:
                return "0.3-3.4m/s";
            case 3:
                return "3.4-8.0m/s";
            case 4:
                return "8.0-10.8m/s";
            case 5:
                return "10.8-17.2m/s";
            case 6:
                return "17.2-24.5m/s";
            case 7:
                return "24.5-32.6m/s";
            case 8:
                return "over 32.6m/s";
            default:
                return "n/a";
        }
    }


    public static String time(String init, int timePoint) {
        String fromPattern = "yyyyMMddHH";
        String toPattern = "dd. HH";

        LocalDateTime initDate = MyUtils.stringToDateTime(fromPattern, init);

        return MyUtils.dateTimeToString(toPattern, initDate.plusHours(timePoint)) + "h";
    }

}
