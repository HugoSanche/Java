package examplethree;

public class Main {
    public static void main(String[] args) {
        IndividualDTO individualDTO=new IndividualDTO.Builder()
                .personId(1)
                .firstName("Guillermo")
                .middleName("Hugo")
                .firstLastName("Baltazar")
                .secondLastName("Sanchez")
                //.birthDate()
                .nacionality("Mexicana")
                .maritalStatus("Soltero")
                .builder();
        System.out.println(individualDTO);
    }


}
