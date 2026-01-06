public class DecimalTypes {
    public double averageAB(double a, double b){
        return a + b / 2;
    }

    public float afterTaxPrice(float price, float taxRate){
        float taxPrice = price * (taxRate/100);

        price += taxPrice;

        return price;

    }
}
