package com.jlopes.cipa;

import com.jlopes.cipa.domain.Vote;

public class SpoilVote extends Vote {
	private static final int SPOIL = -1;

	public SpoilVote(int quantity) {
		super(quantity);
	}

	public boolean isSpoilVote(int vote) {
		return (vote == SPOIL);
	}

}
