package UserStories_String;
/*
UserStory_3:
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).

Example:
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
*/

public class comboString {
   public static void main(String[] args) {

       System.out.println(comboString("hello", "hi"));
   }

        //TO DO:
        // uncomment the lines below and write your method to solve this Task:

        public static String comboString (String a, String b){
            int lena = a.length();
          int lenb = b.length();
          if (lena > lenb) {
              return b + a + b;

           } else {
              return a + b + a;
            }
   }
    }

