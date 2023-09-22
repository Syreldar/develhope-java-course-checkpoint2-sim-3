package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        var person = new Person("Enrico", 10);
        var cutleryMap = Map.of(
            "fork", new Fork(15),
            "knife", new Knife(10),
            "spoon", new Spoon(5)
        );

        var menu = Map.of(
            "first_course", new Pasta(50),
            "fruit", new Apple(20),
            "snack", new Cake(30)
        );

        var eatingUtensils = Map.of(
            "first_course", "fork",
            "fruit", "knife",
            "snack", "spoon"
        );

        eatingUtensils.forEach((foodKey, utensilKey) ->
        {
            try
            {
                person.eat(menu.get(foodKey), cutleryMap.get(utensilKey));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        });
    }
}