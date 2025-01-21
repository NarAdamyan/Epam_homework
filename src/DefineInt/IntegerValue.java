package DefineInt;

public class IntegerValue extends Number implements Numeric {
    private final Number num;

    public IntegerValue(Number num) {
        this.num = num;
    }

    @Override
    public int intValue() {
        return num.intValue();
    }

    @Override
    public long longValue() {
        return num.longValue();
    }

    @Override
    public float floatValue() {
        return num.floatValue();
    }

    @Override
    public double doubleValue() {
        return num.doubleValue();
    }

    public Integer defineInteger() {
        return num.intValue();
    }

    public boolean isInt() {
        return num.doubleValue() == num.intValue();

    }
}
