package proofgen.propositions;

import proofgen.Proposition;

/**
 * False: Always not true,⊥.
 * @author harper
 *
 */
public class False implements Proposition {

	public False() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String LaTeXPrint() {
		return "\\bot";
	}

	@Override
	public String JavaPrint() {
		return "⊥";
	}

}
