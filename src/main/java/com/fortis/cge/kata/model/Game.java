package com.fortis.cge.kata.model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This class is representing one game and will show players and the winner
 * @author Didier
 */
@AllArgsConstructor
@Getter @Setter
public class Game implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8130881052859334557L;

	private Long id;
	private Date startDate;
	private Date endDate;
	private String playerOne;
	private String playerTwo;
	private String winner;
	
}
