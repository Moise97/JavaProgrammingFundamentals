/**
 * Keeps ticker symbol, number of shares and dividend information.
 */

public class Stock {

    private int numberOfShares;
    private String tickerSymbol;
    private double dividend;

    /**
     * Construct a Stock with zero shares
     */
    public Stock() {
        numberOfShares = 0;
        tickerSymbol = "[NA]";
        dividend = 0.0;
    }

    /**
     * Computes and returns yearly dividend
     * @return the yearly dividend
     */
    public double yearlyDividend() {
        double totalDividend;
        totalDividend = numberOfShares * dividend;
        return totalDividend;
    }

    /**
     * Accessor method for the number of shares
     * @return the number of shares
     */
    public int getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * Mutator method to set the number of shares
     * @param numberOfShares new value for the number of shares
     */
    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    /**
     * Accessor method for the ticker symbol
     * @return the ticker symbol
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Mutator method to set the ticker symbol
     * @param tickerSymbol new value for the ticker symbol
     */
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    /**
     * Accessor method for the dividend
     * @return the number of dividend
     */
    public double getDividend() {
        return dividend;
    }

    /**
     * Mutator method to set the dividend
     * @param dividend new value for the dividend
     */
    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    /**
     * The toString method
     * @return number of shares and ticker symbol
     */
    @Override
    public String toString() {
        return "Stock{" +
                "numberOfShares=" + numberOfShares +
                ", tickerSymbol='" + tickerSymbol + '\'' +
                '}';
    }
}
