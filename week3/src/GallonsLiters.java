public class GallonsLiters {

    public static void main(String[] args) {
        int count = 0;

        System.out.println("3.79 Liters = 1.0 Gallon");

        for (int gallons = 1; gallons <= 100; gallons += 4) {
            double liters = gallons * 3.79; 
            String Liters = String.format("%.2f", liters);
            String Gallons = String.format("%.1f", (double) gallons);

            System.out.println(Liters + " Liters = " + Gallons + " Gallons");
            count++;

            if (count % 5 == 0) {
                System.out.println(); 
            }
        }
        System.out.println("We are done!!!!");
    }
}