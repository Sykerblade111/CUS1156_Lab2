/*Project:	Lab2
 *Class:	UniqueWords.java
 *Author:	Thomas Wu
 *Date:		2/28/21
 *This program creates a array list of elements and then prints it out as well
 *as counting the number of unique elements inside it and printing it out too.
 */
import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 1;
	  
      for (int i = 0; i < list.size(); i++) {
			if(list.get(0) != list.get(i)) {
				count++;
			}
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
