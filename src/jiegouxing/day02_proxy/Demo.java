package jiegouxing.day02_proxy;
/**
 * 代理模式（非常重要！！！）：
 * 
 * 一、核心作用：
 * 		   --通过代理，控制对对象的访问
 *           可以详细控制对某个（某类）对象的方法，在调用这个方法前做前置处理，
 *           调用这个方法后做后置处理。（即AOP的微观实现）
 *           
 * 二、案例:
 *     1、面谈
 *     2、起草合同
 *     3、签字，收预付款
 *     4、安排机票
 *     5、唱歌-------------------------核心业务
 *     6、收尾款
 *     
 *     
 *     1、面谈
 *     2、起草合同
 *     3、签字，收预付款
 *     4、安排机票
 *     5、安排唱歌-------------------------这里是核心业务，可安排不同的人来唱歌
 *     6、收尾款
 *     
 * 三、代理模式：
 * 		   --核心角色：
 * 			         --抽象角色：定义代理角色和真实角色的公共对外方法。
 * 
 * 					 --真实角色：
 * 								--实现抽象角色，定义真实角色所要实现的业务逻辑，供代理角色调用
 * 
 * 								--关注真正的业务逻辑！！！
 * 					 --代理角色：
 * 								--实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来
 * 								  实现抽象方法，并可以附加自己的操作。
 * 									
 * 								--将统一的流程控制放到代理角色中处理！！！
 * 
 * 四、应用场景：
 * 			   --安全代理：屏蔽对真实角色的直接访问
 * 			   --远程代理：通过代理类处理远程方法调用（RMI）
 * 			   --延时加载：先加载轻量级的代理对象，真正需要再加载真实对象。
 * 
 * 五、分类：
 * 		   --静态代理：静态定义代理类
 * 		   --动态代理：动态生成代理类
 * 
 * 		   JDK自带的动态代理
 * 		   javaassist字节码操作库实现
 *         CGLIB
 *         ASM（底层使用指令，维护性较差）
 * 									
 * @author HY
 *
 */
public class Demo {

}