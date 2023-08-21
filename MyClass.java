import java.util.ArrayList;
import java.util.Scanner;

class PackersAndMovers {
    private int invoiceNo;
    private String fromCity;
    private String toCity;
    private String orderDate;
    private String deliveryDate;
    private double price;

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        PackersAndMovers[] packersAndMovers = new PackersAndMovers[4];
        for(int i = 0; i < packersAndMovers.length; i++) {
            PackersAndMovers pacAndMov = new PackersAndMovers();
            pacAndMov.setInvoiceNo(sc.nextInt());
            sc.nextLine();
            pacAndMov.setFromCity(sc.nextLine());
            pacAndMov.setToCity(sc.nextLine());
            pacAndMov.setOrderDate(sc.nextLine());
            pacAndMov.setDeliveryDate(sc.nextLine());
            pacAndMov.setPrice(sc.nextDouble());
            sc.nextLine();
            packersAndMovers[i] = pacAndMov;
        }
        */
        ArrayList<PackersAndMovers> packersAndMovers1 = new ArrayList<>();
        for(PackersAndMovers pam : packersAndMovers1) {
            PackersAndMovers pacAndMov = new PackersAndMovers();
            pacAndMov.setInvoiceNo(sc.nextInt());
            sc.nextLine();
            pacAndMov.setFromCity(sc.nextLine());
            pacAndMov.setToCity(sc.nextLine());
            pacAndMov.setOrderDate(sc.nextLine());
            pacAndMov.setDeliveryDate(sc.nextLine());
            pacAndMov.setPrice(sc.nextDouble());
            sc.nextLine();
            packersAndMovers1.add(pacAndMov);
        }

        String searchCity = sc.nextLine();

        int count = countOrdersDeliveredInAWeek(packersAndMovers1, searchCity);

        if(count > 0) {
            System.out.println(count);
        }
        else {
            System.out.println("No PackersAndMovers delivered within a week from the given city");
        }
    }

    private static int countOrdersDeliveredInAWeek(ArrayList<PackersAndMovers> packersAndMovers1, String searchCity) {
        int count = 0;
        /*
        for(int i = 0; i < packersAndMovers.length; i++) {
            PackersAndMovers pam = packersAndMovers[i];
            if(packersAndMovers[i].getFromCity().equalsIgnoreCase(searchCity)) {
                 int start = Integer.parseInt(packersAndMovers[i].getOrderDate().substring(0,2));
                 int end = Integer.parseInt(packersAndMovers[i].getDeliveryDate().substring(0, 2));
                 if(end - start < 7) {
                     count++;
                 }
            }
        }

         */

        for(PackersAndMovers i : packersAndMovers1) {
            PackersAndMovers pam = i;
            if(pam.getFromCity().equalsIgnoreCase(searchCity)) {
                int start = Integer.parseInt(pam.getOrderDate().substring(0, 2));
                int end = Integer.parseInt(pam.getDeliveryDate().substring(0, 2));
                if(end - start < 7) {
                    count++;
                }
            }
        }
        return count;
    }
}
