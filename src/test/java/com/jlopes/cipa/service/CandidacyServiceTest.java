package com.jlopes.cipa.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jlopes.cipa.service.CandidacyService;

public class CandidacyServiceTest {
	@Test
	public void shouldReturnTrueBecauseTheListIsNotEmpty() {
		CandidacyService service = new CandidacyService();
		assertTrue(!service.getCandidacies().isEmpty());
	}
}
