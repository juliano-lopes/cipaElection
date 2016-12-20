package com.jlopes.cipa.domain;

import com.jlopes.cipa.exception.VotationNumberShouldBeNotLessThanOneException;

public class Candidate extends Voter {
	public Candidate(String cpf, String name, int votationNumber) {
		super(cpf, name, votationNumber);
		if (!isValidVotationNumber(votationNumber)) {
			throw new VotationNumberShouldBeNotLessThanOneException();
		}
	}

	private boolean isValidVotationNumber(int votationNumber) {
		return (votationNumber > 0);
	}

	public String toString() {
		return super.toString() + "\nVotation number: " + votationNumber + "\n";
	}

	public int getVotationNumber() {
		return votationNumber;
	}
}
