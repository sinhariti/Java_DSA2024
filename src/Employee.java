public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    //constructors
    public Employee(){

    }
    public Employee(int empID, String empName, double empSalary){
        employee_id=empID;
        employee_name=empName;
        employee_salary=empSalary;
    }
    //getters and setters

    public void setEmpId(int num){
        this.employee_id=num;
    }
    public void setEmployee_name(String name){
        this.employee_name=name;
    }
    public void setEmployee_salary(double salary){
        this.employee_salary=salary;
    }
    public String getEmpName(){
        return employee_name;
    }
    public int getEmployee_id(){
        return employee_id;
    }
    public String getEmployee_salary(){
        return String.format("%.2f", employee_salary);
    }
    public void EmployeeDetails(){
        System.out.println("Employee Details are :");
        System.out.println("Employee Name :"+this.getEmpName());
        System.out.println("Employee ID :"+this.getEmployee_id());
        System.out.println("Employee Salary : Rs "+this.getEmployee_salary());
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setEmpId(2345);
        e1.setEmployee_name("Jane");
        e1.setEmployee_salary(34000);
        e1.EmployeeDetails();
        Employee e2 = new Employee(2034,"Larry",23000);
        System.out.println("\nThe second employee name is "+e2.getEmpName());
    }
}
