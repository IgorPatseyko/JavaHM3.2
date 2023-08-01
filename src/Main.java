public class Main {
    public static void main(String[] args) {

        // Объявление переменных для входных данных и параметров программы
        double ticketCost = 13676; // Стоимость билета в рублях
        double milesPerRub = 20.0; // Количество рублей для одной бонусной мили

        // Рассчет количества бонусных миль
        int bonusMiles = (int) (ticketCost / milesPerRub);

        // Вывод результата на экран
        System.out.println("За купленный билет начислено " + bonusMiles + " бонусных миль.");
    }
}