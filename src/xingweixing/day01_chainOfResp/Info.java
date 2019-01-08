package xingweixing.day01_chainOfResp;
/**
 * 责任链模式（chain of responsibility）
 * 
 * 定义：将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传递，
 *       链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能则传递给链上的下一个对象。
 *       
 * 场景：
 *     --打牌时，轮流出牌
 *     --接力赛跑
 *     --大学中，奖学金审批
 *     --公司中，公文审批
 *     
 * 开发中常见的场景：
 *     --java中，异常处理机制就是一种责任链模式。一个try可以对应多个catch,
 *       当第一个catch不匹配类型，则自动跳到第二个catch。
 *     
 *     --javascript语言中，事件的冒泡和捕获机制。java语言中，事件的处理采用观察者模式。
 *     
 *     --Servlet开发中，过滤器采用的就是链式处理
 *     
 *     --Struts2中，拦截器的调用也是典型的责任链模式
 *     
 *     
 * @author HY
 *
 */
public class Info {

}
