package com.draumateymid.tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;


public class GameRunnerTest {

	@Test
	public void getBoardTest(){
		char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		GameRunner runner = new GameRunner();
		assertArrayEquals(b, runner.getBoard());
	}
	
/*
	@Test
        public void movePlayerTest(){
                char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}:
                assertEquals(b, GameRunner.getBoard());
        }
*/
}
