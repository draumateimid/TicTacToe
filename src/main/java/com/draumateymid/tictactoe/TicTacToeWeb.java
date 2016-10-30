package com.draumateymid.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToeWeb implements SparkApplication {
	
	private static GameController controller = new GameController();
	
	public static void main(String [] args)
	{
		
		staticFileLocation("/public");
        SparkApplication TicTacToeWeb = new TicTacToeWeb(); //TicTacToeweb
		
		
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
		post("/tictactoe", (req, res) -> 

			{ 
					if(controller.status().equals("X")){
						return "winner";
					}
					else{
						return "winner";//controller.test((String) req.queryParams("name"));
					}
			}
		);
		post("/winner", (req, res) ->  "");
    }

	public String gameController(String data){
		if (data.equals("1"))
			return "asdf";
		
		return "X";
		//post("/tictactoe", (req, res) -> chuck.getById(req.queryParams("id")));
		
	}

}

/*
	@Override
    public void init() {
        //final Chuck chuck = new Chuck();    
        get("/random", (req, res) -> "Some string");
        get("/id", (req, res) -> "Some string");
		post("/tictactoe", (req, res) -> controller.test((String) req.queryParams("name")) );
    }
*/







