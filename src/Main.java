public class Main {
    public static void main(String[] args) {
        int check = 2000, refill = 400;
        int count = check + refill;
        if (count < 1000) {
            System.out.println(count);
        } else {
            System.out.println("Ваш бонус - " +(refill/100) + "." + " Итоговый счет - " + (count + (refill / 100))+ ".");
        }
    }
}
