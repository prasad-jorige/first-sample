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

import com.pm.dao.TxnInfoDao;
import com.pm.model.TxnInfo;

/**
 * @author prasadj
 *
 */
@Component
@SuppressWarnings("unchecked")
public class TxnInfoDaoImpl implements TxnInfoDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public TxnInfoDaoImpl() {
	}
	
	@Override
	public List<TxnInfo> getAllTxnInfoList() {
		return (List<TxnInfo>)hibernateTemplate.execute(new HibernateCallback<List<TxnInfo>>() {
			public List<TxnInfo> doInHibernate(Session session) {
                return session.createQuery("select ti from TxnInfo ti").setFirstResult(0).list();
			}
		});
	}

	@Override
	public TxnInfo getTxnInfo(final Long txnId) {
		return (TxnInfo)hibernateTemplate.execute(new HibernateCallback<TxnInfo>() {
			public TxnInfo doInHibernate(Session session) {
				List<TxnInfo> lst = session.createQuery("select ti from TxnInfo ti where txnId = :tId").setParameter("tId", txnId).setFirstResult(0).setMaxResults(1).list();
				if(lst != null && lst.size() != 0) {
					return lst.get(0);
				}
                return null;
			}
		});
	}

	@Override
	public List<TxnInfo> getTxnInfoList(final Long channelId) {
		return (List<TxnInfo>)hibernateTemplate.execute(new HibernateCallback<List<TxnInfo>>() {
			public List<TxnInfo> doInHibernate(Session session) {
				return session.createQuery("select ti from TxnInfo ti where channelId = :chnId").setParameter("chnId", channelId).setFirstResult(0).list();
			}
		});
	}
	
}