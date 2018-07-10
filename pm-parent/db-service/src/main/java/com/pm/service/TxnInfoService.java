/**
 * 
 */
package com.pm.service;

import java.util.List;

import com.pm.model.TxnInfo;

/**
 * @author prasadj
 *
 */
public interface TxnInfoService {

	public List<TxnInfo> getAllTxnInfoList();

	public TxnInfo getTxnInfo(Long txnId);
	
	public List<TxnInfo> getTxnInfoList(Long channelId);
	
}