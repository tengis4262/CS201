package Assignment.Lab4;

public class Problem2 {
    final private int bagWeight = 5;
    final private double pricePPound = 5.99;
    final private double tax = 0.725;
    private int bagCount;

    public void setBagCount(int numTotal){
        bagCount = numTotal;
    }
    public double getTotalPrice(){
        double price = bagWeight * bagCount * pricePPound;
        return price;

    }
    public double getTotalPriceTax(){
        double pricet = ((bagWeight * bagCount * pricePPound) - ((bagWeight * bagCount * pricePPound)*tax));
        return Math.round( pricet*100.0)/100.0;
    }
    @Override
    public String toString(){
        String print = "Number of bags sold: " + bagCount + "\n" + "Weight per bag: " + bagWeight + " lb" + "\n" + "Price per pound: $" + pricePPound + "\n" + "Sales tax: " + "7.25%" + "\n" + "Total Price: $" +
                getTotalPriceTax();
        return print;
    }

    public static void main(String[] args) {
        Problem2 price = new Problem2();
        price.setBagCount(78);
        System.out.println(price.toString());
    }

}
