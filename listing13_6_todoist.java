
public class ToDoList {

    String task;
    int priority;
    boolean repeat;

    public ToDoList() {
        task = "Empty Dishwasher";
        priority = 1;
        repeat = true;
    }

    public ToDoList(String task, int priority, boolean repeat) {
        this.task = task;
        this.priority = priority;
        this.repeat = repeat;
    }

    public void print(String name) {
        System.out.println(task + ", priority: " + priority
                + ", repeat: " + repeat + "\nAssigned to: " + name);
    }

    public void print() {
        System.out.println(task + ", priority: " + priority
                + ", repeat: " + repeat);
    }

    public static void main(String[] args) {
        ToDoList todo = new ToDoList("Homework", 1, true);
        todo.print();
        todo.print("Bob Fisher");
    }
}
