import java.util.*;
import java.io.*;
class Contact implements Serializable {
    int id;
    String name;
    String phone;
    String email;
    Contact(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "ID : " + id +"  Name : " + name +"  Phone : " + phone +"  Email : " + email;
    }
}

class ContactNotFoundException extends Exception {
    ContactNotFoundException(String msg) {
        super(msg);
    }
}
public class AddressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    public static <T> void display(List<T> list) {

        for (T obj : list) {
            System.out.println(obj);
        }
    }
    static void addContact(Contact c) {
        contacts.add(c);
    }
    static void updateContact(int id, String newPhone)throws ContactNotFoundException {
        for (Contact c : contacts) {
            if (c.id == id) {
                c.phone = newPhone;
                return;
            }
        }

        throw new ContactNotFoundException("Contact Not Found");
    }
    static void saveContacts() throws IOException {
        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("contacts.dat"));
        oos.writeObject(contacts);
        oos.close();
    }

    static void loadContacts()throws IOException, ClassNotFoundException {
     
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("contacts.dat"));
        contacts =(ArrayList<Contact>) ois.readObject();
        ois.close();
    }
    public static void main(String[] args) {
        try {
        loadContacts();
        addContact(new Contact( 1,"Swechchha","9876543210","abc@gmail.com"));
        addContact(new Contact(2,"Rahul","6728477468","rahul@gmail.com"));
        System.out.println("Contacts:");
        display(contacts);
        updateContact(1, "528929393");
        System.out.println("After Update:");
        display(contacts);
        saveContacts();
        System.out.println("Data Saved Successfully");

    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
}
}
   
        
    
