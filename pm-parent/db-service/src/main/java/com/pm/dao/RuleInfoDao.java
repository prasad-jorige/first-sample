/**
 * 
 */
package com.pm.dao;

import java.util.List;

import com.pm.model.RuleInfo;

/**
 * @author prasadj
 *
 */
public interface RuleInfoDao {

	public List<RuleInfo> getRuleInfoList();
	
	public RuleInfo getRule(Long ruleId);
	
	public Long addRule(RuleInfo rule);
	
	public void updateRule(RuleInfo rule);
	
}