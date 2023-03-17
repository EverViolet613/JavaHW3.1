public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate (price);
        System.out.println(miles);

        System.out.println();
        System.out.println("30_000");
        System.out.println(service.calculate(30_000));

        System.out.println();
        System.out.println("50_200");
        System.out.println(service.calculate(50_200));

        System.out.println();
        System.out.println("301_000");
        System.out.println(service.calculate(301_000));

    }
}