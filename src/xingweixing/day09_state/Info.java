package xingweixing.day09_state;
/**
 * 状态模式（state）
 * 
 * 一、场景：
 *     电梯的运行：维修、正常、自动关门、自动开门、向上运行、向下运行、消防状态
 *     红绿灯：红灯、黄灯、绿灯
 *     网上购物：下单、已付款、已发货、送货中、已收货
 *     
 * 二、核心：用于解决系统中复杂对象的状态转换以及不同状态下行为的封装问题
 * 
 * 三、结构：
 *     --Context环境类：
 *                    环境类中维护一个state对象，他是定义了当前的状态
 *           
 *     --State抽象状态类：
 *     
 *     --ConcreteState具体状态类：
 *                              每一个类封装了一个状态对应的行为
 *                              
 * 四、开发中常见的场景：
 *                     银行系统中账号状态的管理
 *                     OA系统中公文状态的管理
 *                     酒店系统中房间状态的管理
 *                     线程对象个状态之间的切换
 * @author HY
 *
 */
public class Info {

}
