package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class GameStatusTest{
	
	@Test
	public void testIsEmpty(){
		char[] board = {'E', 'X', 'O', 'E', 'E', 'O', 'E', 'X', 'X'};
		assertEquals(true, GameStatus.isEmpty(board, 4)); 
	}

	@Test
	public void testIfWinnerHorizontal(){
		char[] board = {'X', 'X', 'X', 'E', 'O', 'O', 'E', 'E', 'E'};
		assertEquals(true, GameStatus.checkWinnerHorizontal(board)); 
	}

	@Test
	public void testIfWinnerVertical(){
		char[] board = {'E', 'O', 'X', 'E', 'O', 'X', 'E', 'E', 'X'};
		assertEquals(true, GameStatus.checkWinnerVertical(board)); 
	}

	@Test
	public void testIfWinnerDiagonal(){
		char[] board = {'O', 'X', 'X', 'E', 'O', 'E', 'X', 'X', 'O'};
		assertEquals(true, GameStatus.checkWinnerDiagonal(board)); 
	}

	@Test
	public void testIfWinner(){
		char[] board = {'O', 'O', 'X', 'E', 'O', 'X', 'E', 'X', 'X'};
		assertEquals(true, GameStatus.checkWinner(board)); 
	}

	@Test
	public void testIfDraw(){
		char[] board = {'X', 'E', 'X', 'O', 'O', 'X', 'X', 'O', 'X'};
		assertEquals(true, GameStatus.draw(board)); 
	}

	@Test
	public void testGameIsOverDraw(){
		char[] board = {'X', 'E', 'X', 'O', 'O', 'X', 'X', 'O', 'X'};
		assertEquals(true, GameStatus.gameIsOver(board)); 
	}

	@Test
	public void testGameIsOverWin(){
		char[] board = {'X', 'X', 'X', 'O', 'O', 'E', 'E', 'E', 'E'};
		assertEquals(true, GameStatus.gameIsOver(board)); 
	}
}