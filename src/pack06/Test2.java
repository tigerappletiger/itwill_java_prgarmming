package pack06;

public class Test2 {

	public static void main(String[] args) {

		Book book1=new Book("ȫ�浿��","���",1000,500);
//		Book book1;
//		book1 = new Book("ȫ�浿��","���",1000,500);
//		book1.author = "���";
//		book1.title = "ȫ�浿��";
//		book1.price = 10000;
//		book1.stockNum = 10;
		//System.out.println(book1.author+" "+book1.title+" "+book1.price);
		book1.printInfo();
		System.out.println(book1.stockNumber(3));

		Book book2 = new Book("ȫ�浿��","���",1000,500);
//		book2.author = "������";
//		book2.title = "�����ϱ�";
//		book2.price = 15000;
//		book2.stockNum = 30;
		//System.out.println(book2.author+" "+book2.title+" "+book2.price);
		book2.printInfo();


	}

}