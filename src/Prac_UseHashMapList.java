import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prac_UseHashMapList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Car");
        list.add("Bus");
        list.add("Truck");

        List<String> list1 = new ArrayList<String>();

        list1.add("Subway");
        list1.add("Metro North");
        list1.add("Amtrak");


        Map<String, List<String>> VehicleAndWay = new HashMap<String, List<String>>();

        VehicleAndWay.put("Road",list);
        VehicleAndWay.put("Track",list1);

        for(Map.Entry<String,List<String>> car:VehicleAndWay.entrySet()){
        if (VehicleAndWay.get("Road").contains("Car"));{
        System.out.println(car.getKey()+ ">>>" +car.getValue());}
    }
}
}