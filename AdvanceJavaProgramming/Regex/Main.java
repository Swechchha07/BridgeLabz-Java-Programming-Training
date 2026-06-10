import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantTask {
    String taskName();
}
class Employee {
    @ImportantTask(taskName = "Complete Assignment")
    public void work() {

    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Method m =Employee.class.getMethod("work");
        ImportantTask task =m.getAnnotation(ImportantTask.class);
        System.out.println(task.taskName());
    }
}