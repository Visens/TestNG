package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {

	@org.junit.Test
	public void testRemain() {
		CashBackHackService service = new CashBackHackService();
		int amount = 1000;
		int actual = service.remain(amount);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@org.junit.Test
	public void testRemainWithCashBack(){
		CashBackHackService service = new CashBackHackService();
		int amount = 900;
		int actual = service.remain(amount);
		int expected = 100;
		assertEquals(expected, actual);
	}
}
