package com.fortis.cge.kata.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 * This class is representing one draw and will show where a player
 * put a pawn and wich pawn he use
 * @author Didier
 */
@AllArgsConstructor
@Getter @Setter
public class GameDraw implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5094145875117612244L;
	
	private PositionEnum position;
	private String playerName;
	private PawnEnum pawn;

}
