package com.example.clarios6.emcampus;

/**
 * @author  Carlos Larios-Solis on 4/22/17.
 */

public class CSUSanJose implements InfoTemplate{
    private final String SCHOOL_NAME = "CSU San Jose";
    private final String ADDRESS = "One Washington Square, San Jose, CA";
    private final String NUM_STRING = "(408)924-2222";


    @Override
    public String getSchoolName() {
        return this.SCHOOL_NAME;
    }

    @Override
    public String getAddress() {
        return this.ADDRESS;
    }

    @Override
    public String getNumString() {
        return this.NUM_STRING;
    }

    @Override
    public int getNumInt() {
        return 0;
    }
}
