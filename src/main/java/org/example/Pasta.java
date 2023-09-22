package org.example;

public class Pasta implements Eatable
{
    private int quantity;
    private int satiety;
    private int greasiness;

    public Pasta(int quantity)
    {
        this.quantity = quantity;
        this.satiety = quantity * 2;
        this.greasiness = quantity * 3;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public int getSatiety()
    {
        return this.satiety;
    }

    public void setSatiety(int satiety)
    {
        this.satiety = satiety;
    }

    @Override
    public int getGreasiness()
    {
        return this.greasiness;
    }

    public void setGreasiness(int greasiness)
    {
        this.greasiness = greasiness;
    }
}
