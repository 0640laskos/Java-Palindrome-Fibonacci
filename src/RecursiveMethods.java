public class RecursiveMethods {

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) { // bir karakterden oluşuyorsa zaten tersten de düzden de aynıdır
            return true;
        } else {
            // Birden çok karakter varsa ilk ve sonun aynı olup olmadığına bakıyoruz
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            if (firstChar == lastChar) {
                // ilk ve son harf aynıysa kalan stringe bakıyoruz
                String middle = word.substring(1, word.length() - 1);
                return isPalindrome(middle);
            } else {
                // ilk ve son farklıysa palindrome değildir false döner
                return false;
            }
        }
    }

    public static void fibonacci(int n) { // n adet sayıdan oluşan fibonacci
        for (int i = 0; i < n; i++) { // sayıların arasına virgül atmak için
            System.out.print(fibonacciRecursive(i) + ", ");
        }
        System.out.println();
    }

    private static int fibonacciRecursive(int n) {
        // write your code here
        // hint: you can use an additional helper method!

        if (n <= 1) {   // 1 veya daha düşükse toplanacak değer yoktur
            return n;   // n=1 => 0 + (-1) negatif sayılar kuralı bozduğu için 1 verilemez
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        String word1 = "level";
        String word2 = "test";
        String word3 = "Cankaya";
        String word4 = "RAR";

        //aşağıda isPalindrome fonksiyonunu bool tanımladığımız için farklı
        //değerlerin de doğruluğunu test edebiliyoruz
        System.out.println("isPalindrome(\"level\"): " + isPalindrome(word1));
        System.out.println("isPalindrome(\"test\"): " + isPalindrome(word2));
        System.out.println("isPalindrome(\"Cankaya\"): " + isPalindrome(word3));
        System.out.println("isPalindrome(\"RAR\"): " + isPalindrome(word4));

        //fibonacci() fonksiyonunu çalıştırma ve test etme
        System.out.println("fibonacci(4): ");
        fibonacci(4);

        System.out.println("fibonacci(10): ");
        fibonacci(10);
    }
}
