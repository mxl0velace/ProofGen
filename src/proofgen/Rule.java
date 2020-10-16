package proofgen;

/**
 * Interface for all Rules, defines String outputs.
 * @author harper
 *
 */
public interface Rule {
	public String LaTeXPrint();
	public String JavaPrint();
	public Proposition getResult();
}
