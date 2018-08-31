import java.util.HashMap;
import java.util.Map;

public class UseMAp {
    public static void main(String[] args) {
        Map<String, String>CityNCountry= new HashMap<String, String>();
        CityNCountry.put("USA", "NY");
        CityNCountry.put("UK", "LONDON");
        CityNCountry.put("CANADA","MONTREAL");

        for(Map.Entry<String, String> state:CityNCountry.entrySet()){
            System.out.println(state.getKey() + " ----> " + state.getValue());
        }
    }
}
