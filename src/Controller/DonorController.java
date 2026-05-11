package Controller;

import Model.Donor;
import java.util.ArrayList;

public class DonorController {

    ArrayList<Donor> donorList = new ArrayList<>();

    public void addDonor(Donor donor) {

        donorList.add(donor);

        System.out.println("Donor Added Successfully!");
    }

    public void displayAllDonors() {

        for (Donor donor : donorList) {

            donor.displayDonor();

            System.out.println("----------------");
        }

    }
    public Donor searchDonorById(int id) {

        for (Donor donor : donorList) {

            if (donor.getDonorId() == id) {

                return donor;
            }
        }

        return null;
    }
    public boolean deleteDonorById(int id) {

        for (Donor donor : donorList) {

            if (donor.getDonorId() == id) {

                donorList.remove(donor);
                System.out.println("Donor Deleted Successfully!");
                return true;
            }
        }

        System.out.println("Donor Not Found!");
        return false;
    }public boolean updateDonorById(int id, String newName, String newBloodType) {

        for (Donor donor : donorList) {

            if (donor.getDonorId() == id) {

                donor.setName(newName);
                donor.setBloodType(newBloodType);

                System.out.println("Donor Updated Successfully!");
                return true;
            }
        }

        System.out.println("Donor Not Found!");
        return false;
    }
}