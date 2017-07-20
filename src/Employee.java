import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jhanward on 7/19/2017.
 */
public class Employee {
    int employeeId;
    String name;
    Date dob;
    Date doj;
    int departmentId;
    Location location;
    Object o;

    public Employee(int employeeId, String name, Date dob, Date doj, int departmentId, Location location) {
        this.employeeId = employeeId;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.departmentId = departmentId;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                ", departmentId=" + departmentId +
                ", location=" + location +
                ", o=" + o +
                '}';
    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}



