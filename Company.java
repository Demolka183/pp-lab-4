import employees.*;

public class Company {
    public void run() {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Wiktor Daniel", 5000);
        employees[1] = new Worker("Jan Kowalski", 3500, "Programista");
        employees[2] = new Worker("Piotr Nowak", 4000, "Projektant");
        employees[3] = new Worker("Donald Tusk", 4200, "Inżynier");
        employees[4] = new Worker("Jarosław Kaczyński", 3800, "Analityk");
        employees[5] = new Manager("Mateusz Gołembowski", 6000);
        employees[6] = new Worker("Maria Garlińska", 4500, "Technik");

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(employees.length - 1);
                employee.setSalary(7500);
            }
        }

        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        company.run();
    }
}
