
public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+shift+L 단축키 전체 목록보기 						
		// ctrl+,-폰트 확대 축소
		// ctrl+D 한 줄 삭제
		// ctrl+Z 한 줄 삭제한거 복구
		// ctrl+alt+Shift+down 행단위 복사 
		// alt+shift+A 멀티컬럼 편집
		// alt+up, down 행단위 이동
		// ctrl + i 자동 들여쓰기
		// ctrl+/ 주석(토글) -> 한글 주석
		/* 여러글 주석 */ 
		// ctrl+space 자동완성 sop 하고 누르면 아래처럼 됨
		/* 1. 변수의 타입 
		  (1) 변수의 타입은 저장할 값의 타입에 의해 결정된다.
		  (2) 저장할 값의 타입과 일치하는 타입으로 변수를 선언한다. 
		   - int 정수타입 ex) int age = 25;
		   - char 문자타입 ex) char ch = '가';
		   - double 실수타입 ex) double pi = 3.14; */ 
		/* 2. 값의 타입
		 값 = 1. 문자 2. 숫자 3. 논리
		 1. 문자 -> char
		 2. 숫자
		 2-1. 정수 ex) 0, 25, -100 -> byte, short, int, long
		 2-2. 실수 ex) 3.14, -0.1 -> float, double
		 3. 논리 -> boolean (ture, false)
		 */
		int x = 4, y= 2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}

}
