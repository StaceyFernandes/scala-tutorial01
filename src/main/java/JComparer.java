import java.lang.reflect.Array;

/**
 * Checks if the first number is greater than the second and return true.
 */
class JComparer implements JComparerTrait {

    /**
     * @param num1
     * @param num2
     * @return true if num1 > num2
     */
    public Boolean compare(Integer num1, Integer num2) {
        if (num1 > num2) return true;
        return false;
    }

//    public Boolean compareUsingInterface()

}
