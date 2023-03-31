package com.fortis.cge.kata.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fortis.cge.kata.model.GameDraw;
import com.fortis.cge.kata.model.PawnEnum;
import com.fortis.cge.kata.model.PositionEnum;


@ExtendWith(MockitoExtension.class)
public class GameServiceTest {

	@Mock
	GameServiceImpl gameServiceImplMock;
	
	@Test
	public void launchPartyTest() {
		//Given	
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
		listGameDraw.add(gd1);
		listGameDraw.add(gd2);
		listGameDraw.add(gd3);
		listGameDraw.add(gd4);
		listGameDraw.add(gd5);
		listGameDraw.add(gd6);
		listGameDraw.add(gd7);
		listGameDraw.add(gd8);
		listGameDraw.add(gd9);
		
		//When
		when(gameServiceImplMock.launchParty()).thenReturn(listGameDraw);
		
		//Then
		List<GameDraw> listGameDrawTest = gameServiceImplMock.launchParty();
		assertThat(listGameDrawTest).isNotNull();
		assertThat(listGameDrawTest.size()).isEqualTo(9);
	}
	
	@Test
	public void drawTest() {
		//Given
		GameDraw gd = new GameDraw(PositionEnum.P3, " ", PawnEnum.X);
		
		
		//When
		when(gameServiceImplMock.draw(gd)).thenReturn("OK");
		
		//Then
		String result = gameServiceImplMock.draw(gd);
		assertThat(result).isEqualTo("OK");
		
	}
	
		
}
