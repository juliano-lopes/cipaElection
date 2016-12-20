package com.jlopes.cipa.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.SpoilVote;

public class SpoilVoteServiceTest {
	private SpoilVoteService service;
	private SpoilVote vote;

	@Before
	public void setUp() {
		service = new SpoilVoteService();
	}

	@Test
	public void shouldReturnTrueBecauseValueIsBiggerThanZero() {
		vote = service.getVote();
		assertTrue(vote.getQuantity() > 0);
	}
}
