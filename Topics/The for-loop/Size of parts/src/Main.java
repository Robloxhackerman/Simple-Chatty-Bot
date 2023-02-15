import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 0;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();

            if (num == 0){
                perfect++;
            } else if (num == 1) {
                larger++;
            } else if (num == -1) {
                smaller++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}