
package model;

import java.time.LocalDate;
import java.util.UUID;

public class Parcel {

    private final int parcelId;
    private final String customerName;
    private final int lockerId;
    private String status;
    private final LocalDate pickupDeadline;
    private final String qrCode;

    public Parcel(int parcelId, String customerName, int lockerId, LocalDate pickupDeadline) {
        this.parcelId = parcelId;
        this.customerName = customerName;
        this.lockerId = lockerId;
        this.pickupDeadline = pickupDeadline;
        this.status = "Registered";
        this.qrCode = generateQR();
    }

    private String generateQR() {
        return UUID.randomUUID().toString();
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void checkIfOverdue() {
        if (LocalDate.now().isAfter(pickupDeadline)) {
            this.status = "Overdue";
        }
    }

    
    public int getParcelId() { return parcelId; }
    public String getCustomerName() { return customerName; }
    public int getLockerId() { return lockerId; }
    public String getStatus() { return status; }
    public LocalDate getPickupDeadline() { return pickupDeadline; }
    public String getQrCode() { return qrCode; }
}
