package sort.secondsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Code> codes = new ArrayList<>();

        /*"K1\\SK1\\SSK2", "K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2", "K1\\SK1",
                "K1\\SK2", "K1\\SK1\\SSK1"*/

        Code one = new Code("K2");
        Code two = new Code("K1\\SK1\\SSK2");
        Code three = new Code("K1");
        Code four = new Code("K2\\SK1\\SSK1");
        Code five = new Code("K2\\SK1\\SSK2");
        Code six = new Code("K1\\SK1");
        Code seven = new Code("K1\\SK2");

        codes.add(one);
        codes.add(two);
        codes.add(three);
        codes.add(four);
        codes.add(five);
        codes.add(six);
        codes.add(seven);


        Collections.sort(codes,Collections.reverseOrder());
        System.out.println(codes);


    }
}
