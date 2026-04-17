package DSA;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    
  
    public static void returnfirst(String str)
    {
        Map<Character,Integer> map=new LinkedHashMap<>();


        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(char ch:map.keySet())
        {
            if(map.get(ch)==1)
            {
                System.out.println(ch);
            }
        }
        System.out.println("_");
    }
    
    public static void main(String[] args) {
        String str="diyfdyufdiyudfydfyudfydufdyu";
returnfirst(str);
    }
}