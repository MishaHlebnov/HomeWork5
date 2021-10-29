public class Employee {
    private String initials;

    public void setInitials(String name) {
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
}
