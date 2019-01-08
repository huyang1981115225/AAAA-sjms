package xingweixing.day01_chainOfResp;
/**
 * 模拟主任
 * 
 * @author HY
 *
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}
	
	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() <3) {
			System.out.println("员工:  "+request.getName()+"请假，天数:  "+request.getLeaveDays()
					+"理由:  "+request.getReason());
			System.out.println("主任:  "+this.name+",审批通过。");
		}else {
			if (this.nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}
}
