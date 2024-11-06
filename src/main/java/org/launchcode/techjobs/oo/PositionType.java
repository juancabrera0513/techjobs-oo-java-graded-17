package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    private int id;
    private static int nextId = 1;

    public PositionType() {
        super(null);
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        super(value);
        id = nextId;
        nextId++;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return getValue() != null ? getValue() : "Data not available";
    }


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }



}
