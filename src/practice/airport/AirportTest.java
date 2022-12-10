package practice.airport;

import practice.airport.model.Plane;
import practice.airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();

        Plane plane = service.createPlane();
        Plane plane1 = service.createPlane();
        Plane plane2 = service.createPlane();
        Plane[] planes = {plane, plane1, plane2};

        System.out.println("1----------------------------");
        service.printNameAndReleaseDate(plane);

        System.out.println("2----------------------------");
        service.printNameOrHours(plane);

        System.out.println("3----------------------------");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane1, plane2));

        System.out.println("4----------------------------");
        service.withBiggerName(plane1, plane2).printInfo();

        System.out.println("5----------------------------");
        service.printPlaneArray(planes);

        System.out.println("6----------------------------");
        service.printMilitaryPlanesAfter2010(planes);

        System.out.println("7----------------------------");
        service.maxHoursInAir(planes).printInfo();

        System.out.println("8----------------------------");
        service.printOldestPlane(planes);

        System.out.println("9----------------------------");
        service.printNewestMilitary(planes);

        System.out.println("10---------------------------");
        service.sortByReleaseYear(planes);

    }
}
