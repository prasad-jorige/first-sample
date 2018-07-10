/**
 * 
 */
package com.pm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.pm.dao.RuleInfoDao;
import com.pm.model.RuleInfo;

/**
 * @author prasadj
 *
 */
@Component
@SuppressWarnings("unchecked")
public class RuleInfoDaoImpl implements RuleInfoDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public RuleInfoDaoImpl() {
	}
	
	@Override
	public List<RuleInfo> getRuleInfoList() {
		return (List<RuleInfo>)hibernateTemplate.execute(new HibernateCallback<List<RuleInfo>>() {
			public List<RuleInfo> doInHibernate(Session session) {
                return session.createQuery("select ri from RuleInfo ri").setFirstResult(0).list();
			}
		});

	}

	@Override
	public RuleInfo getRule(Long ruleId) {
		return hibernateTemplate.get(RuleInfo.class, ruleId);
	}

	@Override
	public Long addRule(RuleInfo rule) {
		return (Long) hibernateTemplate.save(rule);
	}

	@Override
	public void updateRule(RuleInfo rule) {
		hibernateTemplate.update(rule);
	}

}