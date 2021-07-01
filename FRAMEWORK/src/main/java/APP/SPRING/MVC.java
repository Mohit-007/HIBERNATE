package APP.SPRING;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import APP.SERVICE.ADDITION;

@Controller
public class MVC {

	@RequestMapping("/add")
//	public void add()
//	public String add()
//	public ModelAndView add(HttpServletRequest request , HttpServletResponse response)	
	public ModelAndView add(@RequestParam("a") int i,@RequestParam("b") int j)
	{
//		System.out.println("hello world");

//		request the number
//		int i = Integer.parseInt(request.getParameter("a"));
//		int j = Integer.parseInt(request.getParameter("b"));

//		add the number
		int k = i+j;
		
//      by service method class
		ADDITION add = new ADDITION();
		k = add.add(i, j);
		
//		apply model view object that will call the view and pass the variable in the view
		ModelAndView mv = new ModelAndView();
		mv.setViewName("zero.jsp");
		mv.addObject("z", k);
		
		
//		return model view object		
		return mv;
	}
	

}
