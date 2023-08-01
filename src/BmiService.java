public class BmiService {

    public int calculate(double heightInMeters, double weightInKg) {
        double bmiIndex = weightInKg / (heightInMeters * heightInMeters);
        return (int) bmiIndex;
    }
}