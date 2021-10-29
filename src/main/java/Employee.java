public class Employee {
    private String initials;

    public void setInitials(String initials) {
        this.initials = initials;
    }

    private String position;

    public void setPosition(String position) {
        this.position = position;
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    private String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private int salary;
    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Введена некорректная ЗП");
        }
    }

    private int age;
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    public Employee(String initials, String position, String email, String phone, int salary, int age) {
        setInitials(initials);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }
    void print_console() {
        System.out.printf("Сотрудник %s, должностью %s, email %s, номер телефона %s, зарплатой %d, возрастом %d год(года)\n ",
                initials, position, email, phone, salary, age);
    }
}
