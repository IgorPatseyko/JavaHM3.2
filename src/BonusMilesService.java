public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int milesPerRubles = 20; // 1 миля за 20 рублей
        return ticketPrice / milesPerRubles;
    }
}