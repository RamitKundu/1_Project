/* 
 * Ramit
 * */
package co.in.Quotes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import co.in.Quotes.Dao.UserDetailsDao;
import co.in.Quotes.Dao.UserInfoDao;
//import co.in.Quotes.Model.UserDetails;
import co.in.Quotes.Model.UserInfo;

@RestController
public class UserDetailsController {
	@Autowired
	UserInfoDao userInfoDao;
	@Autowired
	UserInfo userInfo;

	//@RequestMapping(value="/", method=RequestMethod.POST)===testing purpose
	public ResponseEntity<UserInfo> addUser(@RequestBody UserInfo userInfo){
		userInfoDao.insertUser(userInfo);
		System.out.println("I am Here======================================");
		return new ResponseEntity<UserInfo>(userInfo, HttpStatus.OK);
		
	}
	
	    @RequestMapping("/")
	    @ResponseBody
	    public String welcome() {
	        return "index";
	    }
	
	
	
	
}
