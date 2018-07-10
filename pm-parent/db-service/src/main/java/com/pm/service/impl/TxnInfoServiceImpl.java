/**
 * 
 */
package com.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pm.dao.TxnInfoDao;
import com.pm.model.TxnInfo;
import com.pm.service.TxnInfoService;

/**
 * @author prasadj
 *
 */
@Component("txnInfoService")
public class TxnInfoServiceImpl implements TxnInfoService {

	@Autowired
	private TxnInfoDao txnInfoDao;
	
	public TxnInfoServiceImpl() {
	}
	
	@Override
	@Transactional (readOnly = true)
	public List<TxnInfo> getAllTxnInfoList() {
		return txnInfoDao.getAllTxnInfoList();
	}
	
	@Override
	@Transactional (readOnly = true)
	public List<TxnInfo> getTxnInfoList(Long channelId){
		return txnInfoDao.getTxnInfoList(channelId);
	}
	
	@Override
	@Transactional (readOnly = true)
	public TxnInfo getTxnInfo(Long txnId) {
		return txnInfoDao.getTxnInfo(txnId);
	}
	
}