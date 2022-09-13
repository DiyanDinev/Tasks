import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
     
        findDups("rarkesfesbcxv"); //r, e, s
        
        
        findSmallAndLargeestElem(new int[]{345,6,3345,754,456,7568,345,35,64,7,93,36});
        
        sumOfAllNumbersUntilX(10);
        
    }
    
    /**
     * 
     * @param inputString
     * 
     * Get each string char and put it in a map if it is not already added
     *  if it already exists change the counter 
     *  At the end check all chars with counter > 1 add them to char list and print the list (a bit more compact than printing each char individually)
     */
    public static void findDups(String inputString) {
    	List<Character> chars = new LinkedList<Character>();
    	
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<inputString.length(); i++) {
          if(map.containsKey(inputString.charAt(i))) {
            int counter = map.get(inputString.charAt(i));
            map.put(inputString.charAt(i), ++counter);
          } else {
            map.put(inputString.charAt(i), 1);
          }
        }
         
        for(char ch : map.keySet()) {
          if(map.get(ch) > 1) {
        	  chars.add(ch);
          }
        }
        
        System.out.println("Duplicate Chars are : " + chars.toString());
    }
    
    /**
     * Initialize Smallest and Largest number with array elements as if we set them as 0 then the smallest will always be 0 which is incorrect
     *	Then just loop around the array  and at the end print them.
     *
     */
    public static void findSmallAndLargeestElem(int arr[]) {
    		int smallest = arr[0], largest = arr[0];
    		
    		for(int i = 0; i < arr.length; i++) {
    			if(arr[i] > largest) {
    				largest = arr[i];
    			} else if (arr[i] < smallest){
    				smallest = arr[i];
    			}
    		}
    		System.out.println("Largest is - " + largest + " and Smallest is - " + smallest);
    }
    
    /**
     * 
     * @param number
     * 
     *  Just loop and use the loop index to sum the numbers
     *  At the end print the sum
     */
    
    public static void sumOfAllNumbersUntilX(int number) {
    	int sum = 0;
    	for(int i = 0; i <= number; i++) {
    		sum = sum + i;
    	}
    	System.out.println(sum);
    }
    
}