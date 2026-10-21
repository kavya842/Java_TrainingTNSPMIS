// !Java Collections Framework — Complete Notes
// Java lo Collections ante multiple objects ni store cheyyadaniki, manage cheyyadaniki use chese framework. Arrays, Strings tarvata Java lo nerchukovalsina important topic idi. Interviews lo kuda Collections meeda questions frequently adugutaru.

// For example, suppose you want to store 100 student names. Every name ki separate variable create cheyyalsina avasaram ledu. Collections use chesi names add, remove, search, and sort cheyyachu.

//! 1. Why do we need Collections?
// First, arrays tho compare cheddam.
// int[] arr = new int[3];

// arr[0] = 10;
// arr[1] = 20;
// arr[2] = 30;


//! Array size fixed ga untundi. Inka oka element add cheyyalante, larger array create chesi elements copy cheyyali.

// Using a collection:
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();

//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);
//         numbers.add(40);

//         System.out.println(numbers);
//     }
// }


//! Output:
//! [10, 20, 30, 40]


// Here, ArrayList automatically grows as elements are added.

//! 2. Collections Framework hierarchy
                             // Iterable

                          // Collection (interface)

          // List                       // Set                       // Queue
// Ordered, duplicates allowed        // Unique elements            // Elements for processing

// Map is also part of the Collections Framework, but it is a separate interface; it does not extend Collection.

// Map
// Key-value pairs


// The main interfaces you should learn first are:
// - List: stores elements in sequence and allows duplicates.
// - Set: stores unique elements.
// - Queue: holds elements for processing.
// - Map: stores values associated with unique keys.
// Remember: Collection is an interface, while Collections (plural) is a utility class containing methods such as sort() and reverse().

//!3. List interface
// A List maintains a sequence of elements, supports index-based access, and allows duplicates.

//! A. ArrayList
// ArrayList is a resizable array.

//! Example:--
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> names = new ArrayList<>();

//         names.add("Kavya");
//         names.add("Ravi");
//         names.add("Kavya");

//         System.out.println(names);
//         System.out.println(names.get(1));

//         names.remove("Ravi");
//         System.out.println(names);
//     }
// }

//! Output:-
//[Kavya, Ravi, Kavya]
//Ravi
//[Kavya, Kavya]

//! Important methods:
//!   Method	                              Purpose
// add(value)	                        Add an element
// get(index)                        	Access an element
// set(index, value)	                Replace an element
// remove(index)	                    Remove by index
// size()	                            Number of elements
// contains(value)	                    Check whether an element exists
// clear()	                            Remove all elements

//------------------------------------------------------------------------------------------------------------------
//!B. LinkedList
// LinkedList stores elements in linked nodes. Java's LinkedList implements both List and Deque.

//! Example:-
// import java.util.LinkedList;

// public class Main {
//     public static void main(String[] args) {
//         LinkedList<String> cities = new LinkedList<>();

//         cities.add("Hyderabad");
//         cities.add("Mumbai");
//         cities.addFirst("Vijayawada");
//         cities.addLast("Chennai");

//         System.out.println(cities);
//         System.out.println(cities.getFirst());
//         System.out.println(cities.getLast());
//     }
// }

//! Output:
// [Vijayawada, Hyderabad, Mumbai, Chennai]
// Vijayawada
// Chennai

//--------------------------------------------------------------------------------------------------

//!ArrayList                                 vs                           LinkedList
//!Feature	                                       ArrayList                        	LinkedList
// Internal structure                       	 Resizable array	                  Doubly linked nodes
// Access by index	                             Generally fast	                    Requires traversal
// Add/remove at beginning	                     Usually shifts elements	         Generally efficient
// Extra memory	                                 Usually lower	                     Stores links for nodes

// For most ordinary list use cases, start with ArrayList. LinkedList can be useful for specific insertion/removal patterns or deque operations.


//-----------------------------------------------------------------------------------------------------------------------------------------------------------

//! Set Interface
// A set does not allow duplicate elements

//! A.Hashset
// A Hashset does not guarantee  iteration order

//! Example:-
// import java.util.HashSet;

