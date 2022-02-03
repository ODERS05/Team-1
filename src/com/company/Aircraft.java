package com.company;

public class Aircraft {
    protected static int count;
    protected int id;
    protected String model;
    protected String type;

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Aircraft{ " +
                "id = " + id +
                ", model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}

