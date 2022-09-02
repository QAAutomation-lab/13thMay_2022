package day18.predefinedclasses;

public class SystemArrayCopyExample1 {

	public static void main(String[] args) {
		String a[] = { "A", "B", "B", "H", "A", "M" }; // source array
		String b[] = { "S", "H", "U", "N", "U", "L", "L", "J", "A", "D", "O", "N" }; // destination array
		String src[], dest[];
		int srcPos, destPos, length;
		src = a;
		srcPos = 2;
		dest = b;
		destPos = 3;
		length = 4;
		System.out.print("Source array:");
		for (int i = 0; i < src.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print("Destination array:");
		for (int i = 0; i < src.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		System.out.println("Source Position:" + srcPos);
		System.out.println("Destination Position:" + destPos);
		System.out.println("Length:" + length);
		System.arraycopy(src, srcPos, dest, destPos, length); // use of arraycopy() method
		System.out.println("Destination array after use of arraycopy()");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

}