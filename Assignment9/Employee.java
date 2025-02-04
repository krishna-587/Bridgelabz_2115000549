public class Employee {

    static String companyName = "Capgemini" ;
    private String name;
    private final int id;
    private String designation;

    static int totalEmployee = 0;

    public Employee(String name, int id , String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployee);
    }

    public void displayDetails(){
       if(this instanceof Employee){
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Designation: " + designation);
       }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Krishna", 5678, "software engineer ");
        Employee employee2 = new Employee("Kunal", 8569, " Senior software engineer ");
        employee1.displayDetails();
        employee2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
