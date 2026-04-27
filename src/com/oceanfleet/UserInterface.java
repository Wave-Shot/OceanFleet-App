package com.oceanfleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");

            Vessel v = new Vessel(
                    parts[0],
                    parts[1],
                    Double.parseDouble(parts[2]),
                    parts[3]
            );

            util.addVesselPerformance(v);
        }

        String searchId = sc.nextLine();
        Vessel found = util.getVesselById(searchId);

        if (found != null) {
            System.out.println(found.getVesselId() + " | " +
                    found.getVesselName() + " | " +
                    found.getVesselType() + " | " +
                    found.getAverageSpeed());
        } else {
            System.out.println("Vessel not found");
        }

        List<Vessel> high = util.getHighPerformanceVessels();

        for (int i = 0; i < high.size(); i++) {
            Vessel v = high.get(i);
            System.out.println(v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed());
        }
    }
}