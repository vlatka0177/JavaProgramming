package day31_Constructors;

public class Offer {

/*
 1. Create a custom class named Offer
            Attributes:
    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

    Actions:
    setInfo(): sets all the instance variables
    toString(): returns the full info of the Offer Object
 */

    public String location, companyName, jobTitle;
    public int salary;
    public boolean hasBenefits, hasPTO, isWFH, isFullTime;

    // setInfo + Right click + Generate + Constructor + Highlight
    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefits,
                        boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +          // add $
                ", hasBenefits=" + hasBenefits +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }

}


