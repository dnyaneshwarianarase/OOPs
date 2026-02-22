package com.java.hierarchialinheriance;

public class EmployeeSystem{
    void main(){
       
        int choice=Integer.parseInt(IO.readln("Enter Your Choice:"));
        if(choice==3)
        {
            IO.println("Invalid Choice");
            System.exit(0);
        }
        int id=Integer.parseInt(IO.readln("Enter EmpoyId: "));
        if(id<0)
        {
            IO.println("Invalid Employee Id: ");
            System.exit(0);
        }
        String name=IO.readln("Enter Employee Name: ");
        double salary=Double.parseDouble(IO.readln("Enter A salary: "));
        if(salary<0)
        {
            IO.println("Salary can't be 0 or negative");
            System.exit(0);
        }
        switch(choice)
        {
         case 1->{
        PermanenEmployee scott=new PermanenEmployee(id,name,salary);
        IO.println(scott);
        scott.netSalary();
         }
         case 2->{
        int contractDuration=Integer.parseInt(IO.readln("Enter a contractDuration:"));
        ContractEmployee Alie=new ContractEmployee(id,name,salary,contractDuration);
        IO.println(Alie);

         }
        }


    }
    
}
class Employee{
    protected int empoyeeId;
    protected String EmployeeName;
    protected double EmployeeSalary;

    public Employee(int empoyeeId,String EmployeeName,double EmployeeSalary){

        this.empoyeeId=empoyeeId;
        this.EmployeeName=EmployeeName;
        this.EmployeeSalary=EmployeeSalary;

    }

}
class PermanenEmployee extends Employee{
    protected double providentFund;
    public PermanenEmployee(int empoyeeId,String EmployeeName,double EmployeeSalary){
        super(empoyeeId,EmployeeName,EmployeeSalary);
        providentFund=0.12*EmployeeSalary;
    }


    //toString
    public String toString(){
        return "PermanentEmployee [empoyeeId="+empoyeeId+", employeeName="+EmployeeName+", employeeSalary="+EmployeeSalary+", providentfund="+providentFund+"]";
    }

    public void netSalary(){
        double netSal=EmployeeSalary+providentFund;
        IO.println("Net Salary is :"+netSal);
    }
    

}
class ContractEmployee extends Employee{
    protected int contactDuration;
    public ContractEmployee(int empoyeeId,String EmployeeName,double EmployeeSalary ,int contactDuration){
        super(empoyeeId,EmployeeName,EmployeeSalary);
        this.contactDuration=contactDuration;

    }
    public String toString(){
        return "ContractEmployee [empoyeeId="+empoyeeId+", employeeName="+EmployeeName+", employeeSalary"+EmployeeSalary+", contactDuration="+contactDuration+" years]";
    }


}