public class DailySpecialsHelper {

    public static boolean isWeekend(String day) {
        return day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
    }

    public static String getCoffee(String day) {
        return switch (day.toLowerCase()) {
            case "monday" -> "Latte";
            case "tuesday" -> "Matcha Latte";
            case "wednesday" -> "Cappuccino";
            case "thursday" -> "Americano";
            case "friday" -> "Houjicha Latte";
            default -> "Unknown";
        };
    }

    public static double getPrice(String day) {
        return switch (day.toLowerCase()) {
            case "monday" -> 4.95;
            case "tuesday" -> 5.95;
            case "wednesday" -> 4.35;
            case "thursday" -> 1.00;
            case "friday" -> 6.95;
            default -> 0.0;
        };
    }

    public static double calculateTotal(double price, int amount) {
        if (amount >= 10) return price * amount * 0.8;
        if (amount >= 5) return price * amount * 0.9;
        return price * amount;
    }
}
