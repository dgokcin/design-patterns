package architectural.threetier;

public class PresentationLayer {
    public static void main(String[] args) {

        int employeeId = 5;
        BusinessLayer bl = new BusinessLayer();
        double res = bl.calculateEmployeeTotalVal(employeeId);
        System.out.println("Employee Id " + employeeId + " total val is " + res);
    }
}

