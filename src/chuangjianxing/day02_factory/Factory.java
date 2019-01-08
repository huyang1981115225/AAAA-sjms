package chuangjianxing.day02_factory;
/**
 * 工厂模式：
 * 		实现了创建者和调用者的分离
 * 
 * 1、详细分类：
 * 		1）简单工厂模式：
 * 		              用来生产同一等级结构中的任意产品。（对于增加新的产品，需要修改已有的代码） 
 * 		2）工厂方法模式：
 * 					  用来生产同一等级结构中的固定产品。
 * 		3）抽象工厂模式：
 * 					  用来生产不同产品族的全部产品。（对于新增的产品，无能为力；支持增加产品族）
 * 
 * 2、面相对象设计的基本原则
 * 		1）OCP（开闭原则,Open-Closed-Principle）:一个软件的实体应当对扩展开放，对修改关闭
 * 		2）DIP（依赖倒转原则，Dependence Inversion Principle）：要针对接口编程，不要针对实现编程
 * 		3）LOD（迪米特法则，Law of Demeter）：只与你直接的朋友通信，而避免和陌生人通信。
 * 
 * 3、核心本质：
 * 		1）实例化对象，用工厂方法代替new操作
 * 		2）将选择实现类、创建对象统一管理和控制，从而将调用者和我们实现类解耦
 * 
 * 4、要点：
 *		 --简单工厂模式（静态工厂模式）：
 *		 							  虽然某种程度不符合设计原则，但实际使用最多。
 *		 							  
 *		 --工厂方法模式：
 *		 			   不修改已有类的前提下，通过增加新的工厂类来实现扩展。
 *		 			   
 *		 --抽象工厂模式：
 *		               不可以增加产品，但是可以增加产品族。
 * @author HY
 *
 */
public class Factory {

}
