/**
 * Circular counter counts 0, ..., limit-1, 0
 */

public class CircularCounter {

    private int counterValue;
    private int limitValue;

    /**
     * Construct a circular counter
     */
    public CircularCounter() {
        counterValue = 0;
        limitValue = 100;
    }

    /**
     * Increment the circular counter
     */
    public void incrementCounterValue()  {
        counterValue = (counterValue + 1) % limitValue;
    }

    /**
     * Accessor method for the counter value
     * @return the counter value
     */
    public int getCounterValue() {
        return counterValue;
    }

    /**
     * Mutator method to set the counter value
     * @param counterValue new value for the counter value
     */
    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }

    /**
     * Accessor method for limit value
     * @return the limit value
     */
    public int getLimitValue() {
        return limitValue;
    }

    /**
     * Mutator method to set the limit value
     * @param limitValue new value for the limit value
     */
    public void setLimitValue(int limitValue) {
        this.limitValue = limitValue;
    }

    /**
     * The toString method
     * @return ounter value and limit value information
     */
    @Override
    public String toString() {
        return "CircularCounter{" +
                "counterValue=" + counterValue +
                ", limitValue=" + limitValue +
                '}';
    }
}
