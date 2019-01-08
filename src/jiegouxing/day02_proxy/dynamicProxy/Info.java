package jiegouxing.day02_proxy.dynamicProxy;
/**
 * 动态代理相比于静态代理的优点：
 * 							  抽象角色中（接口）申明的所有方法都被转移到调用处理器一个
 * 							  集中的方法中处理，这样我们可以更加灵活和统一的处理众多的方法。
 * 
 * JDK自带的动态代理：
 * 					--java.lang.raflect.Proxy
 * 								作用：动态生成代理类和代对象
 * 
 * 					--java.lang.reflect.InvocationHandler（处理器接口）
 * 								可以通过invoke()方法来实现对真实角色的代理访问
 * 								每次通过Proxy生成代理对象时都要指定对应的处理器接口
 * 
 * 开发框架中的应用场景：
 * 					   --struts2中拦截器的实现
 *                     --数据库中连接池关闭处理
 *                     --Hibernate中延时加载实现
 *                     --Mybatis中实现拦截器插件
 *                     --Spring中AOP实现：日志拦截、申明式事务处理
 *                     --web service
 * @author HY
 *
 */
public class Info {

}
