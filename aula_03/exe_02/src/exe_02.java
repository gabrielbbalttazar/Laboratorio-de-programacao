public class exe_02 {
    public static void main(String[] args) {

        int num = 101;
        int numDivisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numDivisores++;
            }
        }
        if (numDivisores == 2) {
            System.out.println(num + " é um número primo!");
        } else {
            System.out.println(num + " não é um número primo!");
        }
    }
}
