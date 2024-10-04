import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private int previousReading;
    private int currentReading;
    private String connectionType;

    public ElectricityBill(String consumerNo, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public int calculateUnitsUsed() {
        return currentReading - previousReading;
    }

    public double calculateBill() {
        int unitsUsed = calculateUnitsUsed();
        double billAmount = 0.0;

        if (connectionType.equalsIgnoreCase("Domestic")) {
            if (unitsUsed <= 100) {
                billAmount = unitsUsed * 1;
            } else if (unitsUsed <= 200) {
                billAmount = 100 * 1 + (unitsUsed - 100) * 2.5;
            } else if (unitsUsed <= 500) {
                billAmount = 100 * 1 + 100 * 2.5 + (unitsUsed - 200) * 4;
            } else {
                billAmount = 100 * 1 + 100 * 2.5 + 300 * 4 + (unitsUsed - 500) * 6;
            }
        } else if (connectionType.equalsIgnoreCase("Commercial")) {
            if (unitsUsed <= 100) {
                billAmount = unitsUsed * 2;
            } else if (unitsUsed <= 200) {
                billAmount = 100 * 2 + (unitsUsed - 100) * 4.5;
            } else if (unitsUsed <= 500) {
                billAmount = 100 * 2 + 100 * 4.5 + (unitsUsed - 200) * 6;
            } else {
                billAmount = 100 * 2 + 100 * 4.5 + 300 * 6 + (unitsUsed - 500) * 7;
            }
        } else {
            System.out.println("Invalid connection type");
        }

        return billAmount;
    }

    public void displayBill() {
        System.out.println("Electricity Bill Details:");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Reading: " + previousReading + " units");
        System.out.println("Current Reading: " + currentReading + " units");
        System.out.println("Units Used: " + calculateUnitsUsed() + " units");
        System.out.printf("Total Bill Amount: Rs %.2f%n", calculateBill());
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentReading = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter Type of EB Connection (Domestic/Commercial): ");
        String connectionType = scanner.nextLine();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill();

        scanner.close();
    }
}
