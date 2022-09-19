import java.util.HashMap;
import java.util.Map;

public class Translator {
    //<--hashmap-->
    Map<Integer, String> numericAlpha = new HashMap<>();

    //<--constructor-->
    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    //<--medhod-->
    public void translate(Integer number) {
        System.out.println("Translating numeric number to alphabetic:");
        System.out.println(numericAlpha.get(number));

    }
}