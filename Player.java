import java.io.Serializable;
public class Player implements Serializable
{
    private Position position;
    private String age,skillLevel;
    private String name;
    private String value;

    public Player( Position position, String name, String age, String skillLevel, String value){
        this.position = position;
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;
        this.value = value;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public String setSkillLevel(String skillLevel) {
       /* Dice dice = new Dice(100+10);

        return dice.rollDie(1); */
       this.skillLevel = skillLevel;

       return skillLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

   @Override
    public String toString() {
      String S = "Name: " + getName() + "\n age: " + getAge() + "\n SkillLevel: " + getSkillLevel() + "\n Position: " + getPosition() + "\n Value: " + getValue() + "\n";

      return S;
    }

    /*
     * Here is the Player class
     * Idea is to use an Enum to keep track of the playing position of the field.
     *
     * The idea is to create some variables for later use
     */
    // 1a. Create the variables
    //      age, name, value(double), skill level(from 1-100)

    // 1b. Create a full constructor

    // 1c. Create getters for all variables

    // 1d. Remember to create a toString method soo you have a common print for the class

    // 1e. Go to the Exercise4 Class
}
