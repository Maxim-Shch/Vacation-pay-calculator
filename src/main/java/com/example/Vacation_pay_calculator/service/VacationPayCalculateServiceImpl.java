package com.example.Vacation_pay_calculator.service;

import org.springframework.stereotype.Service;

@Service
public class VacationPayCalculateServiceImpl implements VacationPayCalculateService {

    private static final int MONTHS_IN_YEAR = 12;
    private static final int AMOUNT_WORKING_DAYS = 22;

    @Override
    public Integer calculateVacationPay(Integer yearAmount, Integer vacationDays) {
        Integer monthAmount = yearAmount / MONTHS_IN_YEAR;
        Integer priceWorkingDay = monthAmount / AMOUNT_WORKING_DAYS;
        return priceWorkingDay * vacationDays;
    }
}
