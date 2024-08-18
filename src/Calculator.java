import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private int valueA;
    private int valueB;
    private BigDecimal bigvalueA;
    private BigDecimal bigvalueB;

    public Calculator() {
        this.valueA = 2;
        this.valueB = 7;
        this.bigvalueA = BigDecimal.valueOf(valueA);
        this.bigvalueB = BigDecimal.valueOf(valueB);
    }

    public int sumValues(){
        return valueA + valueB;
    }

    public int subtractValue(){
        return valueA - valueB;
    }

    public int multiplyValues() {
        return valueA * valueB;
    }

    public int divideValues() {
        return valueA / valueB;
    }

    public BigDecimal bigDivideValues() {
        return bigvalueA.divide(bigvalueB, 4, RoundingMode.FLOOR);
    }
}
