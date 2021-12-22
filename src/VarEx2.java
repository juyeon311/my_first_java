
public class VarEx2 {

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
		/* 2. 값의 타입
		 값 = 1. 문자 2. 숫자 3. 논리
		 1. 문자 -> char
		 2. 숫자
		 2-1. 정수 ex) 0, 25, -100 -> byte, short, int, long
		 2-2. 실수 ex) 3.14, -0.1 -> float, double
		 3. 논리 -> boolean (ture, false)
		 */
	
		int x = 4, y= 2;
		int tmp;
		
		tmp = x; // 1. x의 값을 tmp에 저장
		x = y;   // 2. y의 값을 x에 저장
		y = tmp; // 3. tmp의 값을 y에 저장
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
