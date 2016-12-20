package com.jlopes.cipa.domain;

import com.jlopes.cipa.exception.VoterDataShouldBeNotEmptyException;
import com.jlopes.cipa.exception.VoterHasVotedException;

public class Voter {
	private final String name;
	private final String cpf;
	protected final int votationNumber;
	private boolean voted;

	public Voter(String cpf, String name, int votationNumber) {
		if (isDataEmpty(cpf, name)) {
			throw new VoterDataShouldBeNotEmptyException();
		}

		this.cpf = cpf;
		this.name = name;
		this.votationNumber = votationNumber;
		voted = false;
	}

private boolean isDataEmpty(String... params) {
		for (String value : params) {
			if (value.equals("")) {
				return true;
			}
		}
		return false;
	}

	public int vote() {
		if (voted) {
			throw new VoterHasVotedException();
		}
		voted = true;
		return votationNumber;
	}

	public String toString() {
		return "\nCPF: " + cpf + "\nName: " + name + "\n";
	}
}
