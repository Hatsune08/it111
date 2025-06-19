import java.util.Scanner;

public class DailySpecialsFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = "";
        boolean isWeekday = false;
        String coffee = "";
        double price = 0;
        int weekendCount = 0;

        while (!isWeekday) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");
            day = scanner.nextLine();

            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                System.out.println("Please enter a weekday, not weekend!");
                weekendCount++;
                if (weekendCount >= 2) {
                    System.out.println("You have entered a weekend day twice. Exiting the program.");
                    scanner.close();
                    return; 
                }
            } else {
                isWeekday = true;
            }
        }

        // 平日が入力された場合だけこの先に進む
        switch (day.toLowerCase()) {
            case "monday":
                coffee = "Latte";
                price = 4.95;
                break;
            case "tuesday":
                coffee = "Matcha Latte";
                price = 5.95;
                break;
            case "wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                break;
            case "thursday":
                coffee = "Americano";
                price = 1.00;
                break;
            case "friday":
                coffee = "Houjicha Latte";
                price = 6.95;
                break;
        }

        System.out.println(day + "'s coffee of the day is a " + coffee + " and the price is $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        if (quantity == 0) {
            System.out.println("Looks like you don't want any coffee today. But that's okay! Have a great day!");
        } else if (quantity >= 1 && quantity <= 4) {
            System.out.printf("You have ordered %d %s(s). Your total is $%.2f\n", quantity, coffee, total);
        } else if (quantity >= 5 && quantity < 10) {
            double discount = total * 0.10;
            System.out.printf("Looks like you qualify for a group discount! Your regular price is $%.2f.\n", total);
            System.out.printf("You have ordered %d %s(s) but will only be charged $%.2f\n", quantity, coffee, total - discount);
        } else {
            double discount = total * 0.20;
            System.out.printf("A bigger group discount! Your regular price is $%.2f.\n", total);
            System.out.printf("You have ordered %d %s(s) but will only be charged $%.2f\n", quantity, coffee, total - discount);
        }

        scanner.close();
    }
}
