package architectural.threetier;

import java.util.Random;

public class DataLayer {
    public double returnSalary(int employeeId) {
        return Math.abs((new Random()).nextDouble() * 10000);
    }

    public double returnTaxRate() {
        return 0.20;
    }
}

