package org.homework.caleb.model;

/**
 * a treatment for a symptom
 */
public class Treatment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "name='" + name + '\'' +
                '}';
    }
}
