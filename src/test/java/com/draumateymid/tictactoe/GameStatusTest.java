package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 



public class GameStatusTest{

	@Test
	public void testIfWinnerHorizontal(){
		char[] board = {'X', 'X', 'X', ' ', 'O', 'O', ' ', ' ', ' '};
		assertEquals(true, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testWinnerVertical(){
		char[] board = {' ', 'O', 'X', ' ', 'O', 'X', ' ', ' ', 'X'};
		assertEquals(true, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testWinnerDiagonal(){
		char[] board = {'O', 'X', 'X', ' ', 'O', ' ', 'X', 'X', 'O'};
		assertEquals(true, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testWinner(){
		char[] board = {'O', 'O', 'X', ' ', 'O', 'X', ' ', 'X', 'X'};
		assertEquals(true, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testNotWinner(){
		char[] board = {'X', 'X', 'O', ' ', 'O', 'O', 'X', 'X', ' '};
		assertEquals(false, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testDraw(){
		char[] board = {'X', 'X', 'O', 'O', 'O', 'X', 'X', 'O', 'X'};
		assertEquals(true, GameStatus.draw(board)); 
	}

	@Test
	public void testNotDraw(){
		char[] board = {'X', ' ', 'X', 'O', ' ', 'X', 'X', 'O', 'O'};
		assertEquals(false, GameStatus.draw(board)); 
	}

	@Test
	public void testGameIsOverDraw(){
		char[] board = {'X', ' ', 'X', 'O', 'O', 'X', 'X', 'O', 'X'};
		assertEquals(true, GameStatus.gameIsOver(board)); 
	}

	@Test
	public void testGameIsOverWin(){
		char[] board = {'X', 'X', 'X', 'O', 'O', ' ', ' ', ' ', ' '};
		assertEquals(true, GameStatus.gameIsOver(board)); 
	}

	@Test
	public void testGameIsNotOver(){
		char[] board = {'X', 'X', ' ', 'O', ' ', ' ', ' ', ' ', ' '};
		assertEquals(false, GameStatus.gameIsOver(board)); 
	}
}