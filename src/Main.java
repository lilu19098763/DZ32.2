
public class Main {
    public static void main(String[] args) {
        int intialBalance = 100;
        int addend = 1200;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;

            int finalBalance = intialBalance + addend + bonus;

            System.out.println("Итоговый счет = " + finalBalance);
            System.out.println("бонус = " + bonus);

        }
    }
}
