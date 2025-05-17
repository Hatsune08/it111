import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!):");
        String specials = input.nextLine();

        if (specials.equals("Saturday") || specials.equals("Sunday")) {
            System.out.println("Please enter a weekday, not weekend!");
            input.close();
            return;
        }

        String coffee;
        double price;

        switch (specials) {
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                break;
            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                break;
            case "Wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                break;
            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                break;
            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                break;
            default:
                System.out.println("Please enter a valid day, or check your spelling!");
                input.close();
                return;
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        int quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else {
            double total = price * quantity;
            String formattedTotal = String.format("%.2f", total);
            System.out.println(quantity + " " + coffee + "s have been ordered totaling $" + formattedTotal + " dollars");
        }

        input.close();
    }
}
