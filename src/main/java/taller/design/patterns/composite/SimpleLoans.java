package taller.design.patterns.composite;

public class SimpleLoans extends LoansAbstract {

    private double mount;
    private int months;

    public SimpleLoans(String type, double rate, double mount, int months) {
        super(type, rate);
        this.setMonths(months);
        this.setMount(mount);
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public double calcProductRate() {
        return this.getMount() * this.getRate() / 100;
    }
}
