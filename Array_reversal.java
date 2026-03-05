import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        //declaration of an array
        int[] number= {10,20,30,40,50};
        
        reverse(number);
        System.out.println(Arrays.toString(number));
    }
    
    
    // reverse array
        public static void reverse(int array[]){
            int start=0, end= array.length-1;
            
            while(start<end) {
                int temp=array[start];
                array[start]= array[end];
                array[end]= temp;
                
                start++;
                end--;
            }
            
        }
}
