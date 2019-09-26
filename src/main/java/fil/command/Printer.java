package fil.command;

import fil.seven_timer.civil.Dataseries;
import fil.seven_timer.civil.SevenTimerForecast;

import static fil.utils.MyUtils.assigned;
import static fil.utils.SevenTimerTranslator.*;

public class Printer implements IPrinter{

    private static final String DATA_PATTERN =
            "time point: %7s; cloud cover: %8s; lift index: %17s; precipitation: %4s(%8s); temp: %2d; humidity: %4s; wind: %12s(%2s); icon: %s";

    private SevenTimerForecast forecast;

    public Printer(SevenTimerForecast forecast) {
        this.forecast = forecast;
    }

    public void print() {
        if (assigned(forecast)) {
            System.out.print("init: ");

            String init = forecast.getInit();

            System.out.println(init);

            for (Dataseries item : forecast.getDataseries()) {
                System.out.println(String.format(DATA_PATTERN,
                        time(init, item.getTimepoint()),
                        cloudCover(item.getCloudcover()),
                        liftedIndexString(item.getLiftedIndex()),
                        item.getPrecType(),
                        precipitationAmount(item.getPrecAmount()),
                        item.getTemp2m(),
                        item.getRh2m(),
                        windSpeed(item.getWind10m().getSpeed()),
                        item.getWind10m().getDirection(),
                        item.getWeather()


                ));
            }
        } else {
            System.out.println("forecast is not initialized");
        }
    }

}
