public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 98;
        int bmi = service.calculate(height);

        System.out.println("bmi for weight" + weight + "kg");
        System.out.println("and height" + height + "m");
        System.out.println("is equivalent" + bmi + ".");
    }
}
