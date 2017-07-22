package org.logic_with_oop;

/**
 * wrapper class
 * 
 * @author petarDj
 *
 */
public class IsRule implements Rule {

	private final boolean expression;
	
	public IsRule(boolean expression) {
		this.expression = expression;
	}

	@Override
	public boolean accept() {
		return expression;
	}
}
