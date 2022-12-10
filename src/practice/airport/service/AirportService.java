package practice.airport.service;

import practice.airport.model.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter release year");
        plane.setReleaseYear(s.nextInt());
        System.out.println("Is military plane? Y/N");
        String m = s.next().toLowerCase();
        plane.setMilitary(m.charAt(0) == 'y');
        return plane;
    }

    // Task 1
    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + ", " + plane.getReleaseYear());
    }

    // Task 2
    public void printNameOrHours(Plane plane) {
        System.out.println(plane.getReleaseYear() > 2000
                ? "Plane name: " + plane.getName()
                : "Hours in air: " + plane.getHoursInAir());
    }

    // Task 3
    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {

        if (plane1.getHoursInAir() > plane2.getHoursInAir())
            return plane1.getName();
        else
            return plane2.getName();
    }

    // Task 4
    public Plane withBiggerName(Plane plane1, Plane plane2) {
        return plane1.getName().length() > plane2.getName().length()
                ? plane1 : plane2;
    }

    // Task 5
    public void printPlaneArray(Plane[] planes) {
        for (Plane p : planes) {
            p.printInfo();
        }
    }

    // Task 6
    public void printMilitaryPlanesAfter2010(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getReleaseYear() > 2010)
                p.printInfo();
        }
    }

    // Task 7
    public Plane maxHoursInAir(Plane[] planes) {
        Plane max = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getHoursInAir() > max.getHoursInAir()) {
                max = planes[i];
            }

        }
        return max;
    }

    // Task 8
    public void printOldestPlane(Plane[] planes) {
        Plane oldest = planes[0];
        for (Plane p : planes) {
            if (p.getReleaseYear() < oldest.getReleaseYear())
                oldest = p;
        }
        oldest.printInfo();
    }

    //Task 9
    public void printNewestMilitary(Plane[] planes) {
        Plane newest = planes[0];
        int indexOfMilitary = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                newest = planes[i];
                indexOfMilitary = i;
                break;
            }
        }
        for (int i = indexOfMilitary + 1; i < planes.length; i++) {
            if (planes[i].isMilitary())
                if (planes[i].getReleaseYear() > newest.getReleaseYear()) {
                    newest = planes[i];
                }
        }
        newest.printInfo();
    }

    // Task 10
    public void sortByReleaseYear(Plane[] planes) {
        boolean c = true;

        int count = 0;
        while (c) {
            c = false;
            for (int i = 0; i < planes.length - 1 - count; i++) {
                if (planes[i].getReleaseYear() > planes[i + 1].getReleaseYear()) {
                    Plane n = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = n;
                    c = true;
                }
            }
            count++;
        }
        printPlaneArray(planes);
    }

}
