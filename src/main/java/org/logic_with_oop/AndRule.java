package org.logic_with_oop;

import java.util.LinkedList;
import java.util.List;

public final class AndRule implements Rule {
	
	private List<Rule> rules = new LinkedList<Rule>();
	
	public AndRule(final Rule...rules) { 
		for(Rule rule : rules)
			addRule(rule);
	}
	
	private void addRule(final Rule rule) { 
		rules.add(rule);
	}

	@Override
	public boolean accept() {
		for(Rule rule : rules) { 
			if(!rule.accept()) { 
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() { 
		StringBuilder sb = new StringBuilder().append("(");
		
		for(int i = 0 ; i < rules.size() ; i++) { 
			sb.append(rules.get(i).toString()).append( rules.size() - 1 == i ? "" : " AND ");
		}
		
		sb.append(')');
		
		return sb.toString();
	}


}
