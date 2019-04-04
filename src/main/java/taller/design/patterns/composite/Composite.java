package taller.design.patterns.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Composite {

    private static final Logger LOGGER = LoggerFactory.getLogger(Composite.class);

    public static void main(String[] args) {

        LOGGER.info("Start Demo...");

        SaleOrder saleOrder = new SaleOrder("Miguel");
        saleOrder.addLoans(
                new SimpleLoans("Prestamo Hiptecario", 7, 200000, 12),
                new CompositeLoans(
                        new SimpleLoans("Prestamo Vehicular", 15, 2000000, 36),
                        new SimpleLoans("Prestamo Vehicular2", 13, 2000000, 36),
                        new SimpleLoans("Prestamo Vehicular3", 18, 2000000, 36),
                        new CompositeLoans(
                                new SimpleLoans("Prestamo Vehicular", 15, 2000000, 36),
                                new SimpleLoans("Prestamo Vehicular2", 13, 2000000, 36),
                                new SimpleLoans("Prestamo Vehicular3", 18, 2000000, 36)
                        )
                )
        );

        saleOrder.printSale();

        SaleOrder saleOrder2 = new SaleOrder("Ronald");
        saleOrder2.addLoans(
                new SimpleLoans("Prestamo Hiptecario", 27, 200000000, 12)

                );

        saleOrder2.printSale();

    }
}
