/*
(Java / C#) You will be given a list of integers.
You need to output the smallest absolute difference
you can get from any of the pairs you can build using
the integers of the list. For clarity, you are required to find
min(abs(A[i] - A[j])), i != j, A being the list of integers.
List size will be given in the first line of the input. List elements
will be given in the second line, separated by a single blank space.
 */


//First type of solution Task 2

package TechTask;
/*
public class Main {
    public static void main(String[] args) {
        int [ ] array =  {1, 42, 73, 41, 32, 53, 4, 24, 57, 42, 74, 55, 36};

        int min = array[0];
        int min2;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            }
        }


        System.out.println("    ");
        System.out.println("Minimal number: " + min);
    }
}
*/
//Second type of solution Task 2



public class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 100;

        System.out.print(num1 + " , ");
        System.out.print(num2);
        System.out.println();
        System.out.println(Math.min(num1,num2));
}}
