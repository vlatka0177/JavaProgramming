package day37_Inheritance.scrumTask;

import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BO;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    // Generate the constructor
    public ScrumTeam(ProductOwner PO, BusinessAnalyst BO, ScrumMaster SM) {
        this.PO = PO;
        this.BO = BO;
        this.SM = SM;
    }

    public void addTester (Tester tester) {
        testers.add(tester);
    }

    public void addTesters(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester (int id) {
        testers.removeIf(p -> p.id == id);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper (int id) {
        developers.removeIf(p -> p.id == id);
    }
    // Generate toString
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BO=" + BO +
                ", SM=" + SM +
                ", number of testers=" + testers.size() +  // Add 'number of' to testers and '.size()' after testers
                ", number of developers=" + developers.size() +  // Add 'number of' to developers and '.size()' after developers
                '}';
    }
}
