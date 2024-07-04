import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

    private static void getAllPrime(int num){
        Map<Integer, Integer> map = null;
        List<Map<Integer, Integer>> pairs = new ArrayList<>();

        int firstPrime = 1;
        while (firstPrime < num/2){

            int secondPrime = num - firstPrime;

            boolean flag = true;
            for (int i = 2; i < secondPrime/2 ; i++){

                if(secondPrime % i == 0) {
                    flag = false;
                }
            }
            if(flag){
                System.out.println(firstPrime + ": "+secondPrime);

                map = new HashMap<>();
                map.put(firstPrime , secondPrime);
                pairs.add(map);
            }
            firstPrime++;
        }
        System.out.println(pairs);


    }



    public static void main(String[] args) {
        getAllPrime(20);
    }
}
/*
nput: 20
Output :two distinct prime numbers whose sum is equal to given input number
 */