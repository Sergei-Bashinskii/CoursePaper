public class Employee {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String fullName;
    private static int idCounter = 0;
    private int id;
    private int department;
    private float salary;

    public Employee(String lastName, String firstName, String patronymic, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.fullName = lastName + " " + firstName + " " + patronymic;
        this.id = ++idCounter;
        this.department = department;
        this.salary = salary;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return this.id;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Ф.И.О: " + this.fullName + "\nid: " + this.id + "\nОтдел: " + this.department + "\nЗарплата: " + this.salary;
    }
}