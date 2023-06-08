public class Hogwartz {
    protected String name;
    protected int magicPower;
    protected int trasgressionRange;
    public Hogwartz (String name, int magicPower, int trasgressionRange){
        this.name = name;
        this.magicPower = magicPower;
        this.trasgressionRange = trasgressionRange;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTrasgressionRange() {
        return trasgressionRange;
    }
    public static void powerfulStudent (Hogwartz stud1, Hogwartz stud2){
        if ((stud1.getMagicPower() + stud1.getTrasgressionRange()) > (stud2.getMagicPower() + stud2.getTrasgressionRange())) {
            System.out.println(stud1.getName() + " - более магически одарен, чем " + stud2.getName() + ".");
        } else if ((stud1.getMagicPower() + stud1.getTrasgressionRange()) < (stud2.getMagicPower() + stud2.getTrasgressionRange())) {
            System.out.println(stud2.getName() + " - более магически одарен, чем " + stud1.getName() + ".");
        }
        else {
            System.out.println("Студенты равны в своей магической силе.");
        }
    }

}
