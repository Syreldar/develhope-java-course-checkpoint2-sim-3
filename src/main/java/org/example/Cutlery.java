package org.example;

public class Cutlery
{
    private String name;
    private int dirtiness;

    public Cutlery(String name, int dirtiness)
    {
        this.name = name;
        this.dirtiness = dirtiness;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDirtiness()
    {
        return this.dirtiness;
    }

    public void setDirtiness(int dirtiness)
    {
        this.dirtiness = dirtiness;
    }

    public void onUse(Eatable food)
    {
        this.dirtiness += Math.min(100, food.getGreasiness());
    }
}
