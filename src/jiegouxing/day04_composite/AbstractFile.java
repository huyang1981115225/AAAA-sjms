package jiegouxing.day04_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式，模拟杀毒软件架构设计
 * 
 * @author HY
 * 
 */

// 抽象构件角色
public interface AbstractFile {
	void killVirus();// 杀毒
}

/**
 * 查杀图像文件
 * 
 * @author HY
 * 
 */
class ImageFile implements AbstractFile {

	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("--图像文件:  " + name + ",进行查杀！");
	}
}

/**
 * 查杀文本文件
 * 
 * @author HY
 * 
 */
class TextFile implements AbstractFile {

	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("--文本文件:  " + name + ",进行查杀！");
	}
}

/**
 * 查杀视频文件
 * 
 * @author HY
 * 
 */
class VideoFile implements AbstractFile {

	private String name;

	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("--视频文件:  " + name + ",进行查杀！");
	}
}

class Folder implements AbstractFile {

	private String name;

	public Folder(String name) {
		super();
		this.name = name;
	}

	// 定义容器，用来存放本容器下构建的子节点
	private List<AbstractFile> list = new ArrayList<AbstractFile>();

	public void add(AbstractFile file) {
		list.add(file);
	}

	public void remove(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile getChild(int index) {
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("--文件夹:  ");
		for (AbstractFile file : list) {
			file.killVirus();
		}
	}
}
