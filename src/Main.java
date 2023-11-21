import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        Map<String, Integer> second_Map = hashMap;
        System.out.println("First Map " + hashMap);
        System.out.println("Second Map " + second_Map);
Queue<String> qu=new LinkedList<>();
qu.addAll(hashMap.keySet());
        System.out.println("Queue " +qu);
        Stack<String> st=new Stack<>();
        st.addAll(hashMap.keySet());
        System.out.println("Stack "+st);
            Map<String, Integer> third_Map =  new HashMap<>();
            Integer i=1;
        for (String e:qu) {
                third_Map.put(e, i);
              i++;
            }
        System.out.println(third_Map);
        }
}