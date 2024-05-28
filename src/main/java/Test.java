import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
 /*
    nput = {1, 2, 1, 3, 3, 1, 4, 5}
output = {1, 1, 1, 3, 3, 2, 4, 5}
     */
    private static int[] getMaxOccuranceArray(int[] arr){

        Map<Integer, Integer> map = new TreeMap<>((a,b)->(b-a));

        for (int data : arr){
            if(map.containsKey(data)){
                map.put(data,map.get(data) + 1);
            }else {
                map.put(data , 1);
            }
        }
        System.out.println(map);
        map.entrySet().stream().sorted();
        System.out.println(map);
        List<Integer> valueList = map.values().stream().sorted((a,b)->(b-a)).toList();
        System.out.println(valueList);
        System.out.println(valueList.get(0));
        int[] resArray = new int[arr.length];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getValue();

        }

        return null;
    }
    public static void main(String[] args) {
    int[] input = {1, 2, 1, 3, 3, 1, 4, 5};
    getMaxOccuranceArray(input);

    }
}