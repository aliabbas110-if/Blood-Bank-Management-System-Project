package Model;

public class Donor
{
    private int donorId;
    private String name;
    private String bloodType;

    public int getDonorId() {
        return donorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public Donor(int donorId, String name, String bloodType)
    {
        this.donorId = donorId;
        this.name = name;
        this.bloodType = bloodType;
    }
    public void displayDonor() {

        System.out.println("ID: " + donorId);
        System.out.println("Name: " + name);
        System.out.println("Blood Type: " + bloodType);
    }
}
