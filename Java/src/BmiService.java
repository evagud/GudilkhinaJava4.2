public class BmiService {
    public double calculate(double heightM, int weightKG) {
        double bmi = weightKG /  Math.pow(heightM , 2);
        return bmi;
    }
}

