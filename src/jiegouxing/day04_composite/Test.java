package jiegouxing.day04_composite;

public class Test {
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("我的收藏");
		f2 = new ImageFile("林允儿.jpg");
		f3 = new TextFile("林允儿日记.txt");
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("电影");
		f4 = new VideoFile("野蛮女友.avi");
		f5 = new VideoFile("战狼.avi");
		f11.add(f4);
		f11.add(f5);
		
		f1.add(f11);
		
//		f2.killVirus();
		
		f1.killVirus();
	}
}
