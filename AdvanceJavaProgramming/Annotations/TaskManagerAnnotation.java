import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantTask {
    String priority() default "High";
}

class TaskManager {

    @ImportantTask(priority = "High")
    public void submitProject() {
        System.out.println("Submit Project");
    }

    public void attendMeeting() {
        System.out.println("Attend Meeting");
    }

    @ImportantTask(priority = "Medium")
    public void completeDocumentation() {
        System.out.println("Complete Documentation");
    }
}

public class AnnotationDemo {

    public static void main(String[] args) {

        Method[] methods = TaskManager.class.getDeclaredMethods();

        System.out.println("Important Tasks:");

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantTask.class)) {

                ImportantTask task =
                        method.getAnnotation(ImportantTask.class);

                System.out.println(
                        "Task: " + method.getName()
                        + ", Priority: "
                        + task.priority()
                );
            }
        }
    }
}