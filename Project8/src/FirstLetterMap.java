/*
 * Name: Johnny Pham
 * Date: 11/02/2021
 * Description: Program that utilizes maps and Treesets to read in a user inputted text file and sorts/displays them in according to the letter they begin with
 * Heavily commented so I can go back and review it
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstLetterMap {

          public static void main(String[] args) throws FileNotFoundException{
            Scanner input = new Scanner(System.in);
            
            // user input file name
            while(true)
            try {
            System.out.print("Enter filename: ");
            String name = input.nextLine();
            input = new Scanner(new File(name));
            break;
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found. Please Try Again");
            }
            
            // used to split the words connected by dashes. Ty Big Java
            input.useDelimiter("\\W+");
            
            // create map that has characters in the key parameter and sets as the value
            Map<Character, Set<String>> map = new TreeMap<Character, Set<String>>();
            
            //iterate through each value and convert it to lowercase
            while (input.hasNext()) {
                  //converting to lowercase
                  String token = input.next().toLowerCase();
                  //first letter
                  char c = token.charAt(0);
                  
                  //loop to add new key to the map if one does not exist using Treeset for order
                  if (!map.containsKey(c)) 
                  {
                        map.put(c, new TreeSet<String>());
                  }
                  // add word to corresponding letter/key
                  map.get(c).add(token);
            }
            input.close();
            
            // display through looping
            for (Character key : map.keySet()) 
            {
                  // display the key value and a bracket to start
                  System.out.print(key + ": [");
                  
                  // iterator for set for given key
                  Iterator<String> iterate = map.get(key).iterator();
                  
                  // print loop with iterator
                  while (iterate.hasNext()) {
                        System.out.print(iterate.next());
                        //loop to add comma + space
                        if (iterate.hasNext()) 
                        {
                              System.out.print(", ");
                        }
                  }
                  //bracket that finishes each letter
                  System.out.println("]");
            }
      }
}