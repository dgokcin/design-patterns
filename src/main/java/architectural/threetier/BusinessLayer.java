package architectural.threetier;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BusinessLayer {

    public double calculateEmployeeTotalVal(int employeeId) {
        DataLayer dl = new DataLayer();
        double salary = dl.returnSalary(employeeId);
        double taxRate = dl.returnTaxRate();
        double val = salary * (1 + taxRate);
        return round(val, 2); // round to 2 decimal places
    }

    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

