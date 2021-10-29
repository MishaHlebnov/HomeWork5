public class MainOOP {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ковалев Тарас Алесандрович", "Уборщк",
                "Kovalev@mail.ru", "8-999-20-22-23", 30000, 24);
        employee1.print_console();

        Employee[] employeesArray = new Employee[6];
        employeesArray[0] = new Employee("Ковалев Тарас Александрович", "Уборщик",
                "Kovalev@mail.ru", "8-999-20-22-23", 30000, 26);
        employeesArray[1] = new Employee("Сидоров Петр Андреевич", "Администратор",
                "Sidorov@mail.ru", "8-950-333-22-11", 60000, 31);
        employeesArray[2] = new Employee("Поттер Антон Сергеевич", "Инженер",
                "nimbus2000@mail.ru", "8-890-231-32-21", 66000, 41);
        employeesArray[3] = new Employee("Иванов Иван Иванович", "Директор",
                "ivanov@mail.ru", "8-880-555-35-35", 100000, 44);
        employeesArray[4] = new Employee("Кулибин Семен Олегович", "Сантехник",
                "unitaz@gmail.com", "8-950-553-54-23", 45000, 39);
        employeesArray[5] = new Employee("Сосновский Петр Станиславович", " Таксист",
                "pushkagonka@gmail.ru", "8-900-800-70-60", 60000, 42);
    }
}
