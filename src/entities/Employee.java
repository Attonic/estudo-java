package entities;

public class Employee {
    public String nome;
    public double grossSalary;
    public double tax;


    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += (grossSalary / 100) * percentage;
    }

    public String toString(){
        return "Employee: " + nome + ", " + "$ " + String.format("%.2f", netSalary());
    }
}
