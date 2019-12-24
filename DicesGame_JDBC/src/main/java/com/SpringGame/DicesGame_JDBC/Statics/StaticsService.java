package com.SpringGame.DicesGame_JDBC.Statics;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringGame.DicesGame_JDBC.Games.Games;

@Service
public class StaticsService {
	
	//GET STATIC FOR A PLAYER BY PlayerId
	public Statics getStatics(List<Games> games){

		int qtGames = games.size();
		int qtIsWin = 0;
		//Iterate everyGame(List) to know how many are win
		for (int i = 0; i < qtGames; i++) {
			if(games.get(i).getIsWin()==1) {
				qtIsWin += 1;
			}
		}
		//System.out.println("qtGames: "+ qtGames + "qtIsWin= "+ qtIsWin);
		Statics requestedStats = new Statics(qtGames,qtIsWin);
		return requestedStats;
	}
	

}
