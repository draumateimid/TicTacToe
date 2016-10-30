package com.draumateymid.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication {

	public static void main(String [] args)
	{
		
		staticFileLocation("/public");
        SparkApplication TicTacToeWeb = new TicTacToeWeb(); //TicTacToeweb
		
		get("/hello", (req, res) -> "Hello World");
		System.out.println("Hello");
		
		String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }
		
		TicTacToeWeb.init();
	}
	
	@Override
    public void init() {
        //final Chuck chuck = new Chuck();    
        post("/random", (req, res) -> "Some string");
        post("/id", (req, res) -> "Some string");
    }

}

