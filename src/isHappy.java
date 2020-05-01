import java.util.Arrays;

/**
 * isHappy
 *
 * @author Henry
 * @date 2020/05/01
 */
public class isHappy {

        private static final Integer[] unHappyList = {4,16,37,58,89,145,42,20};

    public static void main(String[] args) {
        System.out.println(testHappy(19));

    }
        public static boolean testHappy(int n) {
            while(n != 1){
                if(Arrays.asList(unHappyList).contains(n)){
                    return false;
                }
                n = calculateValues(n);
            }
            return true;
        }

        private static Integer calculateValues(Integer number){
            int sum=0,cur;
            while(number > 0 ){
                cur = number % 10;
                sum = sum + cur*cur;
                number /=number;
            }
            return sum;
        }

}
