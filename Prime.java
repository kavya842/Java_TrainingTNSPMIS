class Prime {
    public static void main(String[] args) {
        int n = 17;
        boolean isPrime = n >= 2;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not prime");
    }
}