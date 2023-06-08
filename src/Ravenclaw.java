public class Ravenclaw extends Hogwartz {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int trasgressionRange, int smart, int wise, int witty, int creativity) {
        super(name,magicPower, trasgressionRange);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Студент Когтеврана: "
                + getName()  +
                ", Ум: " + smart +
                ", Мудрость: " + wise +
                ", Остроумие: " + witty +
                ", Креативность: " + creativity +
                ", Магическая сила: " + magicPower +
                ", Дистанция трансгрессии: " + trasgressionRange +
                '.';
    }
    public static void bestRavStudent (Ravenclaw stud1,Ravenclaw stud2) {
        if ((stud1.getSmart() + stud1.getWise() + stud1.getWitty() + stud1.getCreativity() + stud1.getMagicPower() + stud1.getTrasgressionRange()) > (stud2.getSmart() + stud2.getWise() + stud2.getWitty() + stud2.getCreativity() + stud2.getMagicPower() + stud2.getTrasgressionRange())){
            System.out.println(stud1.getName() + " - лучший студент Когтеврана, чем " + stud2.getName() + ".");
        } else if ((stud1.getSmart() + stud1.getWise() + stud1.getWitty() + stud1.getCreativity() + stud1.getMagicPower() + stud1.getTrasgressionRange()) < (stud2.getSmart() + stud2.getWise() + stud2.getWitty() + stud2.getCreativity() + stud2.getMagicPower() + stud2.getTrasgressionRange())) {
            System.out.println(stud2.getName() + " - лучший студент Когтеврана, чем " + stud1.getName() + ".");
        }
        else {
            System.out.println("Студенты равны.");
        }
    }
}
