package project9;
/*
 * Name: Johnny Pham
 * Date: 11/11/2021
 * Description: Class that handles the innards of what a task is and contains comparative methods
 */
import java.util.Comparator;
import java.util.Objects;

/**
Class for creating a priority To Do list.
*/
/**
 * Class for creating a priority To Do list.
 */
public class Task implements Comparable<Task> {
        private int priority;
        private String description;

        /*
         * Task Overloaded Constructor
         */
        public Task(int priority, String description) {
                this.priority = priority;
                this.description = description;
        }

        /*
         * setter and getter for priority and description
         */
        public int getPriority() {
                return priority;
        }
        public String getDescription() {
                return description;
        }
        /*
         *to compare priorities however is here because of rule of interface
         */
        @Override
        public int compareTo(Task otherTask) {
                return this.priority - otherTask.priority;
        }
        /*
         * uses integrated has() function to hash the task
         */
        @Override
        public int hashCode() 
        {
            return Objects.hash(description, priority);
        }
        /*
         * compares priority and description and returns true if both priority and description match
         */
        @Override
        public boolean equals(Object obj) {
                Task other = (Task) obj;
                return priority == other.priority || description.equalsIgnoreCase(other.description);
        }

}
