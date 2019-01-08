package jiegouxing.day07_flyweight;
/**
 * 享元工厂类
 * 
 */
import java.util.HashMap;
import java.util.Map;


public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color){
		if (map.get(color) != null) {
			return map.get(color);
		}else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}
}
