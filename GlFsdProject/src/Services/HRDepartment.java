package Services;

public class HRDepartment extends SuperDepartment {
		
	public String departmentName () {
		String deptName = "HR Department";
		return deptName;
	}
		
		public String getTodayWork() {
			String getWork = "Fill today’s timesheet and mark your attendance ";
			return getWork;
		}
		
		public String getWorkDeadline() {
			String getDeadLine = "Complete by EOD ";
			return getDeadLine;
		}
		
		public String doActivity() {
			String doAct = "team Lunch ";
			return doAct;
		}                
		
}