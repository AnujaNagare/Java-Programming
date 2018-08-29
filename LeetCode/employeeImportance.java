import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
	int EmployeeId;
	int importanceValue;
	List<Integer> subordinateIds = new ArrayList<>();
}

public class employeeImportance {
	static Map<Integer, Employee> emap;

	public static int getImportance(List<Employee> employees, int id) {

		emap = new HashMap();
		for (Employee e: employees) emap.put(e.EmployeeId, e);
		return dfs(id);
	}
	public static int dfs(int eid) {
		Employee employee = emap.get(eid);
		int ans = employee.importanceValue;
		for (Integer subid: employee.subordinateIds)
			ans += dfs(subid);
		return ans;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee0 = new Employee();
		employee0.EmployeeId = 1;
		employee0.importanceValue = 5;
		employee0.subordinateIds = new ArrayList<>(Arrays.asList(2,3));

		Employee employee1 = new Employee();
		employee1.EmployeeId = 2;
		employee1.importanceValue = 3;
		employee1.subordinateIds = new ArrayList<>(Arrays.asList());

		Employee employee2 = new Employee();
		employee2.EmployeeId = 3;
		employee2.importanceValue = 3;
		employee2.subordinateIds = new ArrayList<>(Arrays.asList());

		//				test caese 2 : [[101,3,[]],[2,5,[101]]]
		//		Employee employee0 = new Employee();
		//		employee0.EmployeeId = 101;
		//		employee0.importanceValue = 3;
		//		employee0.subordinateIds = new ArrayList<>(Arrays.asList());
		//
		//		Employee employee1 = new Employee();
		//		employee1.EmployeeId = 2;
		//		employee1.importanceValue = 5;
		//		employee1.subordinateIds = new ArrayList<>(Arrays.asList(101));


		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee0);
		employeeList.add(employee1);
		employeeList.add(employee2);

		Integer employeeID = 1;
		Integer outImportanceValue = getImportance(employeeList, employeeID);

		System.out.println(outImportanceValue);
	}//main


}//employeeImportance
