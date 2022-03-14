
public class Chapter08 {

	public static void main(String[] args) {
		// while文
		int num = 1;
		while (1 <= num && num < 5 ) {
			num *= 2;
			System.out.println(num);
		}

		// for文
		int[] array = {0, 1, 2, 3};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 拡張for文
		for (int val : array) {
            if (val % 2 == 0) { // 偶数の場合、処理をスキップ
                continue;
            }
            System.out.println(val);
        }
	}
}
