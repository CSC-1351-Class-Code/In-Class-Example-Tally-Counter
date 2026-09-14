package Counter;

public class CounterRunner {
	public static void main(String[] args){

		__ ctr1 = new __();
		__ ctr2 = new __();

		// Show that the counters start the same
		ctr1.__();
		ctr2.__();
		System.out.println("====================================");

		for(int i = 0; i < 10; i++){
			// We increment the counters at different points
			// ctr1 is incremented every time
			// ctr2 is incremented every 3 passes of the loop
			ctr1.__();
			if(i%3==0){
				ctr2.__();
			}

			// show they are updating differently
			System.out.printf("Run %d :\n", i+1);
			ctr1.__();
			ctr2.__();
			System.out.println("====================================");

		}

		// Show that the reset only affects the instance that called it
		ctr1.__();
		ctr1.__();
		ctr2.__();
		System.out.println("====================================");
	}
}
