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
}