public class Main {
    public static void main(String[] args) {

        int clientAccount = 100;
        int accountAdd = 1100;
        int bonus = 0;
        boolean replenishes = true;

        int sum = clientAccount + accountAdd;
        clientAccount = sum;

        if (accountAdd > 1000) {
            bonus = accountAdd / 100;
        } else {

        }

        System.out.println(clientAccount + " Счет клиента ");
        System.out.println(bonus + " Бонусы ");
        System.out.println(clientAccount + bonus + " Итоговая сумма ");
    }
}