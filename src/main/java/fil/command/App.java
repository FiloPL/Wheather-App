package fil.command;

import fil.core.IUrl;
import fil.core.UrlCivil;
import fil.core.ForecastManager;
import fil.seven_timer.civil.SevenTimerForecast;
import fil.core.IGeoCoordinates;
import fil.core.GeoCoordinates;

import static fil.utils.Input.getString;


public class App
{

    public static void main( String[] args )
    {
        System.out.println( "Fun - Forecast" );


        System.out.println("input location name or coordinates (eg. 52.2, 17.3) for view weather forecast");

        String enteredText = getString();

        IGeoCoordinates stg = new GeoCoordinates(enteredText);

        System.out.println("searching forecast for");
        System.out.println(stg.info());

        IUrl url = new UrlCivil(stg.getLongitude(), stg.getLatitude());

        ForecastManager forecastManager = new ForecastManager();

        SevenTimerForecast forecast = forecastManager.getCivilForecast(url);

        Printer printer = new Printer(forecast);
        printer.print();



    }
}
