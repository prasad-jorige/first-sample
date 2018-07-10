/**
 * 
 */
package com.pm.service;

import java.util.List;

import com.pm.model.RuleInfo;

/**
 * @author prasadj
 *
 */
public interface RuleInfoService {

	public List<RuleInfo> getRuleInfoList();
	
	public RuleInfo getRule(Long ruleId);
	
	public RuleInfo addRule(RuleInfo rule);
	
	public void updateRule(Long id, String name, String description, String[] paramList);
	
	public void updateRuleState(Long id, boolean state);

}