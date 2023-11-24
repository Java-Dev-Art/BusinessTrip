public class BusinessTrip {
    private static final double DAILY_ALLOWANCE_RATE_IN_EURO = 156.00;
    private EmployeeAccount employeeAccount;
    private double transportationExpenses;
    private int numberOfDay;

    public BusinessTrip() {
    }

    public BusinessTrip(EmployeeAccount employeeAccount, double transportationExpenses, int numberOfDay) {
        this.employeeAccount = employeeAccount;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDay = numberOfDay;
    }

    public EmployeeAccount getEmployeeAccount() {
        return employeeAccount;
    }

    public void setEmployeeAccount(EmployeeAccount employeeAccount) {
        this.employeeAccount = employeeAccount;
    }

    public double getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportationExpenses(double transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }
    public  double getTotal(){
        return transportationExpenses + DAILY_ALLOWANCE_RATE_IN_EURO * numberOfDay;
    }
    public void show(){
        System.out.printf(" rate = %.2f%n account = %s%n transport = %.2f%n days = %d%n total = %.2f%n____________%n", DAILY_ALLOWANCE_RATE_IN_EURO, getEmployeeAccount(), getTransportationExpenses(), getNumberOfDay(), getTotal());
    }

    @Override
    public String toString() {
        return employeeAccount +
                ";" + transportationExpenses +
                ";" + numberOfDay ;
    }
}
