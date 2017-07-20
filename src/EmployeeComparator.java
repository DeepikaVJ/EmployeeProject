import java.util.Comparator;

/**
 * Created by jhanward on 7/20/2017.
 */
public class EmployeeComparator  implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getEmployeeId() - o2.getEmployeeId());
    }
}
