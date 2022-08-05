import java.util.*;

public class Task32 {
    //Task 32:JAVA program to count a total number of unique elements in an array.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element to insert");
        int n=sc.nextInt();
        List<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n ; i++) {
            al.add(sc.nextInt());
        }

        Map<Integer,Integer> map=new HashMap();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(al.get(i))){
                map.put(al.get(i),map.get(al.get(i))+1);
            }else
                map.put(al.get(i),1);
        }

        System.out.println("Total number of unique elemnts: "+map.size());
    }
}
