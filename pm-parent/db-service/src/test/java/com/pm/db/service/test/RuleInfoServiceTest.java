/**
 * 
 */
package com.pm.db.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pm.model.RuleInfo;
import com.pm.service.RuleInfoService;

/**
 * @author prasadj
 *
 */
public class RuleInfoServiceTest extends AbstractServiceTest {

	@Autowired
	private RuleInfoService ruleInfoService;
	
	@Test
	public void getAllTxnInfoListTest() throws Exception {
		List<RuleInfo> rules = ruleInfoService.getRuleInfoList();
		System.out.println("size of Rule list: " + rules.size());
		Assert.assertNotNull(rules);
		Assert.assertEquals(10, rules.size());
	}

	@Test
	public void getRuleTest() throws Exception {
		RuleInfo rule = ruleInfoService.getRule(1003L);
		Assert.assertNotNull(rule);
		Assert.assertEquals("1003", rule.getId().toString());
	}
	
	@Test
	public void getRule02Test() throws Exception {
		RuleInfo rule = ruleInfoService.getRule(1006L);
		Assert.assertNotNull(rule);
		Assert.assertEquals("1006", rule.getId().toString());
	}
	
	@Test
	public void getRule03Test() throws Exception {
		RuleInfo rule = ruleInfoService.getRule(1016L);
		Assert.assertNull(rule);
	}
	
	@Test
	public void addRuleTest() throws Exception {
		RuleInfo rule = new RuleInfo();
		rule.setName("New Rule");
		rule.setDescription("New Rule Description");
		rule.setParams("ParamA:ParamB:ParamC");
		rule.setState(false);
		RuleInfo rout = ruleInfoService.addRule(rule);
		Assert.assertNotNull(rout);
		Assert.assertNotNull(rout.getId().toString());
		Assert.assertEquals(rule.getName(), rout.getName());
		Assert.assertEquals(rule.getDescription(), rout.getDescription());
		Assert.assertEquals(rule.getState(), rout.getState());
	}
	
	@Test (expected = Exception.class)
	public void addRule02Test() throws Exception {
		RuleInfo rule = new RuleInfo();
		rule.setName("Rule One");
		rule.setDescription("New Rule Description");
		rule.setParams("ParamA:ParamB:ParamC");
		rule.setState(false);
		ruleInfoService.addRule(rule);
	}
	
	@Test
	public void updateRuleTest() throws Exception {
		ruleInfoService.updateRule(1001L, "Sample Rule", "Sample Rule Description", new String[] {"ABC", "XYZ"});
		RuleInfo rule = ruleInfoService.getRule(1001L);
		Assert.assertNotNull(rule);
		Assert.assertEquals("1001", rule.getId().toString());
		Assert.assertEquals("Sample Rule", rule.getName());
		Assert.assertEquals("Sample Rule Description", rule.getDescription());
		Assert.assertEquals(true, rule.getState());
	}
	
	@Test (expected = Exception.class)
	public void updateRule02Test() throws Exception {
		ruleInfoService.updateRule(1001L, "Rule Two", "Sample Rule Description", new String[] {"ABC", "XYZ"});
	}
	
	@Test 
	public void updateRule03Test() throws Exception {
		ruleInfoService.updateRule(1001L, "Sample Rule", null, new String[] {"ABC", "XYZ"});
		RuleInfo rule = ruleInfoService.getRule(1001L);
		Assert.assertNotNull(rule);
		Assert.assertEquals("1001", rule.getId().toString());
		Assert.assertEquals("Sample Rule", rule.getName());
		Assert.assertNull(rule.getDescription());
		Assert.assertEquals(true, rule.getState());
	}
	
	@Test (expected = Exception.class)
	public void updateRule04Test() throws Exception {
		ruleInfoService.updateRule(1001L, "Rule XYZ", "Sample Rule Description", null);
	}
	
	@Test (expected = Exception.class)
	public void updateRule05Test() throws Exception {
		ruleInfoService.updateRule(1101L, "Rule XYZ", "Sample Rule Description", new String[] {"ABC", "XYZ"});
	}
	
	@Test 
	public void updateRuleStateTest() throws Exception {
		ruleInfoService.updateRuleState(1001L, false);
		RuleInfo rule = ruleInfoService.getRule(1001L);
		Assert.assertNotNull(rule);
		Assert.assertEquals("1001", rule.getId().toString());
		Assert.assertEquals(false, rule.getState());
	}
	
	@Test (expected = Exception.class)
	public void updateRuleState02Test() throws Exception {
		ruleInfoService.updateRuleState(1101L, false);
	}
	
}