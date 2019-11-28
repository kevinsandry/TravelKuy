package travelkuy.main;

import travelkuy.controller.TravelkuyController;
import travelkuy.model.TravelkuyModel;
import travelkuy.view.TravelkuyView;

public class MainTravelkuy {

    public static void main(String[] args) {
        TravelkuyModel model = new TravelkuyModel();
        TravelkuyView view = new TravelkuyView();
        TravelkuyController controller = new TravelkuyController(model, view);

        controller.createView();

    }
}
