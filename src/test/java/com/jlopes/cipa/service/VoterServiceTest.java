package com.jlopes.cipa.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VoterServiceTest {
	@Test
	public void shouldReturnTrueBecauseTheListIsNotEmpty() {
		VoterService service = new VoterService();
		assertTrue(!service.getVoters().isEmpty());
	}

}
