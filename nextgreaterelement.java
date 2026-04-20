package DSA;

import java.util.*;

public class nextgreaterelement {
    
    public static void nextgreater(int[] arr)
    {
        int n=arr.length;
        int[] result=new int[n];

        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
            {
                int idx=stack.pop();
                result[idx]=arr[i];
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,9,3};
        nextgreater(arr);
    }
}
