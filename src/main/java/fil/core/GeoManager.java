package fil.core;


import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import fil.osm.GeocodeFromName;
import fil.internet.InternetProvider;


@Slf4j
public class GeoManager{
    
    public IGeoCoordinates getCoordinates(IUrl url){
        log.debug("GeoManager.getCoordinates(" + url.getClass().getName() + ")");
        String response;
        
        try {
            response = InternetProvider.getResponse(url.getUrl());
            Gson gson = new Gson();
            GeocodeFromName[] result = gson.fromJson(response, GeocodeFromName[].class);
            
            return new IGeoCoordinates(){
                @Override
                public double getLongitude(){
                    return Double.parseDouble(result[0].getLon());
                }
                
                
                @Override
                public double getLatitude(){
                    return Double.parseDouble(result[0].getLat());
                }
                
                
                @Override
                public String info(){
                    return result[0].getType() + ": " + result[0].getDisplayName() + " @ " + result[0].getLat() + "," + result[0].getLon();
                }
            };
        } catch (Exception e) {
            ExceptionLogger.logException(e, this.getClass());
        }
        return null;
    }
}
