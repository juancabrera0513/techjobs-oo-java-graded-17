package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    private int id;
    private static int nextId = 1;

    public CoreCompetency() {
        super(null);
        id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        super(value);
        id = nextId;
        nextId++;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return getValue() != null ? getValue() : "Data not available";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.






    public int getId() {
        return id;
    }
}
