public class Employeee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employeee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(int salary) {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public int bonus(int workHours) {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else return 0;
    }

    public double raiseSalary(int hireYear, int salary) {

        int thisYear = 2021;
        int workingYear = thisYear - hireYear;

        if (workingYear < 10) {
            return salary * 0.05;
        } else if (workingYear < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public static void toString(Employeee e1) {
        System.out.println("\nAdı : " + e1.getName());
        System.out.println("Maaşı : " + e1.getSalary());
        System.out.println("Çalışma Saati : " + e1.getWorkHours());
        System.out.println("Başlangıç Yılı : " + e1.getHireYear());
        System.out.println("Vergi : " + e1.tax(e1.salary));
        System.out.println("Bonus : " + e1.bonus(e1.getWorkHours()));
        System.out.println("Maaş Artışı : " + e1.raiseSalary(e1.getHireYear(), e1.getSalary()));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (e1.getSalary() - e1.tax(e1.salary) + e1.bonus(e1.getWorkHours())));
        System.out.println("Toplam Maaş : " + (e1.getSalary() + e1.raiseSalary(e1.getHireYear(), e1.getSalary())));
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return this.hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}