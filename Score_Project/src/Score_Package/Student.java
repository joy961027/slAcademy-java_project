package Score_Package;

import java.util.Scanner;

public class Student {

//	=============데이터구역=============
//	아래의 모든 정보들을 초기화(innitializing) 해준다. 
//	정수는 0, 실수는 0.00f, 글자는 ""
//	이름(String) 국어(int) 영어(int) 수학(int) 총점(int) 평균(float)
	private String sName;
	private int sKor, sEng, sMat, sTot;
	private float sAvg;

//  =============메소드 구역=============

	//셋터(데이터 셋팅한다)
	/*
	public void setScore(int k, int e, int m) 
	{
		sName = "";
		sKor = k;
		sEng = e;
		sMat = m;
	}
	*/
	//셋터(데이터 셋팅한다)
	//새로운 setScore 메소드가 피룡함(사용자 입력버전)
	//3개의 점수를 사용자로부터 입력받아서 저장해준다.
	//에러처리해야함.(데이터가 정사적인지 판단해야함)
	//음수(-)가 입력되었다면 에러메시지를 출력하고 중단되어야함.
	public int setScore() {
		
		try {
		Scanner input = new Scanner(System.in);
		System.out.print("국어 점수를 입력해주세요 : ");
		int k= input.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int e = input.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int m = input.nextInt();
		if((k<0) || (e<0) || (m<0)) {
			System.out.println("음수가 입력되었습니다!");
			return (-1); //메소드를 중단하고 빠져나간다.
			
		}
		sKor=k; sEng =e; sMat =m; 
		}catch(Exception e) {
			System.out.print("숫자를 입력해주세요");
			return(-1);
		}
		
		

		return (0);
	}
		
	
	//겟터(데이터 반환한다.)
	public int getTotScore() {
		// 총점을 리턴해준다. 
		sTot= sKor + sEng + sMat;
		return sTot;
	}
	public float getAvgScore() {	
		// 총점을 리턴해준다.
		sAvg = sTot/3.0f;
		return sAvg;
	}
	//풋터(데이터를 출력한다)
	public void putScore() {
		System.out.println("국어:" + sKor + " 영어:" + sEng + " 수학:" + sMat);
		System.out.println("총점:" + sTot + " 평균:" + Math.round((sAvg)*100)/100.0f);
		
	}

}


/* 내가 한것
public class Student {
	//전처리
	String Name ="";
	int Kor=0;
	int Eng=0;
	int Math=0;
	int Sum=0;
	float Avg = 0.0f;
	
	void set_Score(String Name, int Kor, int Eng, int Math) {
		this.Name =Name;
		this.Kor = Kor;
		this.Eng = Eng;
		this.Math = Math;
		Sum = Kor + Eng + Math;
		Avg = (float)Sum/3.0f;
		
		
	}
	
	void get_Score() {
		System.out.println("이름은 " + Name + " 입니다");
		System.out.println("국어점수는 " + Kor + " 입니다");
		System.out.println("영어점수는 " + Eng + " 입니다");
		System.out.println("수학점수는 " + Math + " 입니다");
		System.out.println("총점수는 " + Sum + " 입니다");
		System.out.println("평군점수는 " + Avg + " 입니다");
	}
	
}
*/