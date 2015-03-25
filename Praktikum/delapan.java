class delapan{
	public static void main(String[] args) {
		int i,b=11;
		for (i=1;i<=20;i++) {
			System.out.print(i+" ");

			 if (i==b) {
			 	System.out.print("\n");
			 	b=b+11;
			 }

			if(i%5==0){
				System.out.print("JONI ");
			}
		}
	}
}