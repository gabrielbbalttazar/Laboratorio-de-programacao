public class exe_03 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < 15; i++) {
            System.out.println(n1);
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
}
