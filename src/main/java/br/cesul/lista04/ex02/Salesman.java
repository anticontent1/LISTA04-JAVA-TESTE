package br.cesul.lista04.ex02;

public class Salesman {

    private String name;
    private double salary;
    private double cashSales;
    private double installmentsSales;
    private double salesTarget;
    private SeniorityLevel seniority;

    public Salesman(String name, SeniorityLevel seniority, double salesTarget, double salary) {
        this.name = name;
        this.seniority = seniority;
        this.salesTarget = salesTarget;
        this.salary = salary;
    }

    public SeniorityLevel getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getCashSales() {
        return cashSales;
    }

    public double getInstallmentsSales() {
        return installmentsSales;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public SeniorityLevel getSeniority() {
        return seniority;
    }

    public void setCashSales(double cashSales) {
        this.cashSales = cashSales;
    }

    public void setInstallmentsSales(double installmentsSales) {
        this.installmentsSales = installmentsSales;
    }
}