// public class Main {
//     public static void main(String[] args) {
//         HashSet<Integer> numbers = new HashSet<>();

//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(10);
//         numbers.add(30);

//         System.out.println(numbers);
//     }
// }

//!One possible output: [20, 10, 30]

//The order may differ. Although 10 was added twice, it appears only once.

//! -----------------  B. LinkedHashSet---------------------------------
// It maintains insertion order during iteration

//!Example:-
// import java.util.LinkedHashSet;

// public class Main {
//     public static void main(String[] args) {
//         LinkedHashSet<Integer> set = new LinkedHashSet<>();

//         set.add(30);
//         set.add(10);
//         set.add(20);
//         set.add(10);

//         System.out.println(set);
//     }
// }

//! Output:- [30,10,20]

//!---------------------------------------  C.TreeSet -----------------------------------------------
// It stores elements in sorted order according to their natural ordering by default.

//! Example:-
// import java.util.TreeSet;

// public class Main {
//     public static void main(String[] args) {
//         TreeSet<Integer> set = new TreeSet<>();

//         set.add(30);
//         set.add(10);
//         set.add(20);

//         System.out.println(set);
//     }
// }

//! Output :- [10,20,30]

//!Set comparison
//!Type	              Duplicate values   	     Iteration order
// HashSet            	Not allowed	            No guaranteed order
// LinkedHashSet	    Not allowed	            Insertion order
// TreeSet	            Not allowed	             Sorted order

//!--------------- 5. Queue interface------------------------
// A Queue holds elements waiting to be processed. Many queues follow FIFO — First In, First Out.

// Think of people standing in a line: the person who comes first is served first.

//!Example:-
// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
//     public static void main(String[] args) {
//         Queue<String> queue = new LinkedList<>();

//         queue.offer("Person 1");
//         queue.offer("Person 2");
//         queue.offer("Person 3");

//         System.out.println(queue);

//         System.out.println(queue.peek());
//         System.out.println(queue.poll());
//         System.out.println(queue);
//     }
// }

//! Output:-
// [Person 1, Person 2, Person 3]
// Person 1
// Person 1
// [Person 2, Person 3]

//!Important methods:
// - offer() — add an element.
// - peek() — view the front element without removing it.
// - poll() — retrieve and remove the front element.
// Deque supports insertion and removal at both ends. A PriorityQueue processes elements according to priority rather than ordinary FIFO order.

//! ------------ 6.Map interface ----------------------------
// A Map stores key-value pairs. Keys are unique, but values can be duplicated.

//! Example: storing student roll numbers and names.
// import java.util.HashMap;

// public class Main {
//     public static void main(String[] args) {
//         HashMap<Integer, String> students = new HashMap<>();

//         students.put(101, "Kavya");
//         students.put(102, "Ravi");
//         students.put(103, "Priya");

//         System.out.println(students.get(102));

//         students.put(102, "Rahul");

//         System.out.println(students);
//     }
// }

//! Output:-
// Ravi
// {101=Kavya, 102=Rahul, 103=Priya}
//When the same key 102 is inserted again, its value is replaced.

//!Important Map methods:
//!Method	                               Purpose
// put(key, value)          	   Add or update a mapping
// get(key)	                       Retrieve a value
// remove(key)	                   Remove a mapping
// containsKey(key)	               Check for a key
// containsValue(value)	           Check for a value
// keySet()	                       Get the set of keys
// values()	                        Get the values
// entrySet()	                    Get key-value entries

//!HashMap vs LinkedHashMap vs TreeMap
// - HashMap: no guaranteed iteration order.
// - LinkedHashMap: maintains insertion order by default.
// - TreeMap: sorts entries by key according to natural ordering by default.

// ArrayList — add, remove, search, update and iterate.
// LinkedList — nodes, insertion, deletion, and traversal.
// HashSet — remove duplicate elements.
// HashMap — key-value pairs and frequency-counting programs.
// Iterator — traverse and safely remove elements.
// Comparable and Comparator — sort numbers and custom objects.
// Stack, Queue, and Deque — understand how elements are processed.
// Collections-based coding problems.