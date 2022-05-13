package project9;
/*
 * Name: Johnny Pham
 * Date: 11/11/2021
 * Description: ToDoList Class that contains run(), addTask(), nextTask() methods that handle adding a task, displaying them, and exception handling
 */
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList 
{       
        //Priority Queue creation
        PriorityQueue<Task> prioQ = new PriorityQueue<Task>();;
        public ToDoList() {
        }

        /*
         * Menu Display and main interaction method
         */
        public void run() 
        {
                String option = "";
                System.out.println("To Do List - Please enter an option");
                System.out.println(" add priority description (add a new task)");
                System.out.println(" next (remove and print most urgent task)");
                System.out.println(" quit (exit this program)");
                System.out.println();

                Scanner input = new Scanner(System.in);

                do {
                        System.out.print("> ");
                        option = input.nextLine();
                        if (option.startsWith("add")) 
                                {
                                addTask(option);
                                } 
                        else if (option.equals("next")) 
                                {
                                nextTask();
                                }
                   } 
                while (!option.equals("quit"));
        }
        /*
         * method for the input 'next' that removes and displays the priority and description until its empty
         */
        public void nextTask() {
                Task next = null;
                if (!prioQ.isEmpty())
                        next = prioQ.remove();

                if (next == null) 
                        {
                        System.out.println("There are no tasks in the list.");
                        } 
                else 
                        {
                        System.out.println(next.getDescription());
                        }
        }

        /*
         * method for adding task with duplicate and invalid input handling
         */
        public void addTask(String addOption) {
                Scanner input = new Scanner(addOption);
                input.next();
                if (!input.hasNextInt()) {
                        System.out.println("The priority must be an integer between 1-9");
                        return;
                }
                int priority = input.nextInt();
                String task = input.nextLine();
                Task t = new Task(priority, task);
                //duplicate task handling; Implementation of hashCode() and equals()
                if (prioQ.contains(t)) {
                        for (Task k : prioQ)
                            if (t.equals(k))
                        System.out.println("Task already exists!\nHashcode of inputted task: " +t.hashCode() +"\nHashcode of duplicate task:" +k.hashCode() + "\nPlease try again:\n");
                } else 
                    {
                        prioQ.add(t);
                    }
                
        }
        /*
         * clear the priority Queue method
         */
        public void clear()
        {
            prioQ.clear();
        }

        
}
