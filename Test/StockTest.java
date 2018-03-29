import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    @DisplayName("Test changed percent")
    void getChangePercent() {
        double previousClosingPrice = 34.5;
        double currentPrice = 34.35;
        double expected = -15/34.5;
        double result = Stock.getChangePercent(previousClosingPrice, currentPrice);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test display")
    void display() {
        double previousClosingPrice = 34.5;
        double currentPrice = 34.35;
        String name = "Oracle Corporation";
        String symbol = "ORCL";
Stock display = new Stock(name, symbol);
        String expected = "The stock Oracle Corporation that has symbol as ORCL changed " + Stock.getChangePercent(previousClosingPrice, currentPrice);
        String result = "The stock " + name + " that has symbol as " + symbol + " changed " + Stock.getChangePercent(previousClosingPrice, currentPrice);
        assertEquals(expected, result);
    }
}