//!1. What is Stream API?
// Definition: The Stream API in Java is a feature introduced in Java 8 that is used to process collections of data in a functional style using operations such as filtering, mapping, sorting, and collecting.
// Simple ga cheppalante, oka list lo unna numbers ni filter cheyadam, sort cheyadam, transform cheyadam lanti operations easy ga cheyochu.

//! Normal Approach:-
class Demo1{
    public static void main(String[] args){
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        for(int n:nums){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}