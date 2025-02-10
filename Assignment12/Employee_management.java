abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }
}

interface Department {
    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

class ITDepartment implements Department {
    private String departmentName;

    public ITDepartment() {
        this.departmentName = "IT";
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

public class Employee_management {
    public static void displayEmployeeDetails(Employee[] employees) {
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Krishna", 3000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Gopal", 20, 500);

        ITDepartment itDepartment = new ITDepartment();
        itDepartment.assignDepartment("Development");

        Employee[] employees = {fullTimeEmployee, partTimeEmployee};
        displayEmployeeDetails(employees);

        System.out.println(itDepartment.getDepartmentDetails());
    }
}