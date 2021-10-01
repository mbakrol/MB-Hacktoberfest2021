/*Brief intro of Linear Search: inear search or sequential search is a method for finding a target value within a list.
It sequentially checks each element of the list for the target value until a match is found or until all the elements
have been searched.
Here we will write code for different inputs like input can be ordered or unordered integer array.
*/
//Unordered Linear Search
public class LinearSearch {

    public static final int unorderedLinearSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            int iValue = array[i];
            if (value == iValue)
                return i;
        }
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
      int[] integers = {1,2,3,4,5,6,7,8,8,8,9,9,9,0};
         //the element that should be found
         int shouldBeFound = 9;

         int atIndex = LinearSearch.unorderedLinearSearch(shouldBeFound, integers);

         System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d"
                 , shouldBeFound, integers[atIndex], atIndex, integers.length));
         
 }
}

/*
OUTPUT:
search Key : 9. Found 9 at index 10. An array length 14

Time complexity: O(n), in the worst case we need to scan the complete array. 
Space complexity: O(1).*/

//Sorted Linear Search
public class LinearSearch {

    public static final int orderedLinearSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                return i;
            }
            else if (array[i] > value){
             return -1;
            }
        }
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
         int[] sortedArray = {10,20,30,40,50};
         //the element that should be found
         int key = 30;
         
         int atIndex = LinearSearch.orderedLinearSearch(key, sortedArray);

         System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d"
                 , key, sortedArray[atIndex], atIndex, sortedArray.length));
         
 }
}
/*
OUTPUT:
Should be found: 30. Found 30 at index 2. An array length 5

Time complexity: O(n), in the worst case we need to scan the complete array. 
Space complexity: O(1).*/


