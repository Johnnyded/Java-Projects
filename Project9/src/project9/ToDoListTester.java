package project9;
/*
 * Name: Johnny Pham
 * Date: 11/11/2021
 * Description: Main Driver class to test and run everything
 */

public class ToDoListTester {
    public static void main(String [] args) {
        ToDoList tdl = new ToDoList();
        /*
         * /PrioQ tester
         */
        System.out.println("Adding the following 6 items to the queue.");
        System.out.println("add 1 Complete Programming Exercise 15.11");
        tdl.addTask("add 1 Complete Programming Exercise 15.11");
        System.out.println("add 8 Read for tomorrow's class");
        tdl.addTask("add 8 Read for tomorrow's class");
        System.out.println("add 3 Soccer practice");
        tdl.addTask("add 3 Soccer practice");
        System.out.println("add 6 Call parents");
        tdl.addTask("add 6 Call parents");
        System.out.println("add 5 Have dinner with friends");
        tdl.addTask("add 5 Have dinner with friends");
        System.out.println("add 9 Sleep well");
        tdl.addTask("add 9 Sleep well");
        /*
         * /bad command tester
         */
        System.out.println("\nEntering 'add bad command'");
        tdl.addTask("add bad command");
        System.out.println("Expected: The priority must be an integer between 1 and 9.");
        System.out.println();
        /*
         * /pulling tester
         */
        System.out.println("Pulling most urgent items out.");
        tdl.nextTask();
        System.out.println("Expected: Complete Programming Exercise 15.11");
        tdl.nextTask();
        System.out.println("Expected: Soccer practice");
        tdl.nextTask();
        System.out.println("Expected: Have dinner with friends");
        tdl.nextTask();
        System.out.println("Expected: Call parents");
        tdl.nextTask();
        System.out.println("Expected: Read for tomorrow's class");
        tdl.nextTask();
        System.out.println("Expected: Sleep well");
        tdl.nextTask();
        System.out.println("Expected: There are no more tasks in the queue.\n");
        /*
         * Duplicate Tester
         */
        System.out.println("Duplicate Tester that implement hasCode() and equals()");
        System.out.println("add 10 Pass 277");
        System.out.println("add 10 Pass 277");
        tdl.addTask("add 10 Pass 277");
        tdl.addTask("add 10 Pass 277");
        tdl.clear();
        /*
         * Main Sample Output
         */
        tdl.run();
     }
}
  


