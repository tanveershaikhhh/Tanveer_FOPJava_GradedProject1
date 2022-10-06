package Services;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName () {
		String deptName = "Admin Department";
		return deptName;
	}
	
	public String getTodayWork() {
		String getWork = "Complete your documents Submission ";
		return getWork;
	}
	
	public String getWorkDeadline() {
		String getDeadLine = "Complete by EOD ";
		return getDeadLine;
	}
}

	
