package quizes.q2.dimitri_durmishian_1.uv;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int tax = 8900; // tetri
        int water = 30;
        int gas = 375;
        int electricity = 6700;
        int parking = 5700;
        int otherExpenses = tax + water + gas + electricity + parking; // tetri
        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalExpenses);
        System.out.println("The overall profit is: " + profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalExpenses) {
        // Calculate total revenue
        int totalRevenue = pricePerCoffee * numCoffeeSold;
        // Calculate profit in tetri
        int profitInTetri = totalRevenue - totalExpenses;
        // Convert profit to Laris (1 Lari = 100 tetri)
        return profitInTetri / 100.0;
    }
}
