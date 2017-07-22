package org.logic_with_oop;

public final class NotRule implements Rule {

	private final Rule rule;
	
	public NotRule (final Rule rule) { 
		this.rule = rule;
	}

	@Override
	public boolean accept() {
		return !rule.accept();
	}
	
	@Override
	public String toString() { 
		return rule.toString() + " should NOT be TRUE";
	}
}
