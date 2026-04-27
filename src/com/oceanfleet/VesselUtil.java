package com.oceanfleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public List<Vessel> getAllVessels() {
        return vesselList;
    }

    public Vessel getVesselById(String vesselId) {
        for (int i = 0; i < vesselList.size(); i++) {
            Vessel v = vesselList.get(i);
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> result = new ArrayList<>();

        double max = 0;

        for (int i = 0; i < vesselList.size(); i++) {
            if (vesselList.get(i).getAverageSpeed() > max) {
                max = vesselList.get(i).getAverageSpeed();
            }
        }

        for (int i = 0; i < vesselList.size(); i++) {
            if (vesselList.get(i).getAverageSpeed() == max) {
                result.add(vesselList.get(i));
            }
        }

        return result;
    }

}