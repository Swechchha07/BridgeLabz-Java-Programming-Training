import java.util.*;
class Employee{
    int id;
    String name;
    double salary;
    Employee next;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.next=null;

    }
}
public class EmployeeRecords {
    Employee head=null;
    void addEmployee(int id,String name,double salary){
        Employee newEmployee=new Employee(id,name,salary);
        if(head==null){
            head=newEmployee;
        }else{
            Employee temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newEmployee;
        }
        System.out.println("Employee added successfully");
    }
    void displayEmployee(){
        if(head==null){
            System.out.println("No employee records");
            return;
        }else{
            Employee temp=head;
            while(temp!=null){
                System.out.println("ID: "+ temp.id);
                System.out.println("Name: "+ temp.name);
                System.out.println("Salary: "+ temp.salary);
                temp=temp.next;
            }
        }

    }
    void searchEmployee(int id){
        Employee temp=head;
        while(temp!=null){
            if(temp.id==id){
                System.out.println("Employee found");
                System.out.println("Name: "+temp.name);
                System.out.println("Salary: "+temp.salary);
                return;

            }
            temp=temp.next;
        }
        System.out.println("Employee not found");
    }
    void deleteEmployee(int id){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.id==id){
            head=head.next;
            System.out.println("Employee deleted");
            return;
        }
    }

    public static void main(String[] args) {
        EmployeeRecords e=new EmployeeRecords();
        e.addEmployee(1,"Swechchha",20000);
        e.displayEmployee();
    }
}
