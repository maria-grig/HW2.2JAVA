public class Main {
    public static void main(String[] args) {
        int currentBalance = 50;
        int topUpAmount = 3000;

        int bonus = topUpAmount / 100;
        if (topUpAmount >= 1000) {
            bonus = topUpAmount /100;
        } else {
            bonus = 0;
                }

        int bonusTotal = topUpAmount + bonus;
        int currentBalanceTotal = currentBalance + bonusTotal;

        System.out.println("Ваш баланс пополнен на " + bonusTotal + "руб. Общий баланс вашего счёта составляет " + currentBalanceTotal + "руб.");
        }

}
