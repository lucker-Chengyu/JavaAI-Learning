public class Day05_getter_setter {
    public static void main(String[] args) {
        User u = new User("Alice", 22, "alice@monash.edu");
        System.out.println(u.getName());
        System.out.println(u.getAge());
        System.out.println(u.getEmail());
    }
}

class User {
    private String name;
    private int age;
    private String email;

    public User(String name) {
        this.name = name;
        this.age = 0;
        this.email = "";
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "";
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter
    public String getName()  { return name; }
    public int    getAge()   { return age; }
    public String getEmail() { return email; }

    // Setter
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        if (email != null && !email.isEmpty()) {
            this.email = email;
        }
    }
}
