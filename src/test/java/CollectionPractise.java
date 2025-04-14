import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class CollectionPractise {
    public static void main(String[] args) {
//        ChromeDriver driver=new ChromeDriver();//


//        int[] a={12,2,3,4};
        List<String> list=new ArrayList<>();//dynamic array
        list.add("tharapathy");
        list.add("tharapathy");
        list.add("sudherr");
        list.add("chn");

        list.get(3);

//        list.add(45);//1---0 tht position
//        list.add(23);//you can add the data into list  2----1st position
////        list.remove(1);
        System.out.println(list);
//        System.out.println(list.size());

    Set<String> set=new LinkedHashSet<>();//linekd will add data in insertion order, other one will not maintain insertion order
    set.add("tharapathy");
        set.add("tharapathy");
    set.add("sudherr");
    set.add("chn");

        System.out.println(set);

    }
}
