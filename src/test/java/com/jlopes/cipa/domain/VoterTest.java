package com.jlopes.cipa.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.jlopes.cipa.domain.Voter;
import com.jlopes.cipa.exception.VoterDataShouldBeNotEmptyException;
import com.jlopes.cipa.exception.VoterHasVotedException;

public class VoterTest {
	private Voter voter;

	@Before
	public void setUp() {
		voter = new Voter("1234", "Osvaldo", 3);
	}

	@Test(expected = VoterDataShouldBeNotEmptyException.class)
	public void isExpectedAVoterDataShouldBeNotEmptyException() {
		new Voter("1234", "", 0);
	}

	@Test
	public void shouldReturnTrueIfValueIsBiggerThanZero() {
		assertTrue(voter.vote() > 0);
	}

	@Test(expected = VoterHasVotedException.class)
	public void isExpectedAVoterHasVotedException() {
		voter.vote();
		voter.vote();
	}

}
