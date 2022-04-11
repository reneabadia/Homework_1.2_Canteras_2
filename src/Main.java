import java.util.Scanner;

/**
 * Application that represents a space mission authorization system
 * @author Rene Abadia
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Software to create spacecrafts objects and launch them to do missions.");

        /**
         * Represents a loop to ask the user if they want to continue or abort
         */
        while(true) {

            /**
             * Taking the data entered by the user
             */
            System.out.print("\nEnter spacecraft name (Apollo) or 'exit' to terminate program: ");
            String shipName = input.next();
            if (shipName.equals("exit")){break;}

            System.out.print("Enter origin country of ship (USA): ");
            String originCountry = input.next();

            System.out.print("Enter number of propellant type [1: Liquid, 2: Solid, 3: Electromagnetic]: ");
            int propellantType = input.nextInt();
            while (propellantType < 1 || propellantType > 3) {
                System.out.print("Enter number of propellant type [1: Liquid, 2: Solid, 3: Electromagnetic]: ");
                propellantType = input.nextInt();
            }

            System.out.print("Enter max thrust of the ship in tons (3500): ");
            double maxThrust = input.nextDouble();

            System.out.print("Enter mass of the ship in tons, must be lower than the thrust (2900): ");
            double shipMass = input.nextDouble();
            while (shipMass > maxThrust) {
                System.out.print("Enter mass of the ship in tons must be lower than the thrust (2900): ");
                shipMass = input.nextDouble();
            }

            /**
             * Asking the user if the mission is manned
             */
            // MANNED
            System.out.print("This spacecraft is manned (y/n): ");
            String mannedCraft = input.next();

            /**
             * Represents taking the data entered by the user for manned mission
             */
            while (!mannedCraft.equals("y") && !mannedCraft.equals("n")) {
                System.out.print("This spacecraft is manned (y/n): ");
                mannedCraft = input.next();
            }

            if (mannedCraft.equals("y")) {

                String s = "Enter type of manned mission [1: Lunar, 2: Zero gravity, 3: Maintenance]: ";
                System.out.print(s);
                int task = input.nextInt();
                while (task < 1 || task > 3) {
                    System.out.print(s);
                    task = input.nextInt();
                }

                // Ask for crewSize
                System.out.print("Enter crew size: ");
                int crewSize = input.nextInt();

                // Create manned spacecraft object
                Manned manned = new Manned(task, crewSize, shipName, originCountry, propellantType, maxThrust, shipMass);

                System.out.print("Spacecraft is ready!, Launch mission? (y/n): ");
                String launching = input.next();
                while (!launching.equals("y") && !launching.equals("n")) {
                    System.out.print("Launch mission? (y/n): ");
                    launching = input.next();
                }
                if (launching.equals("y")) {
                    System.out.println(manned.launchMission());
                } else {
                    System.out.println(manned.abortMission());
                }

            }

            /**
             * Asking the user if the mission is unmanned
             */
            // UNMANNED
            if (mannedCraft.equals("n")) {

                /**
                 * Taking the data entered by the user for unmanned mission
                 */
                // Ask for astronomical object for study
                System.out.print("Enter name of astronomical object for study: ");
                String Astro = input.next();

                String s = "Enter type of unmanned ship [1: Shuttle, 2: Probe, 3: Robotic, 4: Satellite]: ";
                System.out.print(s);
                int typeUnmanned = input.nextInt();
                while (typeUnmanned < 1 || typeUnmanned > 4) {
                    System.out.print(s);
                    typeUnmanned = input.nextInt();
                }

                /**
                 * Represents a switch case to decide the type of spacecraft for the mission
                 */
                // Create unmanned spacecraft object
                // This could use less lines of code,
                // but as an abstract class is mandatory in this HomeWork, the instancing is forbidden.
                switch (typeUnmanned) {
                    case 1 -> {
                        System.out.println("Enter payload of Shuttle in tons: ");
                        float payload = input.nextFloat();
                        Shuttle shuttle = new Shuttle(payload, shipName, originCountry, propellantType, maxThrust, shipMass);
                        System.out.print("Spacecraft is ready!, Launch mission? (y/n): ");
                        String launching = input.next();
                        if (launching.equals("y")) {
                            System.out.println(shuttle.launchMission());
                        } else {
                            System.out.println(shuttle.abortMission());
                        }
                    }
                    case 2 -> {
                        Probe probe = new Probe(shipName, originCountry, propellantType, maxThrust, shipMass);
                        probe.setAstro(Astro);
                        System.out.print("Spacecraft is ready!, Launch mission? (y/n): ");
                        String launching2 = input.next();
                        if (launching2.equals("y")) {
                            System.out.println(probe.launchMission());
                        } else {
                            System.out.println(probe.abortMission());
                        }
                    }
                    case 3 -> {
                        Robotic robotic = new Robotic(shipName, originCountry, propellantType, maxThrust, shipMass);
                        robotic.setAstro(Astro);
                        System.out.print("Spacecraft is ready!, Launch mission? (y/n): ");
                        String launching3 = input.next();
                        if (launching3.equals("y")) {
                            System.out.println(robotic.launchMission());
                        } else {
                            System.out.println(robotic.abortMission());
                        }
                    }
                    case 4 -> {
                        Satellite satellite = new Satellite(shipName, originCountry, propellantType, maxThrust, shipMass);
                        satellite.setAstro(Astro);
                        System.out.print("Spacecraft is ready!, Launch mission? (y/n): ");
                        String launching4 = input.next();
                        if (launching4.equals("y")) {
                            System.out.println(satellite.launchMission());
                        } else {
                            System.out.println(satellite.abortMission());
                        }
                    }
                }


            }
        }


      }


}




