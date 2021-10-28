package Glava11.HomeTask.Task18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMap18 {
    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link HashMap}.
     * <p>
     * The general contract of {@code hashCode} is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during
     *     an execution of a Java application, the {@code hashCode} method
     *     must consistently return the same integer, provided no information
     *     used in {@code equals} comparisons on the object is modified.
     *     This integer need not remain consistent from one execution of an
     *     application to another execution of the same application.
     * <li>If two objects are equal according to the {@code equals(Object)}
     *     method, then calling the {@code hashCode} method on each of
     *     the two objects must produce the same integer result.
     * <li>It is <em>not</em> required that if two objects are unequal
     *     according to the {@link Object#equals(Object)}
     *     method, then calling the {@code hashCode} method on each of the
     *     two objects must produce distinct integer results.  However, the
     *     programmer should be aware that producing distinct integer results
     *     for unequal objects may improve the performance of hash tables.
     * </ul>
     * <p>
     * As much as is reasonably practical, the hashCode method defined by
     * class {@code Object} does return distinct integers for distinct
     * objects. (This is typically implemented by converting the internal
     * address of the object into an integer, but this implementation
     * technique is not required by the
     * Java&trade; programming language.)
     *
     * @return a hash code value for this object.
     * @see Object#equals(Object)
     * @see System#identityHashCode
     */

    public static  String str1 = "Point number: ";
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            map1.put(str1 + i, rand.nextInt(20));
        }
        System.out.println(map1);

        for (String str2 : map1.keySet()) {
            System.out.println(str2);
            System.out.println(map1.get(str2));

        }
        Map <>

    }
    @Override
    public int hashCode() {
        int result = str1.hashCode() + 1;
        return result;
    }
}
