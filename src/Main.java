import Model.Donor;
import Controller.DonorController;

public class Main {

    public static void main(String[] args) {

        DonorController controller = new DonorController();

        Donor donor1 = new Donor(1, "Ali", "A+");
        Donor donor2 = new Donor(2, "Ahmed", "B+");
        Donor donor3 = new Donor(3, "Sara", "O-");

        controller.addDonor(donor1);
        controller.addDonor(donor2);
        controller.addDonor(donor3);

        System.out.println("\nAll Donors:");

        controller.displayAllDonors();

        System.out.println("\nSearching Donor ID 2:\n");

        Donor foundDonor = controller.searchDonorById(2);

        if (foundDonor != null) {

            foundDonor.displayDonor();

        } else {

            System.out.println("Donor Not Found");
        }
        System.out.println("\nDeleting Donor ID 2:\n");

        controller.deleteDonorById(2);

        System.out.println("\nAfter Deletion:\n");

        controller.displayAllDonors();

        System.out.println("\nUpdating Donor ID 1:\n");

        controller.updateDonorById(1, "Ali Updated", "AB+");

        System.out.println("\nAfter Update:\n");

        controller.displayAllDonors();
    }

}