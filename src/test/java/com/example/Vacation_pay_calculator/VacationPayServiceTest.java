package com.example.Vacation_pay_calculator;

import com.example.Vacation_pay_calculator.service.VacationPayCalculateService;
import com.example.Vacation_pay_calculator.service.VacationPayCalculateServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPayServiceTest {

    @Test
    public void testCalculateVacationPay() {
        VacationPayCalculateService vacationPayCalculateService = new VacationPayCalculateServiceImpl();

        Integer yearAmount = 1200000; // общая годовая заработная плата
        Integer vacationDays = 28;   // количество дней отпуска
        Integer expectedVacationPay = 127260; // ожидание, основанное на логике

        Integer result = vacationPayCalculateService.calculateVacationPay(yearAmount, vacationDays);

        assertEquals(expectedVacationPay, result);
    }
}
