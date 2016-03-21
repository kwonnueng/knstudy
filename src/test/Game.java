package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	Guest[] guests;
	int size=0;

	public Game(int num){
		guests=new Guest[num];
	}
	public void receipt(Guest g){
		guests[size]=g;
		size++;
		//사이즈에 맞춰서 guest배열안에 이름을 차곡차곡 넣는다
	}
	//
	public void process(char c) throws InvalidDirectionException{
		if(size==0){
			System.err.println("더 이상 없 습니다");
			//System.out.println();
			return ;
		}

		else if(c=='r'){
			Guest[] b=new Guest[size-1]; 
			System.out.println("뺄애는: "+guests[size-1].getName());
			for(int i=0;i<size-1;i++){
				b[i]=guests[i];			
				//for문안에서 만들면 안된다 
				//배열은 heap메모리에할당하고 new로 생성하고 객체하고 그생성한 주소를 stack메모리에 넘겨준다
				System.out.println("남아있는애는: "+b[i].getName());
			}
			guests=b;
			size--;
		}

		else if(c=='l'){
			Guest[] b =new Guest[size-1];
			System.out.println("뺄애는: "+guests[0].getName());
			for(int i=1;i<size;i++){
				b[i-1]=guests[i];
				System.out.println("남아있는애는: "+b[i-1].getName());
			}
			guests=b;
			size--;
		}
		else{
			String reason=c+"는적절한 문자가 아니다";
			InvalidDirectionException e = new InvalidDirectionException(reason);
			throw e;
		}
		
	}
}













