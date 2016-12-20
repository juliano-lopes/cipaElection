package com.jlopes.cipa;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SpoilVoteTest {
	private SpoilVote vote;

	@Before
	public void setUp() {
		vote = new SpoilVote(0);
	}

	@Test
	public void shouldReturnTrueBecauseValueIsBiggerThanZero() {
		vote.add();
		assertTrue(vote.getQuantity() > 0);

	}

	@Test
	public void shouldReturnTrueBecauseValueIsSpoilVote() {
		assertTrue(vote.isSpoilVote(-1));
	}

}
