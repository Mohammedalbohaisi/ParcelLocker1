package controller;

import model.Parcel;
import view.ParcelView;

public class ParcelController {

    private final Parcel model;
    private final ParcelView view;

    public ParcelController(Parcel model, ParcelView view) {
        this.model = model;
        this.view = view;
    }

    public void updateParcelStatus(String status) {
        model.updateStatus(status);
    }

    public void checkOverdue() {
        model.checkIfOverdue();
    }

    public void showParcel() {
        view.displayParcelDetails(model);
    }
}
