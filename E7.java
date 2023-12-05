package groupProject;

public class E7 {
    public static void main(String[] args) {
        int[] fib = new int[12];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 12; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(fib[i]+" ");

        }
    }
}