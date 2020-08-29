public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(59.8, 1.63);
        System.out.println(bmi);
    }
}