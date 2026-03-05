import model.Parcel;
import view.ParcelView;
import controller.ParcelController;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Parcel parcel = new Parcel(
                1001,
                "Ahmad Ali",
                5,
                LocalDate.now().plusDays(1)
        );

        ParcelView view = new ParcelView();
        ParcelController controller = new ParcelController(parcel, view);

        controller.showParcel();

        controller.updateParcelStatus("Delivered to Locker");
        controller.showParcel();

        controller.checkOverdue();
        controller.showParcel();
    }
}