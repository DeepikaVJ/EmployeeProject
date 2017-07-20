/**
 * Created by jhanward on 7/19/2017.
 */
public class CompareBookTitle implements Compare {
    public int compareMethod(Object o1, Object o2) {
        int result = 0;
        Book e1=(Book)o1;
        Book e2=(Book)o2;
        if(e1.getBookTitle().compareTo(e2.getBookTitle()) > 0) {
            return 1;
        }
        else if (e1.getBookTitle().compareTo(e2.getBookTitle()) < 0) {
            return -1;
        }
        return result;
    }
}
