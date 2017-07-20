import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jhanward on 7/19/2017.
 */
public class BookTest {
    public static void main(String[] args) {
        MyUtil myUtil= new MyUtil();
        ArrayList<Book> newList = new ArrayList<Book>();
        newList = createTestData();
        for (Book e: newList) {
            System.out.println(e.toString());
        }
        System.out.println("****************");

        Book emp[] = newList.toArray(new Book[]{});
        CompareBookIds compareBookIds = new CompareBookIds();
        Book emp1[] = (Book[]) myUtil.Sort( emp, compareBookIds);
        for (Book e: emp1) {
            System.out.println(e.toString());
        }
        System.out.println("****************");
        Compare compareBookTitle = new CompareBookTitle();
        Book emp2[] = (Book[])myUtil.Sort(emp, compareBookTitle);
        for (Book e: emp2) {
            System.out.println(e.toString());
        }
    }

    private static ArrayList<Book> createTestData() {
        ArrayList<Book> BookList= new ArrayList<Book>();
        Book BookOne = new Book(11,"ABC", "PQR", 101017);
        BookList.add(BookOne);
        Book BookThree = new Book(14, "XYZ", "aqk", 14556);
        BookList.add(BookThree);
        Book BookFive = new Book(15, "Gnbasm", "ygy", 1234);
        BookList.add(BookFive);
        Book BookTwo = new Book(12, "Shamhh","ggfd", 1452);
        BookList.add(BookTwo);
        Book BookFour = new Book(14, "Mhsajgd", "gshs",1254);
        BookList.add(BookFour);
        return BookList;
    }
}
