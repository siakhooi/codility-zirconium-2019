package nsh.codility;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Zirconium2019A implements Zirconium2019Interface {

	class Node {
		int a, b, d;

		public Node(int a, int b, int d) {
			this.a = a;
			this.b = b;
			this.d = d;
		}
	}

	public int solution(int[] A, int[] B, int F) {
		int N = A.length;
		int G = N - F;
		int R = 0;
		if (F == 0)
			return IntStream.of(B).sum();
		if (G == 0)
			return IntStream.of(A).sum();

		Node[] n = IntStream.range(0, N).mapToObj(i -> new Node(A[i], B[i], Math.abs(A[i] - B[i])))
				.sorted(new Comparator<Node>() {

					@Override
					public int compare(Node o1, Node o2) {
						if (o1.d != o2.d)
							return o2.d - o1.d;
						int M1 = Math.max(o1.a, o1.b);
						int M2 = Math.max(o2.a, o2.b);
						if (M1 != M2)
							return M2 - M1;
						int m1 = Math.min(o1.a, o1.b);
						int m2 = Math.min(o2.a, o2.b);
						return m2 - m1;
					}
				}).toArray(Node[]::new);

		int m = 0;
		while (G > 0 && F > 0) {
			Node x = n[m++];
			if (x.a >= x.b) {
				F--;
				R += x.a;
			} else {
				G--;
				R += x.b;
			}
		}
		if (F > 0)
			for (int i = m; i < N; i++)
				R += n[i].a;
		else if (G > 0)
			for (int i = m; i < N; i++)
				R += n[i].b;
		return R;
	}
}
