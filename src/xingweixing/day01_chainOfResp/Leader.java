package xingweixing.day01_chainOfResp;
/**
 * 抽象类
 * 
 * @author HY
 *
 */
public abstract class Leader {
	protected String name;
	
	protected Leader nextLeader;

	public Leader(String name) {
		super();
		this.name = name;
	}

	public Leader getNextLeader() {
		return nextLeader;
	}

	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void  handleRequest(LeaveRequest request);
}
