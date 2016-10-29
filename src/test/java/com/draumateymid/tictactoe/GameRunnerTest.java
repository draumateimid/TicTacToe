package com.draumateymid.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class GameRunnerTest {

	@Test
	public void getBoardTest(){
		char[] b = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		GameRunner runner = new GameRunner();
		assertArrayEquals(b, runner.getBoard());
	}
	
	@Test
        public void movePlayerTest(){
                char[] b = {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
                GameRunner runner = new GameRunner();
				//Set user input as 1 and simulate console input by using System.setin.
                String input = "1";
                InputStream in = new ByteArrayInputStream(input.getBytes());
                System.setIn(in);
                runner.movePlayer('X');
                assertArrayEquals(b, runner.getBoard());
        }
}
