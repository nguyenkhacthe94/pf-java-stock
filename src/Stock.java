public class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public static double getChangePercent(double previousClosingPrice, double currentPrice) {
        double changedPercent = (currentPrice - previousClosingPrice)*100 / previousClosingPrice;
        return changedPercent;
    }

    public String display() {
        return "The stock " + name + " that has symbol as " + symbol + " changed " + getChangePercent(previousClosingPrice, currentPrice);
    }
}
