package xingweixing.day08_templateMethod;
/**
 * 模板方法模式（templateMethod）
 * 
 * 一、场景：客户到银行办理业务
 *       1）取号排队
 *       2）办理具体现金/转账/企业/个人/理财业务
 *       3）给银行工作人员评分
 *       
 * 二、模板方法介绍：
 *             模板方法是编程中常用到的模式，他定义了一个操作中的算法骨架，将这些
 *             步骤延延迟到子类中实现。这样，新的子类可以在不改变一个算法结构的前
 *             提下重新定义该算法的某些特定步骤。
 *             
 * 三、核心：处理某个流程的代码都具备，但是其中某个节点的代码暂时不能确定。
 *       因此，我们采用工厂方法模式，将这个节点的代码实现转移给子类完成。
 *       即：处理步骤父类中定义好，具体实现延迟到子类中定义。
 *       
 * 四、什么时候用到模板方法模式：
 *                         实现一个简单的算法时，整体的步骤很稳定。但是，某些部分容易变。
 *                         易变部分可以抽象出来，供子类实现。
 *                         
 * 五、开发中常见的场景：
 *                     1）数据库访问的封装
 *                     2）junit单元测试
 *                     3）servlet中关于doGet()/doPost()方法调用
 *                     4）Hibernate中模板程序
 *                     5）Spring中jdbcTemplate|HibernateTemplate等
 *       
 * @author HY
 *
 */
public class Info {

}