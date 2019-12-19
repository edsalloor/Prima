package PrimaV5.Gradle;

import  org.junit.jupiter.api.Assertions.*;

import Prima.Gradle.Prima;

import org.junit.jupiter.api.Test;


class PrimaTest {
	

	@Test
	void testCalculoPrima() {
		new Prima(18,30).calculoPrima();
		new Prima(18,20).calculoPrima();
		new Prima(28,29).calculoPrima();
		new Prima(30,25).calculoPrima();
		new Prima(35,27).calculoPrima();
		new Prima(40,22).calculoPrima();
		new Prima(48,20).calculoPrima();
		new Prima(51,28).calculoPrima();
		new Prima(65,26).calculoPrima();
		new Prima(70,20).calculoPrima();
	}
}

