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

import com.pm.model.RuleInfo;
import com.pm.service.RuleInfoService;

/**
 * @author prasadj
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/ruleinfo")
public class RuleInfoController {

	@Autowired
	private RuleInfoService ruleInfoService;
	
	@GetMapping(value = "/all")
    public ResponseEntity<List<RuleInfo>> getAllTxnInfo() {
		List<RuleInfo> rules = ruleInfoService.getRuleInfoList();
		System.out.println("size of the RuleInfo list: " + rules.size());
        return new ResponseEntity<List<RuleInfo>>(rules, HttpStatus.OK);
    }

	@GetMapping(value = "/{rid}")
    public ResponseEntity<RuleInfo> getTxnInfo(@PathVariable long rid) {
		RuleInfo prdto = ruleInfoService.getRule(rid);
        return new ResponseEntity<RuleInfo>(prdto, HttpStatus.OK);
    }
	
}