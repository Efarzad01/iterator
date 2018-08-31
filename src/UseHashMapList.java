import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMapList {
    public static void main(String[] args) {
        List<String>CityOfUsa=new ArrayList<String>();
        CityOfUsa.add("NY");
        CityOfUsa.add("AZ");
        CityOfUsa.add("NJ");

        List<String>CityOfBD=new ArrayList<String>();
        CityOfBD.add("Dhaka");
        CityOfBD.add("CTG");
        CityOfBD.add("SLT");

        Map<String, List<String>> listOfCountryAndCity = new HashMap<String, List<String>>();

        listOfCountryAndCity.put("Usa", CityOfUsa);
        listOfCountryAndCity.put("BD", CityOfBD);

        for(Map.Entry<String, List<String>> state:listOfCountryAndCity.entrySet()){
            if(listOfCountryAndCity.get("Usa").contains("NY")){
                System.out.println(state.getKey() + " ---> " + state.getValue());
            }
        }

    }
}
