/**
 * Created by jhanward on 7/19/2017.
 */
public class MyUtil {

    public static Object[] Sort(Object []array, Compare compare) {
        Object temp = null;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (compare.compareMethod(array[i], array[j]) < 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

