package iuh.fit.ktruc.designpattern.singletonPattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Singleton Controller
 * @author Admin
 *	Đảm bảo một lớp chỉ có một phiên bản và cung cấp một điểm truy cập toàn cầu cho nó.
 */
@RestController
@RequestMapping("/singleton")
public class SingletonController {

	@GetMapping("")
	public String getSingleton() {
		SingletonPattern singletonPattern1 = 
				SingletonPattern.getInstance("singlePattern -- 1");
        SingletonPattern singletonPattern2 = 
        		SingletonPattern.getInstance("singlePattern --- 2");

        singletonPattern1.printValue();
        singletonPattern2.printValue();
		return "Singleton run ....";
	}
	
}
