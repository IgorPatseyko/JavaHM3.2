public class Main {
    public static void main(String[] args) {

        // Объявление переменных для входных данных и параметров программы
        double initialBalance = 100.0; // Начальный счет клиента в рублях
        double topUpAmount = 1100.0; // Сумма пополнения в рублях

        // Рассчитываем бонусные рубли
        double bonus = 0.0;
        if (topUpAmount > 1000.0) {
            int bonusPer100Rubles = (int) (topUpAmount / 100.0);
            bonus = bonusPer100Rubles * 1.0;
        }

        // Рассчитываем итоговый счет
        double totalBalance = initialBalance + topUpAmount + bonus;

        // Выводим результат на экран
        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}
