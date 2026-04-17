package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopkFrequentElements {
    
    public static void topkfrequent(int[] nums,int k)
    {
        Map<Integer,Integer> heap=new HashMap<>();
        for(int num:nums)
        {
            heap.put(num,heap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxheap=new
         PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));

         maxheap.addAll(heap.entrySet());

         int[] result=new int[k];
         for(int i=0;i<k;i++)
         {
            result[i]=maxheap.poll().getKey();
         }
         System.out.println(Arrays.toString(result));
    }
public static void main(String[] args) {
    int[] arr={1,2,5,6,7,9,90,0,1,1,1,1,2,2,2,2,2};
    int k=2;

    topkfrequent(arr, k);

}

}
