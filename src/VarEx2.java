
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+shift+L ����Ű ��ü ��Ϻ��� 						
		// ctrl+,-��Ʈ Ȯ�� ���
		// ctrl+D �� �� ����
		// ctrl+Z �� �� �����Ѱ� ����
		// ctrl+alt+Shift+down ����� ���� 
		// alt+shift+A ��Ƽ�÷� ����
		// alt+up, down ����� �̵�
		// ctrl + i �ڵ� �鿩����
		// ctrl+/ �ּ�(���) -> �ѱ� �ּ�
		/* ������ �ּ� */ 
		// ctrl+space �ڵ��ϼ� sop �ϰ� ������ �Ʒ�ó�� ��
		/* 2. ���� Ÿ��
		 �� = 1. ���� 2. ���� 3. ��
		 1. ���� -> char
		 2. ����
		 2-1. ���� ex) 0, 25, -100 -> byte, short, int, long
		 2-2. �Ǽ� ex) 3.14, -0.1 -> float, double
		 3. �� -> boolean (ture, false)
		 */
	
		int x = 4, y= 2;
		int tmp;
		
		tmp = x; // 1. x�� ���� tmp�� ����
		x = y;   // 2. y�� ���� x�� ����
		y = tmp; // 3. tmp�� ���� y�� ����
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
