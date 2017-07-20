import org.junit.Test;

import java.util.*;

/**
 * Created by jhanward on 7/19/2017.
 */
public class EmployeeTest {
        public static void main(String[] args) {
            MyUtil myUtil= new MyUtil();
            ArrayList<Employee> newList = new ArrayList<Employee>();
            newList = createTestData();
            for (Employee e: newList) {
                System.out.println(e.toString());
            }
            System.out.println("****************");

            Employee emp[] = newList.toArray(new Employee[]{});
            CompareIds compareIds = new CompareIds();
            Employee emp1[] = (Employee[]) myUtil.Sort(emp, compareIds);
            for (Employee e: emp1) {
                System.out.println(e.toString());
            }
            System.out.println("****************");
            CompareName compareName = new CompareName();
            Employee emp2[] = (Employee[]) myUtil.Sort(emp, compareName);
            for (Employee e: emp2) {
                System.out.println(e.toString());
            }
            System.out.println("****************");

        }

        private static ArrayList<Employee> createTestData() {
            ArrayList<Employee> employeeList= new ArrayList<Employee>();
            Employee employeeOne = new Employee(11, "Ram", new Date(1995-1900,11+1,1), new Date(2017-1900,7+1,17),5, Location.Hyderabad);
            employeeList.add(employeeOne);
            Employee employeeThree = new Employee(13, "Mahesh", new Date(1993-1900,2+1,14), new Date(2017-1900,5+1,19),5, Location.Hyderabad);
            employeeList.add(employeeThree);
            Employee employeeFive = new Employee(15, "Gauri", new Date(1990,7,6), new Date(2016,7,17),5, Location.Pune);
            employeeList.add(employeeFive);
            Employee employeeTwo = new Employee(12, "Sham", new Date(1994-1900,1+1,14), new Date(2016-1900,6+1,13),4, Location.Pune);
            employeeList.add(employeeTwo);
            Employee employeeFour = new Employee(14, "Manoj", new Date(1996-1900,5+1,5), new Date(2016-1900,7+1,7),3, Location.Hyderabad);
            employeeList.add(employeeFour);
            return employeeList;
        }

        @Test
        public void testSort () {
            Comparator<Employee> comparator= new EmployeeComparator();
            List<Employee> employeeList = createTestData();
            Collections.sort(employeeList, comparator);
            for (Employee e : employeeList) {
                System.out.println(e);
            }
        }
}


