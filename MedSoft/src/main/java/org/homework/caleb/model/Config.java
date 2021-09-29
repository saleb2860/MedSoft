package org.homework.caleb.model;

import java.util.List;

/**
 * top level object represented in the config file.
 * "symptoms" here refers to the symptoms array in the file
 */
public class Config {
    private List<Symptom> symptoms;

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Config{" +
                "symptoms=" + symptoms +
                '}';
    }
}
