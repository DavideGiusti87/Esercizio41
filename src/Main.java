/*
If Statement 04
Exercise: If Statement 4

define a testing class where you:
create a Person
call the getLifeStage method and print the result: The person is in the X stage of life
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.printf("The person is in the %s stage of life",person.getLifeStage());
    }
}
