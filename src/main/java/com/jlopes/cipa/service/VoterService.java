package com.jlopes.cipa.service;

import java.util.Arrays;
import java.util.List;

import com.jlopes.cipa.domain.Voter;

public class VoterService {
	public List<Voter> getVoters() {
		List<Voter> voters = Arrays.asList(new Voter("971", "Adriane", 4),
				new Voter("999", "Jose", 0), new Voter("888", "Maria", 1),
				new Voter("777", "Joao", -1), new Voter("676", "Eleomar", 2),
				new Voter("795", "Carlos", 3), new Voter("889", "Gessica", 4),
				new Voter("789", "Lucas", 5), new Voter("912", "Camila", 0),
				new Voter("623", "Marcelo", 5), new Voter("913", "Carla", 2),
				new Voter("522", "Gleison", 5), new Voter("914", "Carlito", 2),
				new Voter("654", "Jose Julio", 5), new Voter("915", "Vanessa",
						3), new Voter("933", "Luciano", -1));
		return voters;
	}
}
