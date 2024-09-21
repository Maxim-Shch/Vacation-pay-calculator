package com.example.Vacation_pay_calculator.controller;

import com.example.Vacation_pay_calculator.service.VacationPayCalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VacationPayCalculateController {

    private final VacationPayCalculateService vacationPayCalculateService;

    //http://localhost:8080/calculate?yearAmount=100000&vacationsDays=10

    @GetMapping("/calculate")
    public Integer calculateVacationPay(@RequestParam Integer yearAmount, @RequestParam Integer vacationsDays) {
        return vacationPayCalculateService.calculateVacationPay(yearAmount, vacationsDays);
    }
}
