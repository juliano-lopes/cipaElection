package com.jlopes.cipa.service;

import java.util.Random;

import com.jlopes.cipa.domain.Vote;

public class VoteService {
	private int votationNumber;

	public Vote getVote() {
		return new Vote(getVoteQuantity());
	}

	public void setVotationNumber(int votationNumber) {
		this.votationNumber = votationNumber;
	}

	private int getVoteQuantity() {
		Random rand = new Random();
		return rand.nextInt(votationNumber);
	}
}