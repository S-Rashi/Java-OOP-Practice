// Employee Payroll Management System
/*
Project: Employee Payroll System
Concept: Encapsulation

Key Features:
- Salary calculation (gross & net)
- Tax deduction logic
- Bonus eligibility check
- Department-based rules

OOP Concepts:
- Encapsulation
- Business logic inside class
- Data validation
- Method interaction
*/
package OOPs.Encapsulation;

class Employee{
    private int eId;
    private String eName;
    private String department;
    private double basicSalary;
    private double bonus;
    private double taxPercentage; 

    public void setEmployeeId(int eId){
        if (eId>0){
            this.eId = eId;
        }else{
            System.out.println("Invalid ID");
        }
    }
    public void setEmployeeName(String eName){
        this.eName = eName;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setBasicSalary(double basicSalary){
        if (basicSalary>=20000){
            this.basicSalary = basicSalary;
        }else{
            System.out.println("Salary cannot be less than 20000");
        }
    }
    public void setBonus(double bonus){
        if (bonus>=0){
            this.bonus = bonus;
        }else{
            System.out.println("Cannot be negative");
        }
    }
    public void setTaxPercentage(double taxPercentage){
    if (taxPercentage > 0 && taxPercentage < 30){
        this.taxPercentage = taxPercentage;
    } else {
        System.out.println("Not in given range");
    }
}
    
    public int getEmployeeId(){
        return eId;
    }
    public String getEmployeeName(){
        return eName;
    }
    public String getDepartment(){
        return department;
    }
    public double getBasicSalary(){
        return basicSalary;
    } 
    public double getBonus(){
        return bonus;
    }
    public double getTaxPercentage(){
        return taxPercentage;
    }

    public double calculategrossSalary(){
        return basicSalary + bonus;
        
    }
    public double calculatetaxPercentage(){
        return calculategrossSalary() * taxPercentage/100;
    }
    public double calculateNetSalary(){
        return calculategrossSalary() - calculatetaxPercentage();
    }

    public boolean eligibleForBonus() {
        return calculateNetSalary() > 40000
            && "IT".equals(department);
    }


    
    public void displayDetails(){
        System.out.println("Employee ID : " + eId);
        System.out.println("Employee Name : " + eName);
        System.out.println("Department : " + department);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Tax Amount : " + calculatetaxPercentage());
        System.out.println("Net Salary : " + calculateNetSalary());
        System.out.println("Bonus Eligibility: " + eligibleForBonus());
    }
}
public class PayrollSystem{
    public static void main(String[] args){
        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setEmployeeName("Rashi");
        emp.setDepartment("IT");
        emp.setBasicSalary(50000);
        emp.setBonus(10000);
        emp.setTaxPercentage(10);
        

        emp.displayDetails();
        emp.eligibleForBonus();
    }
    
}
