package test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		int number=0;
		String name="";

		InputModule ip =new InputModule();
		/*	Game game =new Game(number);
		몇명 받을건지 그수만큼 배열 만들기
		input.input(number);

		정한 사람수만큼 이름이 저장된 배열이 생성 된다
		System.out.println("이름넣으세요");
		name=sc.nextLine();


		 Guest guestName = new Guest(name);
		game.receipt(guestName);
		이름까지 저장된 상태 
		char c;
		System.out.println("char형 받기");
		c=(char)System.in.read();

		game.process(c);
		 */
		//카멜케이스 변수

		int num=ip.getNum();
		Guest[] guests=ip.input(num);
		Game game=new Game(num);

		for(Guest guest:guests){
			game.receipt(guest);
		}
		for(int i =0; i<num; i++){
			game.process(ip.direction());
		}

	}



}


