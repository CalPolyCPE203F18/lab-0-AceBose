import java.lang.*;
public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      double z = 9.8;

      System.out.println("x: "+x+" y: "+y+" z: "+z);

      int[] nums = {3,6,-1,2};
      for(int num:nums){
          System.out.println(num);
      }
       int numFound = char_count(y,'l');
       System.out.println("Found: " + numFound);
       int i;
       for (i = 1; i < 11; i++)
           System.out.print(i + " ");


}
    public static int char_count(String s, char c){
        int count = 0;
        char[] charArray = s.toCharArray();
        int i=0;
        for(i=0; i<charArray.length;i++){
            if (c==charArray[i]){
                count++;
            }
        }
        return count;
    }
}

