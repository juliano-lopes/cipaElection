package com.jlopes.cipa;

import com.jlopes.cipa.domain.Candidate;
import com.jlopes.cipa.domain.Vote;
import com.jlopes.cipa.service.VoteService;

public class Candidacy {
	private final Candidate candidate;
	private final Vote vote;

	public Candidacy(Candidate candidate, VoteService voteService) {
		this.candidate = candidate;
		voteService.setVotationNumber(candidate.getVotationNumber());
		this.vote = voteService.getVote();
	}

	public String getCandidateData() {
		return candidate.toString();
	}

	public int candidateVote() {
		return vote.getQuantity();
	}

	public int candidateVotationNumber() {
		return candidate.getVotationNumber();
	}

	public void newVote() {
		vote.add();
	}

	public String toString() {
		return candidate.toString() + "Votes: " + vote.getQuantity() + "\n";
	}

}
