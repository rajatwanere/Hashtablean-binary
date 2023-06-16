package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {
        Hashtable<Integer,Student> h=new Hashtable<>();
        Student s1=new Student(1,"rajat","kothrud","rrrr@gamil.com");
        Student s2=new Student(2,"abc","manglore","sss@gamil.com");
        Student s3=new Student(3,"xyz","bangluru","pppp@gamil.com");
        h.put(4,s1);
        h.put(5,s2);
        h.put(6,s3);
        for(Map.Entry val:h.entrySet()){
            System.out.println(val);
        }
    }

}
