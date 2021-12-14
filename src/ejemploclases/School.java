package ejemploclases;
import java.util.List;
import java.util.ArrayList;
public class School {
    public String school_name;
    public int total_students;
    List<User> users = new ArrayList();
    public School(String name) {
        this.school_name = name;
        this.total_students = 0;
}
    public void Welcome() {
System.out.print("Welcome: " + this.school_name + "\n");
}
public void save_user(User user) {
this.users.add(user);
this.total_students += 1;
System.out.print("New user saved.\n");
}
public void students_list() {
System.out.println("--------------------------------");
System.out.println("---------- USERS LIST ----------");
System.out.println("--------------------------------");
users.forEach(user -> {
user.info();
});
System.out.println("--------------------------------");
}
}

    

