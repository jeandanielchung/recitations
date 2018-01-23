import java.util.Scanner;
import java.io.File;

public class ArrayFun {
    public static void main(String[] args) throws Exception {
        /* Arrays in Java are Objects with a fixed number of elements that are all the same type
         * Syntax to create an array:
         * type_of_elements[] name_of_variable = new type_of_elements[size of array (int)]
        */
        int[] nums = new int[10];
        /* Useful array information:
         * array_name.length == size of the array
         *
         * arrays initialize each element to be the default value of the type (so for the example above, the array "nums"
         * would look like this: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] since the default value for an int is 0)
         *
         * You can also declare arrays like this, but it doesn't look as nice:
         * int nums[] = new int[10];
         *
         * or you can break up declaration and initialization:
         * int nums[];
         * nums = new int[10];
        */

        // Syntax for accessing elements in an array (remember indexing starts at 0!)
        // name_of_array[index]
        int onenum = nums[5];

        // Syntax for modifying elements in an array (remember indexing starts at 0!)
        // name_of_array[index] = new_value;
        nums[5] = 20;

        // We can use loops to traverse arrays:
        // Syntax:
        // for (int i = starting_index; some condition (usually i < array_name.length); some update (usually i++)) {
        //      code to be executed
        // }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // We can use loops to modify elements in arrays as well:

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = 42;
            }
        }
        System.out.println("\n-------------------");
        // Re-printing the elements
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        // Enchanced for-loop: (easier to write than traditional for loop, but I can't change elements in original array)
        // Syntax:
        // for (type_of_elements variable_name : name_of_array) {
        //      code to be executed
        // }
        System.out.println("\n-------------------");
        for (int someNum : nums) {
            System.out.println(someNum);
        }
        System.out.println("\n-------------------");
        // Providing initial values for an array - Syntax:
        // type_of_elements[] array_name = {element0, element1, element2, element3};
        String[] colors = {"green", "red", "blue", "orange"};
        System.out.println(colors[1]);
        System.out.println("\n-------------------");
        /* Common Problems:
         * What happens if I try to do this?
         * System.out.println(nums[nums.length]);
         *
         * What about this?
         * System.out.println(nums[-1]);
         *
         * What about this?
         * System.out.println(nums[1 / 0]);
         *
         * And this?
         * String[] names = new String[-5];
         */

        // Random Java Stuff to know:
        // Mixed Declarations:
        // double scores[], highScore;
        // scores = new double[10];
        // highScore = 1.0;

        // Large Practice Question: Read from the file called students.txt and store the student's names in an array
        // then print out only the students whose names have less than 6 letters
        // There are only 20 students in the file (useful for knowing how big you want your array to be)
    }
}