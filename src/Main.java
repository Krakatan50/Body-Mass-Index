public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 90; // масса в см
        double height = 1.85; //рост в метрах
        double indexMass = service.calculate(mass, height);
        System.out.println(indexMass);

    }
}