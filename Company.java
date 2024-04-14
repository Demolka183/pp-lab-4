public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Wiktor Daniel", 3000);
        employees[1] = new Employee("Jan Kowalski", 3500);
        employees[2] = new Employee("Piotr Nowak", 4000);
        employees[3] = new Employee("Donald Tusk", 4200);
        employees[4] = new Employee("Jarosław Kaczyński", 3800);

        System.out.println("Dane pracownika o indeksie 3: " + employees[3]);
        employees[3].setSalary(4500);
        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
