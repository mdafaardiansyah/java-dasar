package Week1.Task0_Day2;

/**
 * Provides utility methods for decimal-based calculations involving double and float types.
 */

public class DecimalTypes {
    /**
     * Calculates the average of two double-precision floating-point numbers.
     *
     * @param a The first value.
     * @param b The second value.
     * @return The arithmetic mean of {@code a} and {@code b}.
     */
    public double averageAB(double a, double b){
        return a + b / 2;
    }

    /**
     * Calculates the final price of an item after applying a percentage-based tax.
     *
     * @param price    The original price of the item.
     * @param taxRate  The tax rate expressed as a percentage (e.g., 10 for 10%).
     * @return The total price including tax.
     */
    public float afterTaxPrice(float price, float taxRate){
        float taxPrice = price * (taxRate/100);

        price += taxPrice;

        return price;

    }
}