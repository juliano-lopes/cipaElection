package com.jlopes.cipa.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.domain.Vote;

public class VoteServiceTest {
	private VoteService service;
	private Vote vote;

	@Before
	public void setUp() {
		service = new VoteService();
	}

	@Test
	public void shouldReturnTrueBecauseValueIsBiggerThanZero() {
		service.setVotationNumber(111);
		vote = service.getVote();
		assertTrue(vote.getQuantity() > 0);
	}
}
