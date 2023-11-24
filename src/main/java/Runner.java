import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        EmployeeAccount employeeAccount1 = new EmployeeAccount("mr", "Freeman");
        EmployeeAccount employeeAccount2 = new EmployeeAccount("Artur", "Markouski");
        EmployeeAccount employeeAccount3 = new EmployeeAccount("Olaf", "Markus");
        EmployeeAccount employeeAccount4 = new EmployeeAccount("dpk", "1999");

        EmployeeAccount employeeAccount5 = new EmployeeAccount("Mask", "walkForTje");
        BusinessTrip businessTrip1 = new BusinessTrip(employeeAccount1,123.03,12);
        BusinessTrip businessTrip2 = new BusinessTrip(employeeAccount4,12.03,2);
        BusinessTrip businessTrip3 = new BusinessTrip(employeeAccount3,3.03,78);
        BusinessTrip businessTrip4 = new BusinessTrip(employeeAccount5,56.88,9);
        BusinessTrip businessTrip5 = new BusinessTrip(employeeAccount2,123.03,12);

        BusinessTrip[] trips = new BusinessTrip[]{businessTrip1,new BusinessTrip(),businessTrip2,businessTrip3,businessTrip4,businessTrip5 };
        for (BusinessTrip trip : trips){
            trip.show();
        }
        trips[5].setTransportationExpenses(1345.00);
        System.out.println("Duration = " + trips[0].getNumberOfDay() + trips[2].getNumberOfDay());

        for (BusinessTrip trip : trips){
            System.out.println(trip);
        }
    }
}
