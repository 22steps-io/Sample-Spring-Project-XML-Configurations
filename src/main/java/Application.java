import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sidda.service.EmployeeService;

public class Application {

	public static void main(String[] args) {
	//	EmployeeService employeeService = new EmployeeServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);
		System.out.println("Data after wiring : "+employeeService.findAll().get(0).getFirstName());

	}

}
