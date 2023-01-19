public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax(){
        double tax=0;
        if(salary>1000){
            tax=salary * 0.03;
        }else{
            return tax;
        }
    return tax;
   }
   double bonus(){
        double bonus=0;
        if(workHours>40){
           bonus = workHours - 40 * 30;
        }
        return bonus;
   }
    public double raiseSalary() {
        double raise;
        int workingYear = (2022 - hireYear);
        if (workingYear < 10) {
            raise = (salary * 0.05);
        } else if (workingYear < 20) {
            raise = (salary * 0.10);
        } else{
            raise = (salary * 0.15);
        }
        return raise;
    }

    public String toString() {
        return "Name: " + name
                + "\nSalary: " + salary
                + "\nWork Hours: " + workHours
                + "\nHire Year: " + hireYear
                + "\nTax: " + tax()
                + "\nBonus: " + bonus()
                + "\nSalary Raise: " + raiseSalary()
                + "\nSalary with Tax and Bonus: " + (salary - tax() + bonus())
                + "\nTotal Salary: " + (salary + raiseSalary());
    }
}


