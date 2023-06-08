public class Hafflepaw extends Hogwartz {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hafflepaw(String name, int magicPower, int trasgressionRange, int diligence, int loyalty, int honesty) {
        super(name, magicPower, trasgressionRange);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.diligence = diligence;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Студент Пуффендуя: "
                + getName() +
                ", Трудолюбие: " + diligence +
                ", Верность: " + loyalty +
                ", Честность: " + honesty +
                ", Магическая сила: " + magicPower +
                ", Дистанция трансгрессии: " + trasgressionRange +
                '.';
    }
    public static void bestHuffStud (Hafflepaw stud1,Hafflepaw stud2) {
        if ((stud1.getLoyalty() + stud1.getDiligence() + stud1.getHonesty() + stud1.getMagicPower() + stud1.getTrasgressionRange()) > (stud2.getLoyalty() + stud2.getDiligence() + stud2.getHonesty() + stud2.getMagicPower() + stud2.getTrasgressionRange() )) {
            System.out.println(stud1.getName() + " - лучший студент Пуффендуя, чем " + stud2.getName() + ".");
        }
        else if ((stud1.getLoyalty() + stud1.getDiligence() + stud1.getLoyalty() + stud1.getMagicPower() + stud1.getTrasgressionRange()) < (stud2.getLoyalty() + stud2.getDiligence() + stud2.getHonesty() + stud2.getMagicPower() + stud2.getTrasgressionRange())) {
            System.out.println(stud2.getName() + " - лучший студент Пуффендуя, чем " + stud1.getName() + ".");
        }
        else {
            System.out.println("Студенты равны.");
        }
    }


}
