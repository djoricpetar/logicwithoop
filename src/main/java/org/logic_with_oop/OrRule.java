package org.logic_with_oop;

import java.util.LinkedList;
import java.util.List;

public final class OrRule implements Rule {

	private List<Rule> rules = new LinkedList<Rule>();
	
	public OrRule(final Rule...rules) { 
		for(Rule rule : rules) 
			addRule(rule);
	}
	
	public void addRule(final Rule rule) { 
		rules.add(rule);
	}

	@Override
	public boolean accept() {
		for(Rule rule : rules) { 
			if(rule.accept()) { 
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() { 
		StringBuilder sb = new StringBuilder().append("(");
		
		for(int i = 0 ; i < rules.size() ; i++) { 
			sb.append( rules.get(i).toString() ) .append( rules.size() - 1 == i ? "" : " OR " );
		}
		
		sb.append(')');
		
		return sb.toString();
	}
}
