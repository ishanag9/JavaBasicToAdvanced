package Lecture3;

public class CashCS50 {
    public static void main(String[] args) {
        int change = 32;
        int quarters = 25;
        int dimes = 10;
        int nickle = 5;
        int penny = 1;
        int coins = 0;
        int sum = 0;
        int remainingCoins = 0;

        remainingCoins = change % quarters;
        coins = change / quarters;
        sum = sum + coins;
        change = remainingCoins;

        remainingCoins = change % dimes;
        coins = change / dimes;
        sum = sum + coins;
        change = remainingCoins;

        remainingCoins = change % nickle;
        coins = change / nickle;
        sum = sum + coins;
        change = remainingCoins;

        remainingCoins = change % penny;
        coins = change / penny;
        sum = sum + coins;
        System.out.println(sum);
    }
}
