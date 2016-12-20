package com.jlopes.cipa.domain;

import org.junit.Test;

import com.jlopes.cipa.exception.VotationNumberShouldBeNotLessThanOneException;

public class CandidateTest {
	@Test(expected = VotationNumberShouldBeNotLessThanOneException.class)
	public void isExpectedAVotationNumberShouldBeNotLessThanOneException() {
		new Candidate("1234", "Osvaldo", 0);
	}
}
