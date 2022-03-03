package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary = ((this.grossSalary * 10) / 100) + this.grossSalary;
    }

    public String toString(){
        return "Funcionário: "
                + name
                + ", Salário bruto: "
                + String.format("%.2f", netSalary());
    }
}
