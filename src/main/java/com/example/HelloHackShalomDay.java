package main.java.com.example;

import java.util.*;

/**
 * Created by marcelsato on 5/3/15.
 */
public class HelloHackShalomDay {

    public static void main(String[] args) {
        System.out.println("Hello Shalom Hack Day!!!!\n");


        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(1);
        numbers1.add(3);
        numbers1.add(3);


        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(1);
        numbers2.add(2);

        System.out.println(showResult(numbers1));
        System.out.println(showResult(numbers2));

    }


    public static List showResult(List<Integer> numbers){
        List<Integer> d = new ArrayList<>();
        for(int i  = 0; i < numbers.size(); i++){
            for(int j = i + 1; j < numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    if(!d.contains(numbers.get(i))) d.add(numbers.get(i));
                }
            }
        }
        Collections.sort(d);
        return d;
    }


}
