package com.jlopes.cipa.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.domain.Vote;

public class VoteTest {
	private Vote vote;

	@Before
	public void setUp() {
		vote = new Vote(0);
	}

	@Test
	public void shouldReturnTrueBecauseIsBiggerThanZero() {
		vote.add();
		assertTrue(vote.getQuantity() > 0);
	}
}
