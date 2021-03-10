package com.example.demoJpa;

import java.util.Date;

public class Rent
{
    private Date beginRent;

    private Date endRent;

    public Date getBeginRent()
    {
        return beginRent;
    }

    public void setBeginRent(Date beginRent)
    {
        this.beginRent = beginRent;
    }

    public Date getEndRent()
    {
        return endRent;
    }

    public void setEndRent(Date endRent)
    {
        this.endRent = endRent;
    }
}
