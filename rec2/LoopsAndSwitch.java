public class LoopsAndSwitch {

    public static void main(String[] args) {
        /* Traditional If - Else If - Else Structure:
         * if (boolean condition) {
         *     code to run if boolean condition was true
         * } else if (another boolean condition) {
         *     code to run if other boolean condition was true
         * } else {
         *     code to run if none of the boolean conditions were true
         * }
        */
        int favoriteNumber = 400;
        if (favoriteNumber > 1000) {
            System.out.println("Such a high favorite number!");
        } else if (favoriteNumber < 50) {
            System.out.println("Such a low favorite number!");
        } else {
            System.out.println("Goldilocks favorite number!");
        }

        // /* Switch Statement Structure:
        //  * switch (expr) {
        //         case 1:
        //             // executed only when case 1 holds
        //             break;
        //         case 2:
        //             // executed only when case 2 holds
        //         case 3:
        //             // executed whenever case 2 or 3 hold
        //             break;
        //         default:
        //             // executed only when other cases don't hold
        //     }
        //     expr can be any of the following: char, int, short, byte, String
        // */

        // int leastFavoriteNumber = 61;
        // switch(leastFavoriteNumber) {
        //     case 42:
        //         System.out.println("The answer to everything");
        //         break;
        //     case 198:
        //         System.out.println("Huge number!");
        //     case 61:
        //         System.out.println("Ahhhh! What a horrible number!");
        //         break;
        //     default:
        //         System.out.println("No case matched");
        // }

        // /* Practice Question:
        //  *  Turn the above switch block into an if - else if - else block
        // */

        // // -----------------------------------------------------------------------------------------

        // /* Loops (For, While, Do-While)
        //  * for (initializer; condition; update) {
        //  *     code to be executed
        //  * }
        //  *
        //  * initialize variable outside
        //  * while (condition) {
        //  *     code to be executed
        //  *     update variable to approach end condition
        //  * }
        //  *
        //  * initialize variable outside
        //  * do {
        //  *     code to be executed
        //  *     update variable to approach end condition
        //  * } while (condition)
        // */

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Loop Iteration: " + i);
        // }

        // int i = 0;
        // while (i < 10) {
        //     System.out.println("Loop Iterati0on: " + i);
        //     i++; // this is the same as i = i + 1;
        // }

        // int j = 0;
        // do {
        //     System.out.println("Loop Iteration: " + j);
        //     j++;
        // } while (j < 10);

        // /* Practice Question:
        //     Turn the following for loop into a while loop:
        //         for (int i = 25; i > 0; i = i - 5) {
        //             System.out.println(i);
        //         }
        // */

    }
}