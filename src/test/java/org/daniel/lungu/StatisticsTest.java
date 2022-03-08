package org.daniel.lungu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StatisticsTest {

	@Test
	void getNoOfLinesRead_shouldReturnAllReadLine() {
		Statistics.getInstance().updateStatisticsWithLine("a");
		Statistics.getInstance().updateStatisticsWithLine("b");
		Statistics.getInstance().updateStatisticsWithLine("c");

		assertEquals(Statistics.getInstance().getNoOfLinesRead(), 3);
	}

	@Test
	void getNoOfUniqueLines_shouldReturnAllUniqueReadLine() {
		Statistics.getInstance().updateStatisticsWithLine("a");
		Statistics.getInstance().updateStatisticsWithLine("a");
		Statistics.getInstance().updateStatisticsWithLine("b");
		Statistics.getInstance().updateStatisticsWithLine("c");
		Statistics.getInstance().updateStatisticsWithLine("c");

		assertEquals(Statistics.getInstance().getNoOfUniqueLines(), 3);
	}

}
