package Score_Package;


public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(); //객체 생성
	
		int err = student.setScore(); 
		//만약 여기서 에러처리를 한다면 
		//수치에따라 메세지를 출력할것이다.
		if(err !=-1) {
		student.getTotScore(); //총점처리
		student.getAvgScore(); //평균처리
		student.putScore(); //점수출력
		; // 점수 셋팅
		}
		
	}

}


/*
내가한것 

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.set_Score("김성수", 90, 80, 75);
		student.get_Score();


	}

}

*/
