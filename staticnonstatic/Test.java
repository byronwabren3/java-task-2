/*
 * the following program contains both the non static and two static methods
 */
package staticnonstatic;
/*
 * class of the project
 */
public class Test {
    private int num1;
    private int num2;
    private int num3;
/*
 * the non static method
 */
    public Test(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String count() {
        return count(num1, num2, num3);
    }
/*
 * the static method
 */
    public static String count(int num1, int num2, int num3) {
        String solution;
        solution = Integer.toString(num1 + num2 + num3);
        return solution;
    }
/*
 * the main function
 */
    public static void main(String[] args) {
        System.out.println(Test.count(1, 2, 3));
        Test t1 = new Test(1, 2, 3);
        System.out.println(t1.count());
    }
}
