package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public MyScrumTeam() {
    }

    public static void main(String[] args) {

        Tester tester1 = new Tester("Iva", 11, "QA", 100000);
        Tester tester2 = new Tester("Milica", 43, "SDET", 120000);
        Tester tester3 = new Tester("Tomislav", 28, "SE", 110000);
        Tester tester4 = new Tester("Silvana", 23, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        Developer developer1 = new Developer("Vesna", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Filip", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Suzana", 74, "Software Developer", 135000);
        Developer developer4 = new Developer("Caroline", 48, "Senior Developer", 200000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Mirka", "Roger", "Andre", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("-----------------------------------------------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("------------------------------------------------------------------------------------");

        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------------------------------------------");

        scrum.removeTester(23);
        scrum.removeDeveloper(22);

        System.out.println(scrum);
    }
}

