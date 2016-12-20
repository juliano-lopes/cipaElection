package com.jlopes.cipa;

import com.jlopes.cipa.io.Writer;
import com.jlopes.cipa.service.BlankVoteService;
import com.jlopes.cipa.service.CandidacyService;
import com.jlopes.cipa.service.SpoilVoteService;
import com.jlopes.cipa.service.VoterService;

public class CipaMain {
	public static void main(String[] args) {
		Election election = new Election(new Writer(), new VoterService(),
				new BallotBox(new CandidacyService(), new BlankVoteService(),
						new SpoilVoteService()));
		election.start();
		election.close();
	}
}