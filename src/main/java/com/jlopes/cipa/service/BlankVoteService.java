package com.jlopes.cipa.service;

import java.util.Random;

import com.jlopes.cipa.BlankVote;

public class BlankVoteService extends VoteService {
	public BlankVote getVote() {
		return new BlankVote(getVoteQuantity());
	}

	private int getVoteQuantity() {
		Random rand = new Random();
		return rand.nextInt(10);
	}

}
