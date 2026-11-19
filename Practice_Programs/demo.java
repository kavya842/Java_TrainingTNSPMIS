// Write a program to find the greatest of three numbers using if else statement.
class demo {
    public static void main(String[] args) {

        int a = 20;
        int b = 45;
        int c = 30;

        if (a > b && a > c) {
            System.out.println(a + " is greater");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }
    }
}