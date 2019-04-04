package taller.design.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeLoans extends LoansAbstract {

    private List<LoansAbstract> loans;

    public CompositeLoans(LoansAbstract... loans) {
        super("none", 0);
        this.loans = new ArrayList<>();
    }

    public  void addLoans(LoansAbstract loan) {
        this.loans.add(loan);
    }

    public  void addLoans(LoansAbstract... loans) {
        this.loans.addAll(Arrays.asList(loans));
    }

    public boolean removeLoans(LoansAbstract loan){
        return this.loans.remove(loan);
    }

    public void clearLoans(){
        this.loans.clear();
    }

    @Override
    public double calcProductRate() {

        double total = 0;
        for (LoansAbstract child: loans){
            total += child.calcProductRate();
        }

        return total;
    }
}
