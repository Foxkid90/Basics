package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    // Сумма меньше порогового значения
    @Test
    public void shouldCalculateRemainWithAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    // Сумма выше порогового значения: не кратная 1000
    @Test
    public void shouldCalculateRemainWithAmountMoreBoundaryAndNotMultipleThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }

    // Сумма выше порогового значения: кратная 1000
    @Test
    public void shouldCalculateRemainWithAmountMoreBoundaryAndMultipleThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(5000);

        Assert.assertEquals(expected, actual);
    }

    // Сумма равна пороговому значению
    @Test
    public void shouldCalculateRemainWithAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

}
