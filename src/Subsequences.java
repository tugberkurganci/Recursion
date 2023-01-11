import java.util.ArrayList;

public class Subsequences {
    public static void printingSub(ArrayList<Integer> al, int arr[], int i){
        if(i == arr.length){
            System.out.println(al.toString());
            return;
        }
        al.add(arr[i]);
        printingSub(al,arr,i+1);
        al.remove(al.size()-1);
        printingSub(al,arr,i+1);
    }
}
