/*
If Statement 04
Exercise: If Statement 4

define a class called Person that has:
1 instance variable:
an integer age
a constructor method that:
generates and prints a random value using Math.floor(Math.random()*(max-min+1)+min), where min=5 and max=80
assigns the random value to the instance variable (remember to do a narrowing casting)
a method getLifeStage that returns a string about the life stage of the Person:
<=12 is a Child
13-19 is a Teen
20-59 is an Adult
+60 is a Senior Adult
 */
public class Person {
    int age;

    public Person() {
        int min = 5;
        int max = 80;
        this.age = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public String getLifeStage() {
        String lifeStage = null;
        if (age <= 12) {
            lifeStage = "Child";
        } else if (age >= 13 && age <= 19) { // else if (age <= 19)
            lifeStage = "Teen";
        } else if (age >= 20 && age <= 59) { // else if (age <= 59)
            lifeStage = "Adult";
        } else {
            lifeStage = "Senior Adult";
        }
        return lifeStage;
    }
}
