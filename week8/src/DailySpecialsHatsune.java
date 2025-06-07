import java.util.Scanner;

public class DailySpecialsHatsune {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String day = "";            
        boolean isWeekday = false;  
        
       
        while (!isWeekday) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");
            day = scanner.nextLine();  
            
            
            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                System.out.println("Please enter a weekday, not weekend!");
            
            
            } else if (
                day.equalsIgnoreCase("Monday") ||
                day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") ||
                day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday")
            ) {
               
                isWeekday = true;
            
            } else {
                
                System.out.println("Invalid input - Please check your spelling!!!");
            }
        }
        
        
        String coffeeName = "";
        double price = 0.0;
        
      
        if (day.equalsIgnoreCase("Monday")) {
            coffeeName = "Espresso";
            price = 1.99;
        } else if (day.equalsIgnoreCase("Tuesday")) {
            coffeeName = "Matcha Latte";
            price = 4.95;
        } else if (day.equalsIgnoreCase("Wednesday")) {
            coffeeName = "Americano";
            price = 3.65;
        } else if (day.equalsIgnoreCase("Thursday")) {
            coffeeName = "Cappuccino";
            price = 4.15;
        } else if (day.equalsIgnoreCase("Friday")) {
            coffeeName = "Hojicha Latte";
            price = 4.55;
        }
        
        System.out.println(day + "'s coffee of the day is a " + coffeeName +
                           " and the price will be $" + price);
        
    
        System.out.println("How many " + coffeeName + "s would you like to order?");
        int quantity = scanner.nextInt();
        
        if (quantity <= 0) {
            System.out.println("Looks like you don't like " + coffeeName + "s! So sad!! see you next time!");
        } else {
            
            double total = price * quantity;
            System.out.println(quantity + " " + coffeeName + "s have been ordered totaling $" +
                               total + " dollars! Thank you for your order!");
        }
        
        
        scanner.close();
    }
}
