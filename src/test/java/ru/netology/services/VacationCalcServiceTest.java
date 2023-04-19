package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv"   )
    void VacationCalcService1(int expected, int income, int expenses, int threshold) {
        VacationCalcService service = new VacationCalcService();

        int actual = service.vacationMont(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


};
