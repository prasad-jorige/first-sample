/**
 * 
 */
package com.pm.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pm.dao.RuleInfoDao;
import com.pm.model.RuleInfo;
import com.pm.service.RuleInfoService;

/**
 * @author prasadj
 *
 */
@Component("ruleInfoService")
public class RuleInfoServiceImpl implements RuleInfoService {

	@Autowired
	private RuleInfoDao ruleInfoDao;
	
	public RuleInfoServiceImpl() {
	}
	
	@Override
	@Transactional (readOnly = true)
	public List<RuleInfo> getRuleInfoList() {
		return ruleInfoDao.getRuleInfoList();
	}

	@Override
	@Transactional (readOnly = true)
	public RuleInfo getRule(Long ruleId) {
		return ruleInfoDao.getRule(ruleId);
	}

	@Override
	@Transactional (readOnly = false, rollbackFor = Throwable.class)
	public RuleInfo addRule(RuleInfo rule) {
		rule.setCreationDate(new Date());
		rule.setUpdatedDate(rule.getCreationDate());
		Long id = ruleInfoDao.addRule(rule);
		RuleInfo ri = rule.clone();
		ri.setId(id);
		return ri;
	}

	@Override
	@Transactional (readOnly = false, rollbackFor = Throwable.class)
	public void updateRule(Long id, String name, String description, String[] paramList) {
		RuleInfo ri = ruleInfoDao.getRule(id);
		ri.setName(name);
		ri.setDescription(description);
		List<String> list = Arrays.asList(paramList);
		ri.setParams(String.join(":", list));
		ri.setUpdatedDate(new Date());
		ruleInfoDao.updateRule(ri);
	}

	@Override
	@Transactional (rollbackFor = Throwable.class)
	public void updateRuleState(Long id, boolean state) {
		RuleInfo ri = ruleInfoDao.getRule(id);
		ri.setState(state);
		ri.setUpdatedDate(new Date());
		ruleInfoDao.updateRule(ri);
	}

}