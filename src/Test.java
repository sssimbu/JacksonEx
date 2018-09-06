
public class Test {

	public static void main(String[] args)
	{
		Employee obj= new Employee();
		obj.setName("silambarasan");
		obj.setEmpid(100);
		obj.setMobile(8438971);
		obj.setSalary(50000);
		obj.setCity("chennai");
		
		String jsondata=Utility.JavatoJson(obj);
		System.out.println("json data:"+jsondata);
	
	System.out.println("===========================");
	Employee emp1=Utility.JsontoJava(jsondata, Employee.class);
	System.out.println("name:"+emp1.getName()+"Empid:"+emp1.getEmpid()+"Mobile:"+emp1.getMobile()+"Salary:"+emp1.getSalary()+"City:"+emp1.getCity());
		
	
	}
	
	
	
}
