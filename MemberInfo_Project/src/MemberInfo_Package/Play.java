package MemberInfo_Package;

import java.util.ArrayList;

public class Play {

	public static void main(String[] args) {
		/*
		//프로그램 코드 동작테스트(Play)
//		-Member 클래스로 객체생성
		Member m = new Member();
//		-생성된 객체이 회원정보저장
		m.setMemberInfo();
//		-저장된 정보들을 각각확인함. (get 계열의 메소드들을 이용해서 정보들을 반환받은후 출력)
//*********************나와의 차이점 리턴받은값을 임시저장해놓기
		String tmpName= m.getMemberName();
		String tmpId= m.getMemberId();
		String tmpPass= m.getMemberPass();
		String tmpPhone= m.getMemberPhone();
		System.out.println(tmpName +" "+ tmpId + " "+ tmpPass+ " "+ tmpPhone);
//		-저장된 정보들을 출력함
		m.putMemberInfo();
		*/
		
		//=============================================================================
		//객체 배열 
		//2명의 회원정보 객체를 생성한후 그것들을 객체배열에 저장해준다.(array)
		//객체배열(컨테이너)에 저장된것등릉 접근해서 정보저장/반환/출력해준다.
		//즉 2명의 회원정보가 처리되어야함.(반복문사용안함)
//		Member m1 = new Member();
//		Member m2 = new Member();
//		Member m3 = new Member();
//		Member[] m_box = new Member[3];
		
		/*
		m_box[0]=m1;
		m_box[0].setMemberInfo();
		String tmpName1= m_box[0].getMemberName();
		System.out.println("첫번째 멤버 : " + tmpName1);
		m_box[0].putMemberInfo();
		
//		-저장된 정보들을 출력함
		
		m_box[1]=m2;
		m_box[1].setMemberInfo();
		String tmpName2= m_box[1].getMemberName();
		System.out.println("두번째 멤버 : " + tmpName2);
		m_box[1].putMemberInfo();
		
		*/
		
		//반복문 사용===============================================
		/*
		String tmpName = null;
		m_box[0]=m1;
		m_box[1]=m2;
		m_box[2]=m3;
		for(int idx=0; idx<m_box.length; idx++) {
			m_box[idx].setMemberInfo();
			tmpName= m_box[idx].getMemberName();
			System.out.println("너의이름은 : " + tmpName);
			m_box[idx].putMemberInfo();
		}
		*/
		
		//===================================================
		//ArrayList
		
		/*
		ArrayList pitches = new ArrayList();
		pitches.add("138");//[0]
		pitches.add("129");//[1]
		pitches.add("142");//[2]
		
		System.out.println(pitches.get(0));
		System.out.println(pitches.remove(0));
		System.out.println(pitches.get(0));
		System.out.println(pitches.size());
		if(pitches.contains("142")) {
			System.out.println("ok");
		};
		pitches.clear();
		System.out.println(pitches.size());
		*/
		
		
		//============================================
		//우리가 만든 회원정보객체를 arrayList에 저장할수 있도록 코드를 작성해본다.
		ArrayList<Member> m = new ArrayList<Member>();
		Member m1 = new Member();
		Member m2 = new Member();
		m.add(m1);
		m.add(m2);	
		m.get(0).setMemberInfo(); //첫번째 회원의 정보를 셋팅한다.
		m.get(0).putMemberInfo(); //회원정보 출력
		m.get(1).setMemberInfo(); //첫번째 회원의 정보를 셋팅한다.
		m.get(1).putMemberInfo(); //회원정보 출력

		System.out.print(m.contains(m1));
		
	}// end of main

}//end of class

/*
내가한것

public class Play {

	public static void main(String[] args) {
		//프로그램 코드 동작테스트(Play)
//		-Member 클래스로 객체생성
		Member m = new Member();
//		-생성된 객체이 회원정보저장
		m.setMemberInfo();
//		-저장된 정보들을 각각확인함. (get 계열의 메소드들을 이용해서 정보들을 반환받은후 출력)
		System.out.println("회원 이름 : " + m.getMemberName());
		System.out.println("회원 아이디 : " + m.getMemberId());
		System.out.println("회원 비밀번호 : " + m.getMemberPass());
		System.out.println("회운핸드폰번호 : " + m.getMemberPhone());
//		-저장된 정보들을 출력함
		m.putMemberInfo();
		
	}

}
*/