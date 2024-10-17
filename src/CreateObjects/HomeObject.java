package CreateObjects;
public class HomeObject {
    int bathroom = 12;
    int livingRoom;
    int bedroom;
    int kitchen;
    int diningRoom;
    boolean isvalid;

    public HomeObject(int bathroom, int livingRoom, int bedroom, int kitchen, int diningRoom) {
        if (bathroom <= 0 || livingRoom <= 0 || bedroom <= 0 || kitchen <= 0 || diningRoom <= 0) {
            isvalid = false;
            return;
        }
        isvalid = true;
        this.bathroom = bathroom;
        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;

    }

    public HomeObject(int livingRoom, int bedroom, int kitchen, int diningRoom) {
        if (livingRoom <= 0 || bedroom <= 0 || kitchen <= 0 || diningRoom <= 0) {
            isvalid = false;
            return;
        }
        this.isvalid = true;
        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
    }

    public HomeObject(HomeObject FirstHome) {
        this(FirstHome.bathroom, FirstHome.livingRoom, FirstHome.bedroom, FirstHome.kitchen, FirstHome.diningRoom);
    }

    public void printDetails(String homeName) {
        if (isvalid) {
            System.out.println(homeName + " Details:");
            System.out.println("Bathroom: " + bathroom);
            System.out.println("Living Room: " + livingRoom);
            System.out.println("Bedroom: " + bedroom);
            System.out.println("Kitchen: " + kitchen);
            System.out.println("Dining Room: " + diningRoom);
        } else {
            System.out.println(homeName + " has invalid initial values.");
        }

    }

    public static void main(String[] args) {
        HomeObject FirstHome = new HomeObject(-10, 2, 15, 12, 8);
        FirstHome.printDetails("First Home");

        HomeObject SecondHome = new HomeObject(10, 10, 28, 8, 9);
        SecondHome.printDetails("Second Home");

        HomeObject ThirdHome = new HomeObject(-10, 10, 28, 8, 10);
        ThirdHome.printDetails("Third Home");

        FirstHome = SecondHome;
        FirstHome.printDetails("First Home");

        HomeObject Duplicate = new HomeObject(ThirdHome);
        Duplicate.printDetails("Duplicate");


    }
}

