package Application;

public class RevertionString {
	public static void main(String[] args) {
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Chery", "Hyundai", "Volkswagen", "Chevrolet"};
		int sizeCars = cars.length;
		String[] revert = new String[sizeCars];
		int sizeCarsZeroBased = sizeCars - 1;

		for (int i = 0; i < sizeCars; i++) {

			revert[i] = cars[sizeCarsZeroBased - i];
			System.out.println(revert[i]);

		}

	}


}
