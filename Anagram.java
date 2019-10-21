// Java program to check if two strings  
// are anagrams of each other  
import java.util.*;
class Anagram
{ 
  
// Function to check whether two strings are anagram of  
// each other  
    static boolean areAnagram(String str1, String str2)  
    {  
        // If two strings have different length  
        if (str1.length() != str2.length())  
        {  
            return false;  
        }  
      
        // To store the xor value  
        int value = 0;  
      System.out.println(value);
        for (int i = 0; i < str1.length(); i++)  
        {  
            System.out.println(value);
            System.out.println(str1.charAt(i) + "----" + str2.charAt(i) + "----" + (int) str1.charAt(i) + "----" + (int) str2.charAt(i));
            value = value ^ (int) str1.charAt(i);  System.out.println(value);
            value = value ^ (int) str2.charAt(i);  System.out.println(value);
        }  
      
       // return value == 0;
      //equalsIgnoreCase() getChars() indexOf() lastIndexOf() split() substring() toCharArray() toLowerCase() toUpperCase()

        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1); Arrays.sort(arr2); 
        
        str1 = Arrays.toString(arr1);
        str2 = Arrays.toString(arr2);
      
     //ArrayList<Character> aList2= new ArrayList(Arrays.asList(str1.split("")));
     //ArrayList<Character> aList1= new ArrayList(Arrays.asList(str2.split("")));
         //Collections.sort(aList2); Collections.sort(aList1);
 
     // str1 = Arrays.toString(aList1.toArray());
     // str2 = Arrays.toString(aList2.toArray());
     
        System.out.println((Array)str1[1]);
      return str1.equals(str2) ; 
      
    }  
  
    // Driver code  
    public static void main(String[] args)  
    { 
        String str1 = "Listen";  
        String str2 = "Silent";  
        if (areAnagram(str1, str2))  
            System.out.println("The two strings are anagram of each other");  
        else
            System.out.println("The two strings are not anagram of each other");  
      
    } 
} 
  
