package br.cesul.lista04.ex01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {

    @Test
    public void createsLoanWithCorrectAttributes() {
        Loan loan = new Loan(1000,2,12);

        assertEquals(1000, loan.getAmount());
        assertEquals(1000, loan.getAmount());
        assertEquals(12, loan.getInstallments());
    }
}
