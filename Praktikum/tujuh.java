class tujuh{
	public static void main(String[] args) {
		int i,b=11;
		for (i=1;i<=110;i++) {
			System.out.print(i+" ");

			if (i==b) {
				System.out.print("\n");
				b=b+11;
			}
		}
	}
}