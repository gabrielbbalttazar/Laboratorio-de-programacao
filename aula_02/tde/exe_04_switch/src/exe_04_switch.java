public class exe_04_switch {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        while (x < 1000) {

            switch (x % 2) {
                case 0:
                    x = x + 5;
                    break;
                default:
                    x = x * 2;
                    break;
            }
            System.out.println(x);
        }
    }
}