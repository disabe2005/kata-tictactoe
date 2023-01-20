package com.fortis.cge.kata.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fortis.cge.kata.model.GameDraw;
import com.fortis.cge.kata.model.PawnEnum;
import com.fortis.cge.kata.model.PositionEnum;

/**
 * This class is a handler of some actions to manage games
 * For example to genarate a new game, initialize new  
 */
@Component
public class KataUtils {
	
	public static List<GameDraw> listGameDraw = new ArrayList<>();
	public static List<GameDraw> listGameDrawPlayerOne = new ArrayList<>();
	public static List<GameDraw> listGameDrawPlayerTwo = new ArrayList<>();

	public List<GameDraw> initializeDraw() {
		GameDraw gd1 = new GameDraw(PositionEnum.P1, " ", PawnEnum.Y);
		GameDraw gd2 = new GameDraw(PositionEnum.P2, " ", PawnEnum.Y);
		GameDraw gd3 = new GameDraw(PositionEnum.P3, " ", PawnEnum.Y);
		GameDraw gd4 = new GameDraw(PositionEnum.P4, " ", PawnEnum.Y);
		GameDraw gd5 = new GameDraw(PositionEnum.P5, " ", PawnEnum.Y);
		GameDraw gd6 = new GameDraw(PositionEnum.P6, " ", PawnEnum.Y);
		GameDraw gd7 = new GameDraw(PositionEnum.P7, " ", PawnEnum.Y);
		GameDraw gd8 = new GameDraw(PositionEnum.P8, " ", PawnEnum.Y);
		GameDraw gd9 = new GameDraw(PositionEnum.P9, " ", PawnEnum.Y);
		 
		listGameDrawPlayerOne = new ArrayList<>();
		listGameDrawPlayerTwo = new ArrayList<>();
		listGameDraw.add(gd1);
		listGameDraw.add(gd2);
		listGameDraw.add(gd3);
		listGameDraw.add(gd4);
		listGameDraw.add(gd5);
		listGameDraw.add(gd6);
		listGameDraw.add(gd7);
		listGameDraw.add(gd1);
		listGameDraw.add(gd9);
		
		return listGameDraw;
	}

	public Boolean verifyFirstPawn(GameDraw gd1, List<GameDraw> listGameDrawPlayerOne2) {
		if(listGameDrawPlayerOne2.isEmpty() && gd1.getPawn() ==  PawnEnum.X) return true;
		return false;
	}

	public List<GameDraw> getListGameDrawAllPlayers() {
		return listGameDraw;
	}

	public Boolean verifyOccupedPosition(GameDraw gdToTest, List<GameDraw> listGameDrawAllPlayers) {
		Boolean result = false;
		for(int i=0; i<listGameDrawAllPlayers.size(); i++)
		{
			if(gdToTest.getPosition() == listGameDrawAllPlayers.get(i).getPosition()) 
				result = true; 
		}
				
		return result;
	}

	public Boolean verifyIfWinner(String playerName) {
		
			if(
					 ( (listGameDraw.get(0).getPlayerName().equals(playerName) && listGameDraw.get(0).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(1).getPlayerName().equals(playerName) && listGameDraw.get(1).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(2).getPlayerName().equals(playerName) && listGameDraw.get(2).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(0).getPlayerName().equals(playerName) && listGameDraw.get(0).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(1).getPlayerName().equals(playerName) && listGameDraw.get(1).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(2).getPlayerName().equals(playerName) && listGameDraw.get(2).getPawn() == PawnEnum.O )) 
						
				) 
			{
				return true;
			}
			
			if(
					 ( (listGameDraw.get(0).getPlayerName().equals(playerName) && listGameDraw.get(0).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(6).getPlayerName().equals(playerName) && listGameDraw.get(6).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(0).getPlayerName().equals(playerName) && listGameDraw.get(0).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(6).getPlayerName().equals(playerName) && listGameDraw.get(6).getPawn() == PawnEnum.O )) 
						
				) 
			{
				return true;
			}
			if(
					 ( (listGameDraw.get(0).getPlayerName().equals(playerName) && listGameDraw.get(0).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(8).getPlayerName().equals(playerName) && listGameDraw.get(8).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(0).getPlayerName().equals(playerName) && listGameDraw.get(0).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(8).getPlayerName().equals(playerName) && listGameDraw.get(8).getPawn() == PawnEnum.O )) 
						
				) 
			{
				return true;
			}
			
			if(
					 ( (listGameDraw.get(3).getPlayerName().equals(playerName) && listGameDraw.get(3).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(5).getPlayerName().equals(playerName) && listGameDraw.get(5).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(3).getPlayerName().equals(playerName) && listGameDraw.get(3).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(5).getPlayerName().equals(playerName) && listGameDraw.get(5).getPawn() == PawnEnum.O )) 
						
			  ) 
			{
				return true;
			}
			
			if(
					 ( (listGameDraw.get(3).getPlayerName().equals(playerName) && listGameDraw.get(3).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(5).getPlayerName().equals(playerName) && listGameDraw.get(5).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(3).getPlayerName().equals(playerName) && listGameDraw.get(3).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(5).getPlayerName().equals(playerName) && listGameDraw.get(5).getPawn() == PawnEnum.O )) 
						
				) 
			{
				return true;
			}
			
			if(
					 ( (listGameDraw.get(6).getPlayerName().equals(playerName) && listGameDraw.get(6).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(7).getPlayerName().equals(playerName) && listGameDraw.get(7).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(8).getPlayerName().equals(playerName) && listGameDraw.get(8).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(6).getPlayerName().equals(playerName) && listGameDraw.get(6).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(7).getPlayerName().equals(playerName) && listGameDraw.get(7).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(8).getPlayerName().equals(playerName) && listGameDraw.get(8).getPawn() == PawnEnum.O )) 
						
				) 
			{
				return true;
			}
			if(
					 ( (listGameDraw.get(6).getPlayerName().equals(playerName) && listGameDraw.get(6).getPawn() == PawnEnum.X )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.X )  &&
					 ( listGameDraw.get(3).getPlayerName().equals(playerName) && listGameDraw.get(3).getPawn() == PawnEnum.X )) 
				  ||
					 ( (listGameDraw.get(6).getPlayerName().equals(playerName) && listGameDraw.get(6).getPawn() == PawnEnum.O )     &&
					 ( listGameDraw.get(4).getPlayerName().equals(playerName) && listGameDraw.get(4).getPawn() == PawnEnum.O )  &&
					 ( listGameDraw.get(3).getPlayerName().equals(playerName) && listGameDraw.get(3).getPawn() == PawnEnum.O )) 
						
				) 
			{
				return true;
			}
		
		return false;
	}


	public Boolean verifyIfEndOfGame() {
		Boolean result = true;
		for(GameDraw g : listGameDraw)
		if(g.getPawn() == PawnEnum.Y) result = false;
		
		return result;
	}

	public void draw(PositionEnum p, String playerName, PawnEnum pa) {
		List<GameDraw> listeTochange = new ArrayList<>();
		listGameDraw.forEach(item -> {
			if(item.getPosition() != p) {
				listeTochange.add(item);
			}else {
				listeTochange.add(new GameDraw(p, playerName, pa));
			}
			
		});
		
		listGameDraw = new ArrayList<>();
		listGameDraw.addAll(listeTochange);
		
	}
	


}
