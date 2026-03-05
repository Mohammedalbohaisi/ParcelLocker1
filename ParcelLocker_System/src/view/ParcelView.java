
package view;

import model.Parcel;

public class ParcelView {

    public void displayParcelDetails(Parcel parcel) {
        System.out.println("----- Parcel Details -----");
        System.out.println("Parcel ID: " + parcel.getParcelId());
        System.out.println("Customer: " + parcel.getCustomerName());
        System.out.println("Locker ID: " + parcel.getLockerId());
        System.out.println("Status: " + parcel.getStatus());
        System.out.println("Pickup Deadline: " + parcel.getPickupDeadline());
        System.out.println("QR Code: " + parcel.getQrCode());
        System.out.println("---------------------------");
    }
}
