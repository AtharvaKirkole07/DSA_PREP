package DSA;

public class ValidPalindrome {
    
    public boolean isvalid(String str)
    {
        int left=0;
        int right=str.length()-1;


        while(left<right)
        {
            while(left<right && !Character.isLetterOrDigit(str.charAt(left)))
            {
                left++;
            }
              while(left<right && !Character.isLetterOrDigit(str.charAt(right)))
            {
                right--;
            }

            if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))
            )
        {
            return false;
        }

        left++;
        right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str="poop";
        ValidPalindrome vp=new ValidPalindrome();
        System.out.println(vp.isvalid(str));
    }
}
