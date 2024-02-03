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

    public static void calculateInflation(Employee[] employees) {
        float projectedInflation = 11.3f;
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * (projectedInflation / 100)));
        }
        System.out.println("Оклад после индексации составит:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int chooseDepartment() {
        int department = 3;
        return department;
    }

    public static float maxSalaryDepartment(Employee[] employees) {
        int department = chooseDepartment();
        float maxSalary = -1f;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static void searchMaxSalaryDepartment(Employee[] employees) {
        int department = chooseDepartment();
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                if (maxSalaryDepartment(employees) == employees[i].getSalary()) {
                    System.out.println("Сотрудник с максимальной зарплатой в отделе " + employees[i].getDepartment() + " :\n" + employees[i]);
                }
            }
        }
    }

    public static float minSalaryDepartment(Employee[] employees) {
        int department = chooseDepartment();
        float minSalary = 1_000_000_000f;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public static void searchMinSalaryDepartment(Employee[] employees) {
        int department = chooseDepartment();
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                if (minSalaryDepartment(employees) == employees[i].getSalary()) {
                    System.out.println("Сотрудника с минимальной зарплатой в отделе "+ employees[i].getDepartment() + " :\n" + employees[i]);
                }
            }
        }
    }

    public static float calculateAllTotalDepartment(Employee[] employees) {
        int department = chooseDepartment();
        float total = 0f;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                total = total + employees[i].getSalary();
            }
        }
        return total;
    }

    public static float calculationAverageSalaryDepartment(Employee[] employees) {
        int department = chooseDepartment();
        float sumDepartments = 0;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                sumDepartments = sumDepartments + 1;
            }
        }
        float averageSalaryDepartment = calculateAllTotalDepartment(employees) / sumDepartments;
        return averageSalaryDepartment;
    }

    public static void calculateInflationDepartment(Employee[] employees) {
        int department = chooseDepartment();
        float projectedInflation = 10f;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * (projectedInflation / 100)));
            }
        }
        System.out.println("Оклад отдела " + chooseDepartment() + ", после индексации составит:");
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void informationDepartment(Employee[] employees) {
        int department = chooseDepartment();
        System.out.print("Информация о сотрудниках отдела " + department + ":");
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                System.out.print("\nФ.И.О: " + employees[i].getFullName() + "\nid: " + employees[i].getId() + "\nЗарплата: " + String.format("%.2f",employees[i].getSalary()) + "\n");
            }
        }
    }

    public static float choosingSalaryCriterion() {
        float salaryCriterion = 70_000;
        return salaryCriterion;
    }

    public static void minSalaryCriteria(Employee[] employees) {
        float criteria = choosingSalaryCriterion();
        System.out.print("Сотрудники с зарплатой меньше " + choosingSalaryCriterion() + ":");
        for (int i = 0; i < employees.length; i++) {
            if (criteria >= employees[i].getSalary()) {
                System.out.print("\nId: " + employees[i].getId() + "\nФ. И. О. " + employees[i].getFullName() + "\nЗарплата: " + String.format("%.2f",employees[i].getSalary()) + "\n");
            }
        }
    }

    public static void maxSalaryCriteria(Employee[] employees) {
        float criteria = choosingSalaryCriterion();
        System.out.print("Сотрудники с зарплатой больше " + choosingSalaryCriterion() + ":");
        for (int i = 0; i < employees.length; i++) {
            if (criteria <= employees[i].getSalary()) {
                System.out.print("\nId: " + employees[i].getId() + "\nФ. И. О. " + employees[i].getFullName() + "\nЗарплата: " + String.format("%.2f",employees[i].getSalary()) + "\n");
            }
        }
    }
}