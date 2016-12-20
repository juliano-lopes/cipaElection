package com.jlopes.cipa;

import java.util.ArrayList;
import java.util.List;

import com.jlopes.cipa.exception.InvalidVotationNumberException;
import com.jlopes.cipa.service.BlankVoteService;
import com.jlopes.cipa.service.CandidacyService;
import com.jlopes.cipa.service.SpoilVoteService;

public class BallotBox {
	private final List<Candidacy> candidacies;
	private final BlankVote blankVote;
	private final SpoilVote spoilVote;

	public BallotBox(CandidacyService candidacyService,
			BlankVoteService blankVoteService, SpoilVoteService spoilVoteService) {
		this.candidacies = candidacyService.getCandidacies();
		this.blankVote = blankVoteService.getVote();
		this.spoilVote = spoilVoteService.getVote();
	}

	private Candidacy getCandidacyByCandidateVotationNumber(int votationNumber) {
		for (Candidacy candidacy : candidacies) {
			if (candidacy.candidateVotationNumber() == votationNumber) {
				return candidacy;
			}
		}
		return null;
	}

	public void recordVote(int votationNumber) {
		Candidacy candidacy = getCandidacyByCandidateVotationNumber(votationNumber);
		if (candidacy != null) {
			candidacy.newVote();
		} else if (spoilVote.isSpoilVote(votationNumber)) {
			spoilVote.add();
		} else if (blankVote.isBlankVote(votationNumber)) {
			blankVote.add();
		} else {
			throw new InvalidVotationNumberException();
		}
	}

	public String getQuantityOfBlankAndSpoilVotes() {
		return "\nBlank votes: " + blankVote.getQuantity() + "\nSpoil votes: "
				+ spoilVote.getQuantity()
				+ "\nTotal of blank and spoil votes: "
				+ getTotalOfBlankAndSpoilVotes() + "\n";
	}

	private int getTotalOfBlankAndSpoilVotes() {
		return blankVote.getQuantity() + spoilVote.getQuantity();
	}

	public List<Candidacy> getCandidacyOrderedByVote() {
		List<Candidacy> notOrdered = new ArrayList<Candidacy>(candidacies);
		List<Candidacy> ordered = new ArrayList<Candidacy>();
		while (!notOrdered.isEmpty()) {
			Candidacy candidacy = getCandidacyWithBiggerVoteQuantity(notOrdered);
			ordered.add(candidacy);
			notOrdered.remove(candidacy);
		}
		return ordered;
	}

	private Candidacy getCandidacyWithBiggerVoteQuantity(
			List<Candidacy> notOrdered) {
		int value = 0;
		int index = 0;
		for (Candidacy candidacy : notOrdered) {
			if (value < candidacy.candidateVote()) {
				value = candidacy.candidateVote();
				index = notOrdered.indexOf(candidacy);
			}
		}
		return notOrdered.get(index);
	}

}
