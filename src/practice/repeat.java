package practice;

import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		/* ctrl + shift + f �� ���߱� ����Ű
		 * alt + t �� ������ refactor �� �̿��ؼ� �̸� �ѹ��� �ٲٴ� ����Ű
		 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		 * 
		 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������
		 * ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
		 * 
		 * �Է� ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
		 * 
		 * ��� ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();

		if (e % 4 == 0) {
			if (e % 400 == 0)
				System.out.println(1);
			else if (e % 100 == 0)
				System.out.println(0);
			else
				System.out.println(1);
		} else
			System.out.println(0);
	}
}
