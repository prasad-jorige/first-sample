/**
 * 
 */
package com.pm.dao;

import java.util.List;

import com.pm.model.TxnInfo;

/**
 * @author prasadj
 *
 */
public interface TxnInfoDao {

	public List<TxnInfo> getAllTxnInfoList();
	
	public TxnInfo getTxnInfo(Long txnId);
	
	public List<TxnInfo> getTxnInfoList(Long channelId);
	
}