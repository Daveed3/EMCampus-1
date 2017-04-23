package com.example.clarios6.emcampus;

/**
 * Created by clarios6 on 4/22/17.
 */

public class CSULosAngeles implements InfoTemplate {
    private final String SCHOOL_NAME = "CSU Los Angeles";
    private final String ADDRESS = "5151 State University Dr, Los Angeles, CA 90032";
    private final String NUM_STRING = "(323)343-3700";

    @Override
    public String getSchoolName() {
        return SCHOOL_NAME;
    }

    @Override
    public String getAddress() {
        return ADDRESS;
    }

    @Override
    public String getNumString() {
        return NUM_STRING;
    }

    @Override
    public int getNumInt() {
        return 0;
    }
}
