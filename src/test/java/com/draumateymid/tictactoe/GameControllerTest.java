
package com.draumateymid.tictactoe;

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class GameControllerTest{
	
	private GameController controller = new GameController();
	
	@Test
	public void makeMoveXTest(){
		assertEquals("X", controller.makeMove("1"));
	}
	
	@Test
	public void makeMoveOTest(){
		controller.makeMove("2");
		assertEquals("O", controller.makeMove("5"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void makeMoveIlligalInputTest() throws IllegalArgumentException{
		assertEquals("Input is not an intege between 1-9!", controller.makeMove("0"));
	}
	
	@Test
	public void makeMoveXWinnerTest(){
		controller.makeMove("1");
		controller.makeMove("2");
		controller.makeMove("4");
		controller.makeMove("5");
		assertEquals("winnerX", controller.makeMove("7"));
	}
	
	@Test
	public void makeMoveOWinnerTest(){
		controller.makeMove("2");
		controller.makeMove("1");
		controller.makeMove("3");
		controller.makeMove("4");
		controller.makeMove("5");
		assertEquals("winnerO", controller.makeMove("7"));
	}
	
	@Test
	public void makeMoveDrawTest(){
		controller.makeMove("2");
		controller.makeMove("1");
		controller.makeMove("3");
		controller.makeMove("4");
		controller.makeMove("5");
		assertEquals("winnerO", controller.makeMove("7"));
	}
}

