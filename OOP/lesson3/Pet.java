import java.util.Arrays;


public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    String[] habits;


    public Pet(){}

    public Pet(String species, String nickname)
    {
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits)
    {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;

    }

    void eat(){
        System.out.println("I am eating");
    }

    void respond(){
        System.out.println("Hello, owner. I am " + this.nickname + "I miss you!" );
    }

    void foul(){
        System.out.println("I need to cover it up");
    }
    @Override
    public String toString(){
        return species + "{nickname='" +nickname + "', age=" + age + ", tricklevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }

}