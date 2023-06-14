package src.day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapPractice {
    public static void main(String[] args) {


        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "SDET");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println(person1.get("name")); //Arthur
        System.out.println(person1.get("salary")); //100000.5
        System.out.println(person1); //{name=Arthur, gender=M, age=32, job_title=SDET, salary=100000.5, married=true}




    }

}
