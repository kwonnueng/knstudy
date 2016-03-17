package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	Guest[] guests;
	int size;
	//자바는 통채로읽어서 메모리에 변수부터 할당하고그다음 생성자 호출한다. 
	//동적배열
	public Game(int num){
		guests=new Guest[num];
	}
	public void receipt(Guest g){
		guests[size]=g;
		size++;
	}
	//
	public void process(char c){
		if(size==0){
			System.err.println("더 이상 없 습니다");
			//System.out.println();
		return ;
		}
		
		if(c=='r'){
		Guest[] b=new Guest[size-1]; 
		for(int i=0;i<size-1;i++){
			b[i]=guests[i];			
			//for문안에서 만들면 안된다 
			//배열은 heap메모리에할당하고 new로 생성하고 객체하고 그생성한 주소를 stack메모리에 넘겨준다
		}
		guests=b;
		size--;
	}
	
		if(c=='l'){
		Guest[] b =new Guest[size-1];
		for(int i=1;i<size;i++){
			b[i-1]=guests[i];
			
		}
		guests=b;
		size--;
	}
	
	
	
	
	
	
	
	
	
	
	 public void receipt2(Guest g){

		String name ="";
		int number=0;
		System.out.println("숫자입력");
		//1.숫자입력받기
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		sc.nextLine();
		//2.숫자만큼의 길이를 갖는 배열생성
		//int[] long[] Geust[] 
		//ArrayList< > 제네릭은 object만 그하위클래스 
		//자바의 클래스 상위클래스는 Object 
		//eextexns Object가 생략
		//단순히 들어오는 타입만 다르다
		
		//의사코드 수도코드 psuedo 코드
		
		
		
		
		
		
		
		
		
		
		
		
		name=sc.nextLine();
		Guest gName= new Guest(name);
		String getName=g.getName();
		//String setName=g.setName();
		//ArrayList<Guest> guest = new ArrayList<Guest>();
		//guest.add(gName);
		
	}

	 }

	}
