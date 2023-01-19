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
public class KataUtils {
	
	public static List<GameDraw> listGameDraw ;
	public static List<GameDraw> listGameDrawPlayerOne ;
	public static List<GameDraw> listGameDrawPlayerTwo ;

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
		
		//List<GameDraw> listGameDraw = new ArrayList<>();
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

}
