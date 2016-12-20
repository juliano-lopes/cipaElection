package com.jlopes.cipa;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.exception.VotationDoneException;
import com.jlopes.cipa.exception.VotationShouldBeDoneException;
import com.jlopes.cipa.io.Writer;
import com.jlopes.cipa.service.BlankVoteService;
import com.jlopes.cipa.service.CandidacyService;
import com.jlopes.cipa.service.SpoilVoteService;
import com.jlopes.cipa.service.VoterService;

public class ElectionTest {
	private Election election;

	@Before
	public void setUp() {
		election = new Election(new Writer(), new VoterService(),
				new BallotBox(new CandidacyService(), new BlankVoteService(),
						new SpoilVoteService()));
	}

	@Test(expected = VotationDoneException.class)
	public void isExpectedaVotationDoneException() {
		election.start();
		election.start();
	}

	@Test(expected = VotationShouldBeDoneException.class)
	public void isExpectedAVotationShouldBeDoneException() {
		election.close();
	}

}