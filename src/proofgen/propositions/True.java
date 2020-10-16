package proofgen.propositions;

import proofgen.Proposition;

/**
 * True: always true,⊤
 * @author harper
 *
 */
public class True implements Proposition {

	public True() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String LaTeXPrint() {
		return "\\top";
	}

	@Override
	public String JavaPrint() {
		return "⊤";
	}

}
