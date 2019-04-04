package taller.design.patterns.composite;

public abstract class LoansAbstract {
    private String type;
    private double rate;

    public LoansAbstract(String type, double rate) {
        this.setType(type);
        this.setRate(rate);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public abstract double calcProductRate();
}
