package com.joana.counter;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// ... imports (Use shift+ctrl+O or shift+cmd+O to import as you code)
@Controller

public class MainController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int sessionNum = (Integer) session.getAttribute("count")+1;
			session.setAttribute("count", sessionNum);
		}
		return "index.jsp";
	}
  
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int sessionNum = (Integer) session.getAttribute("count");
			session.setAttribute("count", sessionNum);
		}
		return "showCount.jsp";
	}

  @RequestMapping("/counterby2")
	public String countingTwo(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int sessionNum = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count", sessionNum);
		}
		return "countUpTwo.jsp";
	}


}
