package com.fortis.cge.kata.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.fortis.cge.kata.model.GameDraw;
import com.fortis.cge.kata.model.PawnEnum;
import com.fortis.cge.kata.model.PositionEnum;


public class KataUtilsTest {
	
	@Mock
	KataUtils kataUtilsMock;
	
	@Test
	public void initializeDrawTest(){
		//Griven
		GameDraw gd1 = new GameDraw(PositionEnum.P1, " ", PawnEnum.Y);
		GameDraw gd2 = new GameDraw(PositionEnum.P2, " ", PawnEnum.Y);
		GameDraw gd3 = new GameDraw(PositionEnum.P3, " ", PawnEnum.Y);
		GameDraw gd4 = new GameDraw(PositionEnum.P4, " ", PawnEnum.Y);
		GameDraw gd5 = new GameDraw(PositionEnum.P5, " ", PawnEnum.Y);
		GameDraw gd6 = new GameDraw(PositionEnum.P6, " ", PawnEnum.Y);
		GameDraw gd7 = new GameDraw(PositionEnum.P7, " ", PawnEnum.Y);
		GameDraw gd8 = new GameDraw(PositionEnum.P8, " ", PawnEnum.Y);
		GameDraw gd9 = new GameDraw(PositionEnum.P9, " ", PawnEnum.Y);
		
		List<GameDraw> listGameDraw = new ArrayList<>();
		List<GameDraw> listGameDrawPlayerOne = new ArrayList<>();
		List<GameDraw> listGameDrawPlayerTwo = new ArrayList<>();
		listGameDraw.add(gd1);
		listGameDraw.add(gd2);
		listGameDraw.add(gd3);
		listGameDraw.add(gd4);
		listGameDraw.add(gd5);
		listGameDraw.add(gd6);
		listGameDraw.add(gd7);
		listGameDraw.add(gd1);
		listGameDraw.add(gd9);
		
		//When
		when(kataUtilsMock.initializeDraw()).thenReturn(listGameDraw);	
		
		//Then
		List<GameDraw> listGameDrawTest = kataUtilsMock.initializeDraw();
		assertNotNull(listGameDrawTest);
		assertNotNull(listGameDrawPlayerOne);
		assertNotNull(listGameDrawPlayerTwo);
		assertEquals(0, listGameDrawPlayerOne.size());
		assertEquals(0, listGameDrawPlayerTwo.size());
		assertEquals(9, listGameDrawTest.size());
		
	}
	
	@Test
	public void verifyFirstPawnTest(){
		//Griven
		List<GameDraw> listGameDrawPlayerOne = new ArrayList<>();
		List<GameDraw> listGameDrawPlayerTwo = new ArrayList<>();		
		GameDraw gd1 = new GameDraw(PositionEnum.P1, "Didier", PawnEnum.X);
		GameDraw gd2 = new GameDraw(PositionEnum.P1, "Junior", PawnEnum.O);
				
		//When
									
		//Then		
		assertThat(when(kataUtilsMock.verifyFirstPawn(gd1, listGameDrawPlayerOne)).thenReturn(Boolean.TRUE));
		assertThat(when(kataUtilsMock.verifyFirstPawn(gd2, listGameDrawPlayerTwo)).thenReturn(Boolean.FALSE));
	}
	
	@Test
	public void verifyOccupedPositionTest(){
		//Griven
		GameDraw gd = new GameDraw(PositionEnum.P3, "Junior", PawnEnum.O);
		List<GameDraw> listGameDrawAllPlayers = kataUtilsMock.getListGameDrawAllPlayers();	
		listGameDrawAllPlayers.add(gd);
		
		GameDraw gdToTest = new GameDraw(PositionEnum.P3, "Didier", PawnEnum.X);
		GameDraw gdToTest1 = new GameDraw(PositionEnum.P4, "Didier", PawnEnum.X);
		
				
		//When
		//when(kataUtilsMock.verifyFirstPawn(gd1)).thenReturn(Boolean.TRUE);		
								
		//Then		
		assertThat(when(kataUtilsMock.verifyOccupedPosition(gdToTest, listGameDrawAllPlayers)).thenReturn(Boolean.TRUE));
		assertThat(when(kataUtilsMock.verifyOccupedPosition(gdToTest1, listGameDrawAllPlayers)).thenReturn(Boolean.FALSE));
	}
	
}
