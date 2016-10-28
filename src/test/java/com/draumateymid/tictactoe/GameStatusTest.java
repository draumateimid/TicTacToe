package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 



public class GameStatusTest{

	@Test
	public void testIfWinnerHorizontal(){
		char[] board = {'X', 'X', 'X', ' ', 'O', 'O', ' ', ' ', ' '};
		assertEquals(true, GameStatus.checkWinnerHorizontal(board)); 
	}

	@Test
	public void testIfWinnerVertical(){
		char[] board = {' ', 'O', 'X', ' ', 'O', 'X', ' ', ' ', 'X'};
		assertEquals(true, GameStatus.checkWinnerVertical(board)); 
	}

	@Test
	public void testIfWinnerDiagonal(){
		char[] board = {'O', 'X', 'X', ' ', 'O', ' ', 'X', 'X', 'O'};
		assertEquals(true, GameStatus.checkWinnerDiagonal(board)); 
	}

	@Test
	public void testIfWinner(){
		char[] board = {'O', 'O', 'X', ' ', 'O', 'X', ' ', 'X', 'X'};
		assertEquals(true, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testIfDraw(){
		char[] board = {'X', ' ', 'X', 'O', 'O', 'X', 'X', 'O', 'X'};
		assertEquals(true, GameStatus.draw(board)); 
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
}