//import Vehicle from Vehicle.java;
// import java.util.List;
import java.util.ArrayList;
import java.io.Console;

public class App {
    public static  void main(String[] args){
        Console console = System.console();

        // Vehicle hothatch = new Vehicle();
        // hothatch.mBrand = "Volks Wagen";
        // hothatch.mModel = "Golf mk 8";
        // hothatch.mMiles = 0;
        // hothatch.mYear = 2019;
        // hothatch.mPrice = 28000;

        // Vehicle suv = new Vehicle();
        // suv.mBrand = "Toyota";
        // suv.mModel = "FJ Cruiser";
        // suv.mMiles = 50000;
        // suv.mYear = 2015;
        // suv.mPrice = 17900;

        // Vehicle coupe = new Vehicle();
        // coupe.mBrand = "Peugeot";
        // coupe.mModel = "304";
        // coupe.mMiles = 346746;
        // coupe.mYear = 1967;
        // coupe.mPrice = 45000;

        // Vehicle truck = new Vehicle();
        // truck.mBrand = "Ford";
        // truck.mModel = "Raptor";
        // truck.mMiles = 45000;
        // truck.mYear = 2018;
        // truck.mPrice = 65000;

        // Vehicle crossover = new Vehicle();
        // crossover.mYear = 1998;
        // crossover.mBrand = "Toyota";
        // crossover.mModel = "Rav-4";
        // crossover.mMiles = 200000;
        // crossover.mPrice = 3500;

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);
        Vehicle  monster = new Vehicle(1999, "Ford", "Bronco", 459000, 90000);


        ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
        allVehicles.add(hatchback);
        allVehicles.add(sedan);
        allVehicles.add(suv);
        allVehicles.add(truck);
        allVehicles.add(crossover);

        boolean running = true;

        while (running) {
            System.out.println("Welcome to our car dealership. What would you like to do?   Enter one of the following options: All Vehicles, Search Price or Add Vehicle or Exit");

        String navigationChoice = console.readLine();

        if (navigationChoice.equals("All Vehicles")) {
            for (Vehicle individualVehicle : allVehicles){            
                System.out.println("**-------------***------------**");
                System.out.println(individualVehicle.mBrand);
                System.out.println(individualVehicle.mModel);
                System.out.println(individualVehicle.mMiles);
                System.out.println(individualVehicle.mYear);
                System.out.println(individualVehicle.mPrice);       
            }
        }else if(navigationChoice.equals("Search Price")){
            System.out.println("What is your maximum budget?");
            String userBudgetStr = console.readLine();
            int userBudget = Integer.parseInt(userBudgetStr);
            System.out.println("Okay, here is what we have in your price range:");

            for (Vehicle individualVehicle : allVehicles){
                if (individualVehicle.worthBuying(userBudget)){
                    System.out.println("**-------------***------------**");
                    System.out.println(individualVehicle.mBrand);
                    System.out.println(individualVehicle.mModel);
                    System.out.println(individualVehicle.mMiles);
                    System.out.println(individualVehicle.mYear);
                    System.out.println(individualVehicle.mPrice);
                }
            }
        }else if (navigationChoice.equals("Add Vehicle")){
            System.out.println("Alright, let's add a vehicle. What year was it made?");
            int userVehicleYear = Integer.parseInt(console.readLine());
            System.out.println("Great! What make of vehicle?");
            String userVehicleBrand = console.readLine();
            System.out.println("Got it! What model is the vehicle?");
            String userVehicleModel = console.readLine(); 
            System.out.println("And how many miles does it have on it?");
            int userVehicleMiles = Integer.parseInt(console.readLine());
            System.out.println("Finally, what's its price?");
            int userVehiclePrice = Integer.parseInt(console.readLine());

            Vehicle userVehicle = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
            allVehicles.add(userVehicle);
            System.out.println("Alright, here is your new vehicle:");

            System.out.println("**-------------***------------**");
            System.out.println( userVehicle.mYear );
            System.out.println( userVehicle.mBrand );
            System.out.println( userVehicle.mModel );
            System.out.println( userVehicle.mMiles );
            System.out.println( userVehicle.mPrice );

        }else if(navigationChoice.equals("Exit")){
            running = false; 

        }else{
            System.out.println("Sorry, we are not able to recognize your input");
        }
        }        
    }
}
