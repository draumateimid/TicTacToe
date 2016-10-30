package com.draumateymid.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class GameController{
	
	private static GameRunner runner = new GameRunner(); 
	private static GameStatus status = new GameStatus();
	
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