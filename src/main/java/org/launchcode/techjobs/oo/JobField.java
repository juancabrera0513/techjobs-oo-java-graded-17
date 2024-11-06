package org.launchcode.techjobs.oo;

public abstract class JobField {
    private String value;

    public JobField(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value != null ? value : "Data not available";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return value != null ? value.equals(jobField.value) : jobField.value == null;
    }

    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

}
