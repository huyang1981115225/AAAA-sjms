package xingweixing.day01_chainOfResp;

/**
 * 总经理
 * 
 * @author HY
 *
 */
public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println(
					"员工：" + request.getName() + "请假，天数：" + request.getLeaveDays() + ",理由：" + request.getReason());
			System.out.println("总经理：" + this.name + ",审批通过！");
		} else {
			System.out.println("莫非" + request.getName() + "想辞职，居然请假" + request.getLeaveDays() + "天！");
		}
	}

}
