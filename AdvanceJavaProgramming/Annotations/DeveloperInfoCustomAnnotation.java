import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {
    String name();
    String version();
}

@DeveloperInfo(name="Swechchha Nigam", version="1.0")
class Employee {
}

public class CustomAnnotation {

    public static void main(String[] args) {

        Class<Employee> c = Employee.class;

        DeveloperInfo info =
                c.getAnnotation(DeveloperInfo.class);

        System.out.println("Developer : " + info.name());
        System.out.println("Version : " + info.version());
    }
}