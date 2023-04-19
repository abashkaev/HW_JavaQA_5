package ru.netology.services;

public class VacationCalcService {
    public int vacationMont(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
            System.out.println(money);
        }
        return count;
    }
}
