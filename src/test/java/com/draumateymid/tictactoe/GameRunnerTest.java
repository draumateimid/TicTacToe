package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GameRunnerTest {

	@Test
	public void getBoardTest(){
		Char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}:
		assertEquals(b, GameRunner.getBoard());
	}
	
}
