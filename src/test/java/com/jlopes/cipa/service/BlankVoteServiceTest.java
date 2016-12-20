package com.jlopes.cipa.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.BlankVote;

public class BlankVoteServiceTest {
	private BlankVoteService service;
	private BlankVote vote;

	@Before
	public void setUp() {
		service = new BlankVoteService();
	}

	@Test
	public void shouldReturnTrueBecauseValueIsBiggerThanZero() {
		vote = service.getVote();
		assertTrue(vote.getQuantity() > 0);
	}
}
