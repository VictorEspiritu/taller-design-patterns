package taller.design.patterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class SaleOrder {

    private static final Logger LOGGER = LoggerFactory.getLogger(SaleOrder.class);

    private String customer;
    private Date date;
    private CompositeLoans compositeLoans;

    public SaleOrder(String customer) {
        super();
        this.customer = customer;
        this.date = new Date();
        this.compositeLoans = new CompositeLoans();
    }

    public String getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public CompositeLoans getCompositeLoans() {
        return compositeLoans;
    }

    public void addLoans(LoansAbstract... loans){
        this.compositeLoans.addLoans(loans);
    }

    public void printSale(){
        LOGGER.info("=========================================");
        LOGGER.info("Customer: {}", this.getCustomer());
        LOGGER.info("Interest: {}", this.compositeLoans.calcProductRate());
        LOGGER.info("Date: {}", this.getDate());
    }
}
