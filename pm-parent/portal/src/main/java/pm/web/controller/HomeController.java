/**
 * 
 */
package pm.web.controller;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author prasadj
 *
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDepositeProductListPage(Map model, Locale locale, HttpServletRequest request){
		return "home";
	}
	
}
