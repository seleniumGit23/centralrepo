import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapPractise {

    public static void main(String[] args) {
//        list, set---single datatype for entire life colelction

        //key and value format

        HashMap<String,String> map=new LinkedHashMap<>();
        map.put("name","tharapathy");
        map.put("phonenumber","12312321");
        System.out.println(map.get("phonenumber"));
        System.out.println(map);

    }


}
