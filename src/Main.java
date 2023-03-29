public class Main {
    public static void main(String[] args) {
        int check = 200, refill = 130;
        int count = check + refill;
        if (count < 1000) {
            System.out.println(count);
        } else {
            System.out.println(count + (refill / 100));
        }
    }
}
