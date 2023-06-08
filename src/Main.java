public class Main {
    public static void main(String[] args) {
        Ravenclaw chjouChang = new Ravenclaw("Чжоу Чанг",58,37,63,38,61,52);
        Ravenclaw padmaPatil = new Ravenclaw ("Падма Патил",53 ,49,44,51,32,62);
        Ravenclaw markusBelby = new Ravenclaw("Маркус Белби",60,40,61,42,70,58);
        Hafflepaw zakhariSmith = new Hafflepaw("Захария Смит",43,60,57,80,40);
        Hafflepaw sedricDiggori = new Hafflepaw("Седрик Диггор",65,59,85,70,77);
        Hafflepaw justinFinchFletch = new Hafflepaw("Джастин Финч-Флетчли", 42,37,50,58,43);
        Slytheryn drakoMalfoy = new Slytheryn("Драко Малфой", 68,58,75,62,41,67,36);
        Slytheryn grakhemMontegui = new Slytheryn("Грэхем Монтегю",42,58,61,34,50,41,69);
        Slytheryn gregoryGoil = new Slytheryn("Грегори Гойл",39,48,67,42,38,35,59);
        Griffindor harryPotter = new Griffindor("Гарри Поттер",67,54,60,55,70);
        Griffindor germionaGreyndger = new Griffindor("Гермиона Грейнджер",70,69,40,65,65);
        Griffindor ronaldWisely = new Griffindor("Рональд Уизли",48,52,44,67,87);

        System.out.println(sedricDiggori);
        System.out.println(markusBelby);
        System.out.println(grakhemMontegui);
        System.out.println(harryPotter);

        Ravenclaw.bestRavStudent(chjouChang,padmaPatil);
        Hafflepaw.bestHuffStud (zakhariSmith,justinFinchFletch);
        Slytheryn.bestSlythStudent(drakoMalfoy,gregoryGoil);
        Griffindor.bestGriffStud(germionaGreyndger,ronaldWisely);

        Hogwartz.powerfulStudent(harryPotter,drakoMalfoy);
    }


}