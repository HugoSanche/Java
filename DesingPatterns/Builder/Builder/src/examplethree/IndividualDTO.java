package examplethree;

import java.util.Date;
public class IndividualDTO {
    private final int personId;
    private final String firstName;
    private final String middleName;
    private final String firstLastName;
    private final String secondLastName;
    private final String maritalStatus;
    private final Date birthDate;
    private final String nacionality;
    private final int numberOfDependents;

    public IndividualDTO(int personId, String firstName, String middleName, String firstLastName, String secondLastName, String maritalStatus, Date birthDate, String nacionality, int numberOfDependents) {
        this.personId = personId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.maritalStatus = maritalStatus;
        this.birthDate = birthDate;
        this.nacionality = nacionality;
        this.numberOfDependents = numberOfDependents;
    }

    public IndividualDTO(Builder builder){
        this.personId = builder.personId;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.firstLastName = builder.firstLastName;
        this.secondLastName = builder.secondLastName;
        this.maritalStatus = builder.maritalStatus;
        this.birthDate = builder.birthDate;
        this.nacionality = builder.nacionality;
        this.numberOfDependents = builder.numberOfDependents;
    }

    public static class Builder{
        private  int personId;
        private String firstName;
        private String middleName;
        private String firstLastName;
        private String secondLastName;
        private String maritalStatus;
        private Date birthDate;
        private String nacionality;
        private int numberOfDependents;

        public IndividualDTO.Builder personId(int personId) {
            this.personId=personId;
            return this;
        }

        public IndividualDTO.Builder firstName(String firstName) {
            this.firstName=firstLastName;
            return this;
        }

        public IndividualDTO.Builder middleName(String middleName) {
            this.middleName=middleName;
            return this;
        }

        public IndividualDTO.Builder firstLastName(String firstLastName) {
            this.firstName=firstLastName;
            return this;
        }

        public IndividualDTO.Builder secondLastName(String secondLastName) {
            this.secondLastName=secondLastName;
            return this;
        }

        public IndividualDTO.Builder maritalStatus(String maritalStatus) {
            this.maritalStatus=maritalStatus;
            return this;
        }

        public IndividualDTO.Builder birthDate(Date birthDate) {
            this.birthDate=birthDate;
            return this;
        }

        public IndividualDTO.Builder nacionality(String nacionality) {
            this.nacionality=nacionality;
            return this;
        }

        public IndividualDTO.Builder numberOfDependents(int numberOfDependents) {
            this.numberOfDependents=numberOfDependents;
            return this;
        }
        public IndividualDTO builder(){
            return new IndividualDTO(this);
        }
    }

    @Override
    public String toString() {
        return "IndividualDTO{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstLastName='" + firstLastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", birthDate=" + birthDate +
                ", nacionality='" + nacionality + '\'' +
                ", numberOfDependents=" + numberOfDependents +
                '}';
    }
}
