import java.util.HashMap;
import java.util.Map;

public class Test {

    private static void printSeriasOfNum(int num , int upTo){

        if(num >= upTo){
            return;
        }
        System.out.println(num);
        printSeriasOfNum(num + 3 , upTo);
    }
    private static int printSum(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
        return sum;
    }
    private static int printSumInt(int num){
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num = num/10;
        }

        System.out.println(sum);
        return sum;
    }
    private static void printCharFrequency(String str){

        Map<Character ,Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i) , 0) + 1);
        }
        System.out.println(freq);
    }
    public static void main(String[] args) {
        //printSeriasOfNum(1,30);
        //printSum("34798");
        printSumInt(34798);

        String str = "abhimanyu";
        printCharFrequency(str);

        // grt/namer?="nsnd"
        // select * from Emplyee order by salary desc 2,1;
        //
        // @RequestParam("name") String name)
        // path
    }

}//34798