package org.example;

public class Person
{
    private String name;
    private int hunger;

    public Person(String name, int hunger)
    {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHunger()
    {
        return this.hunger;
    }

    public void setHunger(int hunger)
    {
        this.hunger = hunger;
    }

    public void eat(Eatable food, Cutlery cutlery) throws Exception
    {
        if (cutlery.getDirtiness() > 0)
        {
            throw new Exception(String.format("This %s is dirty! I can't eat with this.", cutlery.getClass().getSimpleName()));
        }

        this.hunger -= Math.max(0, food.getSatiety());
        cutlery.onUse(food);
    }
}
