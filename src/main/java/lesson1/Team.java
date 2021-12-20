package lesson1;

public class Team {
    private final String nameTeam;
    String teamName;
    Competitor[] teamMembers = new Competitor[4];


    public Team(String nameTeam, String teamName, Competitor[] teamMembers){
        this.nameTeam = nameTeam;
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public Competitor[] partner = new Competitor[3];

    //        for(int i = 0; i < 4; i++){
    //            int ran = random.nextInt(3);

    public Animal[] zoo = new Animal[]{
            new Cat("Murzik"), new Wolf("Izzy")
    };

        // Forming new team

        public Team (String nameTeam, Competitor com1, Competitor com2, Competitor com3) {
        this.nameTeam  = nameTeam;

        partner[0] = com1;
        partner[1] = com2;
        partner[2] = com3;

        }

// Вывод информации кто прошел дистанцию

public void passedTheDistance() {
        for (Competitor com : partner) {

        // Если участник onDistance == true, выводим его

        if (com.isOnDistance()) {
        com.info();
            }
        }
}

// Вывод информации о членах команды

public void showResults() {

        for (Competitor com : partner) {
        com.info();
        }
}

// геттер участников команды
public Competitor[] getTeammates() {
        return partner;
        }

    public Competitor[] getMembers() {
        return new Competitor[0];
    }
}
