public class Employee {
    String name;
    int salary;
    int workHours;
    String hireYear;
    double newSalary;

    Employee(String name, int salary, int workHours, String hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if (this.salary > 1000)
            this.newSalary = this.salary*0.97;
        return (this.salary - this.newSalary);
    }

    public int bonus(){
        if (this.workHours > 40)
        {
            this.newSalary += (workHours-40)*30;
        }
        return ((workHours-40)*30);
    }

    public double raiseSalary(){
        int howManyYears=Integer.parseInt(this.hireYear) - 2021;
        double x=0.0;
        if (howManyYears<10){
            x = this.salary*1.05 - this.salary;
        }
        else if(howManyYears > 9 && howManyYears < 20)
            x = this.salary * 1.1 - this.salary;
        else if (howManyYears>19)
            x=this.salary*1.15 - this.salary;
        this.newSalary+=x;
        return x;
    }

    void print(){
        System.out.println("Adı              : "+ this.name);
        System.out.println("Maaşı            : "+ this.salary);
        System.out.println("Çalışma Saati    : "+ this.workHours);
        System.out.println("İşe Giriş Yılı   : "+ this.hireYear);
        System.out.println("Vergi            : "+ this.tax());
        System.out.println("Bonus            : "+ this.bonus());
        System.out.println("Maaş Artışı      : "+ this.raiseSalary());
        System.out.println("Vergi ve Bonuslu Maaş : "+this.newSalary);
    }

}
