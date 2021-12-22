
public class VarEx3 {

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
//        ctrl + / 전체 줄 토글
		/* 5. 변수, 상수, 리터럴
		   - 변수(variable) : 하나의 값을 저장하기 위한 공간 
		     ex) int score = 100; 
		             score = 200;
		   - 상수(constant) : 한 번만 값을 저장 가능한 변수, 한 번 저장하면 바꿀 수 없음 
		     ex) final int MAX = 100; // MAX는 상수
		         		   MAX = 200; // 에러
		   - 리터럴(literal) : 그 자체로 값을 의미하는 것 (= 기존의 상수)
		     위의 100, 200, 100, 200은 리터럴,
		     score은 변수
		     MAX는 상수라고 보면 된다. 
		 */
		final int score = 100;
		System.out.println(score);
	}
}
