public class swap {
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping logic
        int temp=a;
        a=b;
        temp=b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
