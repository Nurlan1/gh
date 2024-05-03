public class PaymentCalculator {

    public static void main(String[] args) {
        System.out.println(calculateTotal(1000.00, 30.00));
        System.out.println(calculateTotal(1000.00, 30.00, 50.00));
        double[] prices = {100.00, 150.00};
    }
    public static double calculateTotal (double price, double taxRate){
        double total;
        total=price+(price*(taxRate/100));
        return total;
    }
    public static double calculateTotal(double price, double taxRate, double discount){
        double total;
        total =(price-discount)+((price-discount)*(taxRate/100));
        return total;
    }

    public static double calculateTotal(double [] prices, double taxRate){
        double total;
        double sum=0;
        for (double price : prices) {
            sum=sum+price;
        }
        total=sum+(sum*(taxRate/100));
        return total;
    }


}
