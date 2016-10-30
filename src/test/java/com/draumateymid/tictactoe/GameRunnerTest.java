package com.draumateymid.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class GameRunnerTest {
		
	@Test
	public void getBoardTest(){
		char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		GameRunner runner = new GameRunner();
		assertArrayEquals(b, runner.getBoard());
	}
	
	@Test
	public void movePlayerYTest(){
			char[] b = {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
			GameRunner.movePlayer('X', 1);
			assertArrayEquals(b, GameRunner.getBoard());
	}
	
	
	@Test(expected=IllegalArgumentException.class) 
	public void movePlayerWrongTypeTest()  throws Exception {
			GameRunner.movePlayer('A', 2);
			String s = "Marker has to be either 'X' or 'O'!";
			assertEquals(s, GameRunner.getBoard());
	}
	
	
	@Test
	public void movePlayerXandOTest(){
			char[] b = {'X', 'O', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
			GameRunner runner = new GameRunner();
			runner.movePlayer('X', 1);
			runner.movePlayer('O', 2);
			assertArrayEquals(b, runner.getBoard());
	}
}




































