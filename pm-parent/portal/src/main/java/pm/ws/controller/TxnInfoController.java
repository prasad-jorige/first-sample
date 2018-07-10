/**
 * 
 */
package pm.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pm.model.TxnInfo;
import com.pm.service.TxnInfoService;

/**
 * @author prasadj
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/txninfo")
public class TxnInfoController {

	@Autowired
	private TxnInfoService txnInfoService;
	
	@GetMapping(value = "/all")
    public ResponseEntity<List<TxnInfo>> getAllTxnInfo() {
		List<TxnInfo> prdto = txnInfoService.getAllTxnInfoList();
		System.out.println("size of the TxnInfo list: " + prdto.size());
        return new ResponseEntity<List<TxnInfo>>(prdto, HttpStatus.OK);
    }
	
	@GetMapping(value = "/channel/{id}")
    public ResponseEntity<List<TxnInfo>> getChannelTxnInfo(@PathVariable long id) {
		List<TxnInfo> prdto = txnInfoService.getTxnInfoList(id);
		System.out.println("size of the TxnInfo list: " + prdto.size());
        return new ResponseEntity<List<TxnInfo>>(prdto, HttpStatus.OK);
    }
	
	@GetMapping(value = "/{tid}")
    public ResponseEntity<TxnInfo> getTxnInfo(@PathVariable long tid) {
		TxnInfo prdto = txnInfoService.getTxnInfo(tid);
        return new ResponseEntity<TxnInfo>(prdto, HttpStatus.OK);
    }
	
}