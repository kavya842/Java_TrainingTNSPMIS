//! What is String?
// A string is a sequence of characters.  java lo text ni store chayadaniki string ni use chestam.

// String name="kavya";
// String language="java";
// System.out.println(name);
// System.out.println(language);

// output:-
// kavya
// java

//! How to create string?
// String s1="java";   string literal
// String s2=new String("java");   using "new" keyword ; new String(): Heap lo new String object create chestundi.

//! 2. Important String methods
//! Method	                              Purpose	                                    Example
// length()	                            Number of characters	                  "Java".length() → 4

// charAt(i)	                        Character at index	                      "Java".charAt(1) → a

// toUpperCase()	                    Uppercase	                             "java".toUpperCase() → JAVA

// toLowerCase()	                    Lowercase                             	"JAVA".toLowerCase() → java

// equals()	                            Compare content	                       "Java".equals("Java") → true

// equalsIgnoreCase()	               Compare ignoring case	                "java".equalsIgnoreCase("JAVA") → true

// contains()	                       Check substring	                        "Java".contains("av") → true

// substring()	                       Extract part                            	"Java".substring(1,3) → av

// indexOf()	                       First matching index                	    "banana".indexOf('a') → 1

// replace()	                        Replace characters/text	                "java".replace('a','o') → jovo

// trim()	                            Remove leading/trailing basic spaces	"  hi  ".trim() → "hi"

// split()	                            Split into parts	                     "a,b,c".split(",")

// isEmpty()	                        Check if length is zero	                  "".isEmpty() → true

// Remember: String indexing starts from 0. Also, length() is a method for Strings, but length is a property for arrays.

//! 3. == vs equals()
// String a = new String("Java");
// String b = new String("Java");

// System.out.println(a == b);
// System.out.println(a.equals(b));


//! Output:
// false
// true


//! - == checks whether both references point to the same object.
//! - equals() checks whether their text content is equal.

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

//!4. Why are Strings immutable?
// Immutable means once a String object is created, its content cannot be changed.
// String s = "Java";
// s.concat(" Programming");

// System.out.println(s);


//! Output:
// Java


// concat() returns a new String; it does not change the original one. To keep the result:
// s = s.concat(" Programming");
// System.out.println(s);


//! Output: Java Programming


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//! Program 1: Reverse a String

// public class ReverseString {
//     public static void main(String[] args) {
//         String s = "hello";
//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         System.out.println("Reversed: " + rev);
//     }
// }

//! output : Reversed: olleh

//!Program 2: Check Whether a String Is a Palindrome
// A palindrome reads the same forward and backward. Examples: madam, level, 121

// public class PalindromeString {
//     public static void main(String[] args) {
//         String s = "madam";
//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         if (s.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not a palindrome");
//         }
//     }
// }

//! output : Palindrome


//!Program 3: Count Vowels and Consonants

// public class VowelsConsonants {
//     public static void main(String[] args) {
//         String s = "Hello Java";
//         int vowels = 0;
//         int consonants = 0;

//         s = s.toLowerCase();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch >= 'a' && ch <= 'z') {
//                 if (ch == 'a' || ch == 'e' || ch == 'i'
//                         || ch == 'o' || ch == 'u') {
//                     vowels++;
//                 } else {
//                     consonants++;
//                 }
//             }
//         }

//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + consonants);
//     }
// }

//! output :- Vowels: 4
            // Consonants: 5


//! Program 4: Check Whether Two Strings Are Anagrams

// import java.util.Arrays;

// public class Anagram {
//     public static void main(String[] args) {
//         String s1 = "listen";
//         String s2 = "silent";

//         char[] a = s1.toCharArray();
//         char[] b = s2.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         if (Arrays.equals(a, b)) {
//             System.out.println("Anagrams");
//         } else {
//             System.out.println("Not anagrams");
//         }
//     }
// }

//! output :- Anagrams
// toCharArray() converts each String into a character array.
// Arrays.sort() sorts the characters.
// Arrays.equals() compares the sorted arrays.
// If the arrays match, the Strings are anagrams.