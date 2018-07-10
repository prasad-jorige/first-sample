/**
 * 
 */
package com.pm.db.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pm.model.TxnInfo;
import com.pm.service.TxnInfoService;

/**
 * @author prasadj
 *
 */
public class TxnInfoServiceTest extends AbstractServiceTest {

	@Autowired
	private TxnInfoService txnInfoService;
	
	@Test
	public void getAllTxnInfoListTest() throws Exception {
		List<TxnInfo> txns = txnInfoService.getAllTxnInfoList();
		System.out.println("size of list: " + txns.size());
		Assert.assertNotNull(txns);
		Assert.assertEquals(6, txns.size());
	}
	
	@Test
	public void getTxnInfoList01Test() throws Exception {
		List<TxnInfo> txns = txnInfoService.getTxnInfoList(100L);
		System.out.println("size of list: " + txns.size());
		Assert.assertNotNull(txns);
		Assert.assertEquals(1, txns.size());
	}
	
	@Test
	public void getTxnInfoList02Test() throws Exception {
		List<TxnInfo> txns = txnInfoService.getTxnInfoList(102L);
		System.out.println("size of list: " + txns.size());
		Assert.assertNotNull(txns);
		Assert.assertEquals(2, txns.size());
	}

	@Test
	public void getTxnInfoList03Test() throws Exception {
		List<TxnInfo> txns = txnInfoService.getTxnInfoList(99L);
		System.out.println("size of list: " + txns.size());
		Assert.assertNotNull(txns);
		Assert.assertEquals(0, txns.size());
	}
	
	@Test
	public void getTxnInfo01Test() throws Exception {
		TxnInfo txn = txnInfoService.getTxnInfo(1000000014L);
		Assert.assertNotNull(txn);
		Assert.assertEquals("1000000014", txn.getTxnId().toString());
	}
	
	@Test
	public void getTxnInfo02Test() throws Exception {
		TxnInfo txn = txnInfoService.getTxnInfo(1000000228L);
		Assert.assertNotNull(txn);
		Assert.assertEquals("1000000228", txn.getTxnId().toString());
	}
	
	@Test
	public void getTxnInfo03Test() throws Exception {
		TxnInfo txn = txnInfoService.getTxnInfo(1000000L);
		Assert.assertNull(txn);
	}
	
}