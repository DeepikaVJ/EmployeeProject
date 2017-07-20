/**
 * Created by jhanward on 7/19/2017.
 */
class CompareName implements Compare {
    public int compareMethod(Object o1, Object o2) {
        int result = 0;
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        if(e1.getName().compareTo(e2.getName()) > 0) {
            return 1;
        }
        else if (e1.getName().compareTo(e2.getName()) < 0) {
            return -1;
        }
        return result;
    }
}
