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
			GameRunner runner = new GameRunner();
			//Set user input as 1 and simulate console input by using System.setin.
			String input = "1";
			InputStream in = new ByteArrayInputStream(input.getBytes());
			System.setIn(in);
			runner.movePlayer('X');
			assertArrayEquals(b, runner.getBoard());
	}
	
	@Test
	public void movePlayerXandOTest(){
			char[] b = {'X', 'O', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
			GameRunner runner = new GameRunner();
			//Set user input as 1 and simulate console input by using System.setin.
			String input = "1";
			InputStream inX = new ByteArrayInputStream(input.getBytes());
			System.setIn(inX);
			runner.movePlayer('X');
			//Test player O marks O in field 2
			input = "2";
			InputStream inO = new ByteArrayInputStream(input.getBytes());
			System.setIn(inO);
			runner.movePlayer('O');
			assertArrayEquals(b, runner.getBoard());
	}
	
	@Test
	public void makeWinnerXTest(){
		GameRunner runner = new GameRunner();
		String s = "Congratulations player X is the Winner!";
		assertEquals(s, runner.makeWinner('X'));
	}
	@Test
	public void makeWinnerOTest(){
		GameRunner runner = new GameRunner();
		String s = "Congratulations player O is the Winner!";
		assertEquals(s, runner.makeWinner('O'));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void makeWinnerWrongInputTest() throws Exception {
		GameRunner runner = new GameRunner();
		String s = "Marker has to be either 'X' or 'O'!";
		assertEquals(s, runner.makeWinner('A'));
	}
	
}




































