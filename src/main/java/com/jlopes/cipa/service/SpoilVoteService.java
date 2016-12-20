package com.jlopes.cipa.service;

import java.util.Random;

import com.jlopes.cipa.SpoilVote;

public class SpoilVoteService extends VoteService {
	public SpoilVote getVote() {
		return new SpoilVote(getVoteQuantity());
	}

	private int getVoteQuantity() {
		Random rand = new Random();
		return rand.nextInt(5);
	}
}
