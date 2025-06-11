
public class UserInterface {
	    public static CarInfo extractDetails(String carDetails) {
	        if (carDetails == null || carDetails.isEmpty()) {
	            return null;
	        }

	        String[] parts = carDetails.split(":");
	        if (parts.length != 4) {
	            return null;
	        }

	        String carId = parts[0];
	        String carName = parts[1];
	        String carType = parts[2];
	        String city = parts[3];

	        return new CarInfo(carId, carName, carType, city);
	    }

	    // Optional: Main method to test
	    public static void main(String[] args) {
	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        System.out.println("Enter the Car Details");
	        String input = sc.nextLine();

	        CarInfo car = extractDetails(input);
	        if (car != null) {
	            System.out.println("Car Id : " + car.getCarId());
	            System.out.println("CarName : " + car.getCarName());
	            System.out.println("Car Type : " + car.getCarType());
	            System.out.println("City : " + car.getCity());

	            String availability = car.checkAvailability();
	            if (availability.equals("Not Available")) {
	                System.out.println("Invalid Details");
	            } else {
	                System.out.println("Availablecarandpriceis:" + availability);
	            }
	        } else {
	            System.out.println("Invalid Details");
	        }

	        sc.close();
	    }
	}
