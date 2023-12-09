public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Никита", "Тигранович", 2, 66264);
        employees[1] = new Employee("Новикова", "Ольга", "Романовна", 3, 56100);
        employees[2] = new Employee("Морозова", "Ясмина", "Борисовна", 3, 56489);
        employees[3] = new Employee("Балашов", "Платон", "Даниэльевич", 5, 77150);
        employees[4] = new Employee("Петрова", "София", "Богдановна", 3, 56298);
        employees[5] = new Employee("Чумаков", "Георгий", "Вадимович", 3, 68000);
        employees[6] = new Employee("Козловский", "Иван", "Данилович", 3, 59242);
        employees[7] = new Employee("Чернышев", "Святослав", "Алексеевич", 2, 54303);
        employees[8] = new Employee("Беляев", "Михаил", "Маркович", 3, 71562);
        employees[9] = new Employee("Калинин", "Андрей", "Владиславович", 5, 68400);
        toShare();
        printAllEmployee(employees);
        toShare();
        printCalculateTotalSalary(employees);
        toShare();
        Salary.searchMaxEmployeeSalary(employees);
        toShare();
        Salary.searchMinEmployeeSalary(employees);
        toShare();
        printAverageSalary(employees);
        toShare();
        printFullName(employees);
        toShare();
        Salary.calculateInflation(employees);
        toShare();
        Salary.searchMaxSalaryDepartment(employees);
        toShare();
        Salary.searchMinSalaryDepartment(employees);
        toShare();
        printAllTotalDepartment(employees);
        toShare();
        printAverageSalaryDepartment(employees);
        toShare();
        Salary.calculateInflationDepartment(employees);
        toShare();
        Salary.informationDepartment(employees);
        toShare();
        Salary.minSalaryCriteria(employees);
        toShare();
        Salary.maxSalaryCriteria(employees);
    }

    public static void toShare() {
        System.out.println("============================================================");
    }

    public static void printCalculateTotalSalary(Employee[] employees) {
        System.out.println("Сумма затрат на зарплаты в месяц: " + String.format("%.2f",Salary.calculateTotalSalary(employees)));
    }

    public static void printAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printAverageSalary(Employee[] employees) {
        System.out.println("Среднее значение зарплат: " + String.format("%.2f",Salary.calculateAverageSalary(employees)));
    }

    public static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Ф. И. О. сотрудника: " + employee.getFullName());
        }
    }

    public static void printAllTotalDepartment(Employee[] employees) {
        System.out.println("Сумму затрат на зарплату по отделу " + Salary.chooseDepartment() + ", составляет: " + String.format("%.2f",Salary.calculateAllTotalDepartment(employees)));
    }

    public static void printAverageSalaryDepartment(Employee[] employees) {
        System.out.println("Среднее значение зарплат по отделу " + Salary.chooseDepartment() + ", составляет: " + String.format("%.2f", Salary.calculationAverageSalaryDepartment(employees)));
    }
}