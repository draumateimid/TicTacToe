package com.draumateymid.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication {

	public static void main(String [] args)
	{
		
		staticFileLocation("/public");
        SparkApplication TicTacToeWeb = new TicTacToeWeb(); //TicTacToeweb
		
		get("", (req, res) -> "Hello World");
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
        get("/random", (req, res) -> "Some string");
        get("/id", (req, res) -> "Some string");
    }

}

