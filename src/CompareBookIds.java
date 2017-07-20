/**
 * Created by jhanward on 7/19/2017.
 */
public class CompareBookIds implements Compare {
    public int compareMethod(Object o1, Object o2) {
        int result = 0;
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        if (b1.getBookId() > b2.getBookId()) {
            return 1;
        } else if (b1.getBookId() < b2.getBookId()) {
            return -1;
        }
        return result;
    }
}