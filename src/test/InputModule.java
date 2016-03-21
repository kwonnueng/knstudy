package test;

import java.io.IOException;
import java.util.Scanner;

public class InputModule {
	//srp 단일책임원칙 객체지향

	public int getNum(){
		Scanner sc=new Scanner(System.in);
		//자바는 C처럼 미리 int num;을 만들피료없다
		//선언한 즉시 stack에
		//컴파일할때 에러잡는 코드가 좋다
		//Runtime에러라는건 값이 변할때 컴파일에러는 아니더라
		//Logical에러 내가 기대했던
		//가장최소의범위에다 선언하라
		//들여쓰기 확실히하기
		//변수이름은 확실하게
		System.out.println("몇명인지?");
		int num=sc.nextInt();
		sc.nextLine();
		return num;
	}

	public Guest[] input(int num) throws IOException{
		Guest[] a = new Guest[num];
		for(int i=0;i<num;i++){

			Scanner sc=new Scanner(System.in);
			String name;
			System.out.println("이름입력하세요");
			name=sc.nextLine();//엔터까지받는다 nextLine은 int는 엔터전까지
			a[i]=new Guest(name);
		}

		/*	
		Game game =new Game(num);
		for(Guest guest :a){
			game.receipt(guest);
			//receipt를 쓰려면 그러면 객체 생성
			//그럼 다시 배열이 다시만들어짐
			//받는인자가 Geust타입 g
			//	Guest g = new Guest();그냥 기본초기화 생성자는 요구사항에없다 Guest생성할수도없다
			//돌면서 이름이 저장된 Guest 근데 call by value?
		}
			System.out.println("char형 입력");
			char c;
			c=(char)System.in.read();
			for(Guest guest : a){
			game.process(c);


		}*/

		return a;
	}
	public char direction(){
		Scanner sc=new Scanner(System.in);
		System.out.println("방향입력하세요");
		String dir= sc.nextLine();
		// dir.charAt(0);
		// return sc.nextLine(); 자체가 return은 String이니깐
		return dir.charAt(0);
	}


}
