package com.jlopes.cipa.service;

import java.util.Arrays;
import java.util.List;

import com.jlopes.cipa.Candidacy;
import com.jlopes.cipa.domain.Candidate;

public class CandidacyService {
	public List<Candidacy> getCandidacies() {
		List<Candidacy> candidacies = Arrays.asList(new Candidacy(
				new Candidate("111", "Andre", 1), new VoteService()),
				new Candidacy(new Candidate("222", "Bruno", 2),
						new VoteService()), new Candidacy(new Candidate("333",
						"Camile", 3), new VoteService()), new Candidacy(
						new Candidate("444", "Daniel", 4), new VoteService()),
				new Candidacy(new Candidate("555", "Everaldo", 5),
						new VoteService()));
		return candidacies;
	}
}
