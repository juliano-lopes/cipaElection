package com.jlopes.cipa;

import com.jlopes.cipa.domain.Vote;

public class BlankVote extends Vote {
	private static final int BLANK = 0;

	public BlankVote(int quantity) {
		super(quantity);
	}

	public boolean isBlankVote(int vote) {
		return (vote == BLANK);
	}

}
