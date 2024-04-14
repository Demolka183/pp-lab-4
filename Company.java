import employees.*;

public class Company {
    public void run() {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Wiktor Daniel", 5000);
        employees[1] = new Worker("Jan Kowalski", 3500, "Programista");
        employees[2] = new Worker("Piotr Nowak", 4000, "Projektant");
        employees[3] = new Worker("Donald Tusk", 4200, "Inżynier");
        employees[4] = new Worker("Jarosław Kaczyński", 3800, "Analityk");
        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
        employees[0].setSalary(7500);
        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {
        Company company = new Company();
        company.run();
    }
}
