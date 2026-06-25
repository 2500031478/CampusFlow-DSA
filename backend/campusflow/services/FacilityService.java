package backend.campusflow.services;

import java.util.ArrayList;
import java.util.List;
import backend.campusflow.models.Facility;

public class FacilityService {

    private List<Facility> facilities = new ArrayList<>();

    public void addFacility(Facility facility) {
        facilities.add(facility);
    }

    public List<Facility> getFacilities() {
        return facilities;
    }
}