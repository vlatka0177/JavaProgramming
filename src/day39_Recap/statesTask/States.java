package day39_Recap.statesTask;

public class States {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    // Generate getters and setters to encapsulate all the fields
    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name == null) {
            System.err.println("Name cannot be null.");
            System.exit(1);
        }
        if(name.isEmpty()) {
            System.err.println("Invalid name entry.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {

        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {

        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {

        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null) {
            System.err.println("Political party cannot be null.");
            System.exit(1);
        }
        if(politicalParty.isEmpty()) {
            System.err.println("Invalid political party entry.");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {

        return governor;
    }

    public void setGovernor(String governor) {
        if(governor == null) {
            System.err.println("Governor cannot be null.");
            System.exit(1);
        }
        if(politicalParty.isEmpty()) {
            System.err.println("Invalid governor entry.");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {

        return senator;
    }

    public void setSenator(String senator) {
        if(senator == null) {
            System.err.println("Senator cannot be null.");
            System.exit(1);
        }
        if(politicalParty.isEmpty()) {
            System.err.println("Invalid senator entry.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {

        return population;
    }

    public void setPopulation(int population) {
        if(population <= 0) {
            System.err.println("Population cannot be zero or less than zero.");
            System.exit(1);
    }
        this.population = population;
    }

    public double getStateTax() {

        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax < 0) {
            System.err.println("State tax cannot be less than zero.");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    // Add A constructor to set all the fields
    public States(String name, String abbreviation, String politicalParty, String governor, String senator,
                  int population, double stateTax) {
        setName(name);       // Change this.name = name; to setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
        /* Setter is preferred because it can check conditions: population cannot be zero or less than zero,
           name cannot be null or empty etc. */
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

/*
    States Task:

	1. Create A class named States:
			Variables:
				name, abbreviation, politicalParty, governor, senator, population, stateTax

			Encapsulate all the fields.

			Add A constructor that can set all the fields.

			Conditions:
			1. name, abbreviation, politicalParty, Governor, and senator can not be null
			2. name, abbreviation, politicalParty, Governor, and senator can not be empty
			3. taxRate cannot be negative
		    4. Population cannot be set to zero or negative

			Methods:
				toString()
     */

