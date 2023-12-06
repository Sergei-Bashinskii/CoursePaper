public class Salary {
    public static float calculateTotalSalary(Employee[] employees) {
        float allSalary = 0f;
        for (Employee employee : employees) {
            allSalary = allSalary + employee.getSalary();
        }
        return allSalary;
    }

    public static float calculationMaxSalary(Employee[] employees) {
        float maxSalary = -1f;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static void searchMaxEmployeeSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (calculationMaxSalary(employees) == employee.getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой:\n" + employee);
            }
        }
    }

    public static float calculationMinSalary(Employee[] employees) {
        float minSalary = 1_000_000_000f;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static void searchMinEmployeeSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (calculationMinSalary(employees) == employee.getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой\n" + employee);
            }
        }
    }

    public static float calculateAverageSalary(Employee[] employees) {
        float averageSalary = calculateTotalSalary(employees) / employees.length;
        return averageSalary;
    }
}