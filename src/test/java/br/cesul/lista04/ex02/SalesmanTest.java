package br.cesul.lista04.ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesmanTest {

    private Salesman salesman;

    @BeforeEach
    public void setup() {
        this.salesman = new Salesman("Gabriel", SeniorityLevel.SENIOR, 2000, 1000);
    }

    @Test
    public void givenConstructorParameters_whenCreatingSalesman_thenCreatesSalesmanCorrectly() {

        assertEquals("Gabriel", salesman.getName());
        assertEquals(SeniorityLevel.SENIOR, salesman.getSeniority());
        assertEquals(2000, salesman.getSalesTarget());
        assertEquals(1000, salesman.getSalary());
        assertEquals(0, salesman.getCashSales());
        assertEquals(0, salesman.getInstallmentsSales());
    }

    @Test
    public void givenCashSalesWithoutSalesTarget_whenGettingFinalSalary_ReturnsSalary() {
        salesman.setCashSales(2500);
        assertEquals(1250, salesman.getFinalSalary(), 0.01);
    }

    @Test
    public void givenCashSalesWithoutSalesTarget_whenGettingFinalSalary_ReturnsSalary() {
        salesman.setCashSales(2500);
        assertEquals(1250, salesman.getFinalSalary(), 0.01);
    }

    @Test
    public void givenCashSalesWithoutSalesTarget_whenGettingFinalSalary_ReturnsSalary() {
        salesman.setCashSales(2500);
        assertEquals(1250, salesman.getFinalSalary(), 0.01);
    }
}
