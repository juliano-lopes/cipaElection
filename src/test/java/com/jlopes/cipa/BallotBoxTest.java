package com.jlopes.cipa;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.BallotBox;
import com.jlopes.cipa.exception.InvalidVotationNumberException;
import com.jlopes.cipa.service.BlankVoteService;
import com.jlopes.cipa.service.CandidacyService;
import com.jlopes.cipa.service.SpoilVoteService;

public class BallotBoxTest {
	private BallotBox ballot;

	@Before
	public void setUp() {
		ballot = new BallotBox(new CandidacyService(), new BlankVoteService(),
				new SpoilVoteService());
	}

	@Test(expected = InvalidVotationNumberException.class)
	public void isExpectedAInvalidVotationNumberException() {
		ballot.recordVote(12345);
	}

	@Test
	public void shouldReturnTrueBecauseListIsNotEmpty() {
		assertTrue(!ballot.getCandidacyOrderedByVote().isEmpty());
	}

}
