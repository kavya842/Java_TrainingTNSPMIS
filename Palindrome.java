class Palindrome {
    public static void main(String[] args) {
        int n = 122, original = n, rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
