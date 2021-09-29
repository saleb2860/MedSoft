package org.homework.caleb.model;

import java.util.List;

public class Symptom {
    private String name;

    private List<Treatment> treatments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }


    @Override
    public String toString() {
        return "Symptom{" +
                "name='" + name + '\'' +
                ", treatments=" + treatments +
                '}';
    }
}
