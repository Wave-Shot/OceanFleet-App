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
}