import java.util.HashMap;
import java.util.Map;

public class Prac_MashMap {
    public static void main(String[] args) {

        Map<String,String> UseOfThings = new HashMap<String, String>();

        UseOfThings.put("Car","To Drive");
        UseOfThings.put("Bus","To ride");
        UseOfThings.put("Plane","To ride");

        for(Map.Entry<String,String> state:UseOfThings.entrySet()){
            System.out.println(state.getKey()+ ">>>>" + state.getValue());
        }

    }
}
