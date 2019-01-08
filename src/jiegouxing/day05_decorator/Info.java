package jiegouxing.day05_decorator;
/**
 * 装饰模式(decorator)：
 * 
 * 一、职责：
 *     --动态的为一个对象增加新的功能
 *     --装饰模式是一种用于代替继承的技术，无需通过继承增加子类就可以扩展对象的新功能。
 *       使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速膨胀。
 *       
 * 二、实现细节：
 *         --Component抽象构件角色：
 *                                真实对象和装饰对象有相同的接口。这样，客户端对象就能够
 *                                以与真实对象相同的方式同装饰对象交互。
 *                                
 *         --ConcreteComponent具体构件角色(真实对象)：
 *                                                  io流中的FileInputStream、FileOutputStream
 *         
 *         --Decorate装饰角色：
 *                           持有这样一个抽象构件的引用。装饰对象接受所有客户端的请求，并把这些
 *                           请求抓发给真实的对象。这样，就能在真实对象调用前后增加新的功能。
 *         
 *         --ConcreteDecorator具体装饰角色：
 *                                        负责给构件对象增加新的责任。
 *                                        
 * 三、开发中使用的场景：
 *                 --IO中输入流和输出流的设计
 *                 
 *                 --Swing包中图形界面构件功能
 *                 
 *                 --Servlet API中提供了一个request对象的Decorator设计模式的默认实现类HttpServletRequestWrapper,
 *                   增强了request对象的功能
 *                 
 *                 --Strust2中，request,response,session对象的处理
 *                 
 * 四、IO流实现细节：
 *                 --Component抽象构件角色：
 *                                        io流中的InputStream、OutputStream、Reader、Writer
 *                                        
 *                 --ConcreeteComponent具体构件角色：
 *                                                 io流中的FileInputStream、FileOutputStream
 *                                                 
 *                 --Decorator装饰角色：
 *                                    持有一个抽象构件的引用：io流中的FilterInputStream、FilterOutputStream
 *                                    
 *                 --ConcreteDecorator具体装饰角色：
 *                                                负责给构件对象增加新的责任。io流中的BufferedOutputStream、BufferedInputStream等。
 *                                                
 * 五、总结：
 * 			1）装饰模式(Decorator)也叫包装器模式(Wrapper)
 *          2）装饰模式降低系统的耦合度，可以动态的增加或删除对象的职责，并使得需要装饰的具体构建类和具体装饰类可以独立变化，
 *             以便增加新的具体构建类和具体装饰类。
 * 
 * 六、优点：
 *          1）扩展对象功能，比继承灵活，不会导致类个数急剧增加
 *          2）可以对一个对象进行多次装饰，创造出不同行为的组合，得到功能更加强大的对象。
 *          3）具体构建类和具体装饰类可以独立变化，用户可以根据需要自己增加新的具体构件子类和具体装饰子类。
 *          
 * 七、缺点：
 *          1）产生很多小对象。大量小对象占据内存，一定程度上影响性能。
 *          2）装饰模式易于出错，调试排查比较麻烦。
 *          
 *  八、装饰模式和桥接模式的区别：
 *                              两个模式都是为了解决过多子类对象的问题。但他们的诱因不同。
 *                              桥接模式是对象自身实有机制沿着多个维度变化，是既有部分不稳定。
 *                              装实模式是为了增加新功能。
 *                    
 * @author HY
 *
 */
public class Info {

}
