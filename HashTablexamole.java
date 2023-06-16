package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTablexamole {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable =new Hashtable<>();

        hashtable.put(1,"Goutham");
        hashtable.put(2,"xyz");
        hashtable.put(3,"raju");
        hashtable.put(4,"");
        hashtable.put(3,"allen");
        hashtable.put(5,"gani");
        hashtable.put(3,"raju");

        boolean presntkey =hashtable.contains("Goutham");
        System.out.println(presntkey);
        for(Map.Entry val: hashtable.entrySet()){
            System.out.println(val.getValue()+" "+val.getKey());

        }
        System.out.println("remove value is "+hashtable.remove("xyz"));
    }
}
