package com.jlopes.cipa;

import java.util.List;

import com.jlopes.cipa.domain.Voter;
import com.jlopes.cipa.exception.VotationDoneException;
import com.jlopes.cipa.exception.VotationShouldBeDoneException;
import com.jlopes.cipa.io.Writer;
import com.jlopes.cipa.service.VoterService;

public class Election {
	private final Writer writer;
	private final List<Voter> voters;
	private final BallotBox ballotBox;
	private boolean votationDone;

	public Election(Writer writer, VoterService voterService,
			BallotBox ballotBox) {
		this.writer = writer;
		this.voters = voterService.getVoters();
		this.ballotBox = ballotBox;
		votationDone = false;
	}

	public void start() {
		if (votationDone) {
			throw new VotationDoneException();
		}
		for (Voter voter : voters) {
			ballotBox.recordVote(voter.vote());
			votationDone = true;
		}
	}

	public void close() {
		if (!votationDone) {
			throw new VotationShouldBeDoneException();
		}
		List<Candidacy> ordered = ballotBox.getCandidacyOrderedByVote();
		for (Candidacy candidacy : ordered) {
			writer.show(candidacy.toString());
		}
		writer.show(ballotBox.getQuantityOfBlankAndSpoilVotes());
	}

}
