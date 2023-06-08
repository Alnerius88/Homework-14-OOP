public class Griffindor extends Hogwartz {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor (String name, int magicPower, int trasgressionRange, int nobility, int honor, int bravery){
        super(name, magicPower, trasgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }
    @Override
    public String toString() {
        return "Студент Гриффиндора: "
                 + getName() +
                ", Благородство: " + nobility +
                ", Честь: " + honor +
                ", Храбрость: " + bravery +
                ", Магическая сила: " + magicPower +
                ", Дистанция трансгрессии: " + trasgressionRange +
                '.';
    }
    public static void bestGriffStud (Griffindor stud1,Griffindor stud2) {
        if ((stud1.getNobility() + stud1.getBravery() + stud1.getHonor() + stud1.getMagicPower() + stud1.getTrasgressionRange()) > (stud2.getNobility() + stud2.getBravery() + stud2.getHonor() + stud2.getMagicPower() + stud2.getTrasgressionRange() )) {
            System.out.println(stud1.getName() + " - лучший студент Гриффиндора, чем " + stud2.getName());
        }
        else if ((stud1.getNobility() + stud1.getBravery() + stud1.getHonor() + stud1.getMagicPower() + stud1.getTrasgressionRange()) < (stud2.getNobility() + stud2.getBravery() + stud2.getHonor() + stud2.getMagicPower() + stud2.getTrasgressionRange())) {
            System.out.println(stud2.getName() + " - лучший студент Гриффиндора, чем " + stud1.getName());
        }
        else {
            System.out.println("Студенты равны.");
        }
    }
}
