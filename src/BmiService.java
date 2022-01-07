public class BmiService {
    public double calculate(int mass, double height) {
        double indexMass = (mass / (height * height));
        return indexMass;
    }

}
