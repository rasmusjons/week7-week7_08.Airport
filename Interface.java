
import java.util.Scanner;

public class Interface {

    private Scanner reader;
    Airplanes plane = new Airplanes();
    Flight flight = new Flight();

    public Interface(Scanner reader) {
        this.reader = reader;

    }

    public void start() {

        boolean runProgramAirport = true;
        boolean runProgramFlights = true;

        while (runProgramAirport) {

            System.out.println(" Airport panel\n"
                    + "--------------------\n"
                    + "\n"
                    + "Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "     ");

            String input = reader.nextLine();

            if (input.equals("1")) {

                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());
                plane.addPlane(id, capacity);

            }

            if (input.equals("2")) {

                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                plane.getAirplane(id);

                System.out.println("Give departure airport code: ");
                String to = reader.nextLine();
                System.out.println("Give destination airport code: ");
                String from = reader.nextLine();
                String toFrom = "(" + to + "-" + from + ")";

                String stringFlight = plane.getAirplane(id) + " " + toFrom;
                flight.addFlight(stringFlight);

            }

            if (input.equals("x")) {
                runProgramAirport = false;
            }
        }

        while (runProgramFlights) {
            System.out.println("Flight service\n"
                    + "------------\n"
                    + "\n"
                    + "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            String input = reader.nextLine();

            if (input.equals("1")) {
                plane.printPlanes();
            }

            if (input.equals("2")) {
                System.out.println(flight.printFlights());

            }

            if (input.equals("3")) {
                System.out.println("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println(plane.getAirplane(id));
            }

            if (input.equals("x")) {
                runProgramFlights = false;
            }

        }

    }

}
