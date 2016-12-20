package com.jlopes.cipa;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BlankVoteTest {
	private BlankVote vote;

	@Before
	public void setUp() {
		vote = new BlankVote(0);
	}

	@Test
	public void shouldReturnTrueBecauseValueIsBiggerThanZero() {
		vote.add();
		assertTrue(vote.getQuantity() > 0);

	}

	@Test
	public void shouldReturnOne() {
		vote.add();
		assertThat(vote.getQuantity(), is(1));
	}

	@Test
	public void shouldReturnTrueBecauseValueIsBlankVote() {
		assertTrue(vote.isBlankVote(0));
	}

}
