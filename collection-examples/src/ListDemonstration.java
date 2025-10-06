import java.util.ArrayList;
import java.util.Arrays;

public class ListDemonstration {

    public static void main(String[] args) {
        String city = "Pune";

        String[] cities = new String[3];
        cities[0]= "pune";
        cities[1]= "mumbai";
        cities[2]= "delhi";

        //ARRAY
//        String[] cities = {"Pune", "Mumbai","Delhi"};

        //ARRAYLIST
        ArrayList cityList = new ArrayList();
        cityList.add("Pune");
        cityList.add("Mumbai");
        cityList.add("Delhi");
        cityList.add(100);
        cityList.add(true);
        cityList.add('a');
        cityList.add(8.2f);
        cityList.add(87678.7657576d);
        cityList.add(1234567789009l);

        System.out.println("City:" + city);
        System.out.println("Cities:" + Arrays.toString(cities));
        System.out.println("CityArrayList:" + cityList);


        //generic used to restrict that only certain type of data is accepted
        ArrayList<String> cityGenericsList = new ArrayList<>();
        cityGenericsList.add("Pune");
        cityGenericsList.add("Mumbai");
        cityGenericsList.add("Delhi");

        System.out.println("CityGENERIC LIST:" + cityGenericsList);

    }

}

