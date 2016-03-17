package test;

import java.util.Scanner;

public class InputModule {
	//srp 단일책임원칙 객체지향
	
	
	public Guest[] input(int num){
		Guest[] a = new Guest[num];
		for(int i=0;i<num;i++){
			
			Scanner sc=new Scanner(System.in);
			String name;
			name=sc.nextLine();//엔터까지받는다 nextLine은 int는 엔터전까지
			a[i]=new Guest(name);
		}
	return a;
	}
}

//게스트배열을 Guest[]a =input()
for(g ; a){
	game.receipt();
}
for(G;a){
gaem.process()	
}
}