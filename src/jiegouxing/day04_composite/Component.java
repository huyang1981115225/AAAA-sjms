package jiegouxing.day04_composite;

/**
 * 抽象构件角色
 * 
 * @author HY
 * 
 */
public interface Component {
	void operation();
}

// 叶子构件角色
interface Leaf extends Component {

}

// 容器构件角色，可以定义增删改查的方法
interface Composite extends Component {
	void add(Component c);

	void remove(Component c);

	Component getChild(int index);
}
