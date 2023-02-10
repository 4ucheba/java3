public class Main {
    public static void main(String[] args) {

        int startBalance = 300; // начальный баланс
        int paid = 1200; // пополнение счёта
        int finalBalance; // итоговый баланс
        int bonus; // бонус

        if (paid > 1000) {
            bonus = paid / 100;
            finalBalance = startBalance + paid + bonus;
        } else {
            finalBalance = startBalance + paid;
            bonus = 0;
        }
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Размер бонуса: " + bonus);
    }
}