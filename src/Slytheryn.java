public class Slytheryn extends Hogwartz {
    private int cunning;
    private  int determinaton;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytheryn(String name, int magicPower, int trasgressionRange, int cunning, int determinaton, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, trasgressionRange);
        this.cunning = cunning;
        this.determinaton = determinaton;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Студент Слизерина: "
                 + getName() +
                ", Хитрость: " + cunning +
                ", Решительность: " + determinaton +
                ", Амбизиозность: " + ambition +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + thirstForPower +
                ", Магическая сила: " + magicPower +
                ", Дистанция трансгрессии: " + trasgressionRange +
                '.';
    }

    public int getCunning() {
        return cunning;
    }

    public int getDeterminaton() {
        return determinaton;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public static void bestSlythStudent (Slytheryn stud1,Slytheryn stud2) {
        if ((stud1.getCunning() + stud1.getDeterminaton() + stud1.getAmbition() + stud1.getResourcefulness() + stud1.getThirstForPower() + stud1.getMagicPower() + stud1.getTrasgressionRange()) > (stud2.getCunning() + stud2.getDeterminaton() + stud2.getAmbition() + stud2.getResourcefulness() + stud2.getThirstForPower() + stud2.getMagicPower() + stud2.getTrasgressionRange())){
            System.out.println(stud1.getName() + " - лучший студент Слизерина, чем " + stud2.getName() + ".");
        } else if ((stud1.getCunning() + stud1.getDeterminaton() + stud1.getAmbition() + stud1.getResourcefulness() + stud1.getThirstForPower() + stud1.getMagicPower() + stud1.getTrasgressionRange()) < (stud2.getCunning() + stud2.getDeterminaton() + stud2.getAmbition() + stud2.getResourcefulness() + stud2.getThirstForPower() + stud2.getMagicPower() + stud2.getTrasgressionRange())) {
            System.out.println(stud2.getName() + " - лучший студент Слизерина, чем " + stud1.getName() + ".");
        }
        else {
            System.out.println("Студенты равны.");
        }
    }
}
