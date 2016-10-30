package com.draumateymid.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class GameController{
	
	private static GameRunner runner = new GameRunner(); 
	private static GameStatus status = new GameStatus();
	private static char player = 'X'; 
	
	
	public static String makeMove(String input){
		int pos = Integer.valueOf(input); 
		checkInput(pos);

		runner.movePlayer(player, pos);
		char marker = player;
		if(player == 'X'){
			player = 'O';
		}
		else{
			player = 'X';
		}
			
		if(status.draw(runner.getBoard())){
			runner = new GameRunner();
			player = 'X';
			return "draw";
		}
		else if(status.checkWinner(runner.getBoard())){
			runner = new GameRunner();
			player = 'X';
			return "winner" + Character.toString(marker);
		}
		else{
			return Character.toString(marker);//controller.test((String) req.queryParams("name"));
		}

	}
	
	private static void checkInput(int input) throws IllegalArgumentException{
		if (input < 1 || input > 9){
			throw new IllegalArgumentException("Input is not an intege between 1-9!");
		}
	}
	
	public String status(){
		
		if(true){
			
		}
		//res.redirect("/winner");
		//get("/winner", (req, res) -> "Hello World");
		//res.redirect("/winner.html");
		return "X";
	} 
	
	public static String test(String data){
		if (data.equals("1"))
			return "asdf";
		else if(data.equals("2"))
			return "X";
		return "O";
		//post("/tictactoe", (req, res) -> chuck.getById(req.queryParams("id")));	
	}
}