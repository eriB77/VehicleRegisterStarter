package hu.erikabirtha;

public class Main {
    public static void main(String[] args) {
        //interactor
        VehiclePersistence vp = new FileStorage();

        Contoller contoller = new Contoller();
        View view = new View(contoller);
        Display presenter = new UIPresenter(view);
        VehicleRegisterAPI vehicleRegisterInteractor = new VehicleRegisterInteractor(vp, presenter);

        contoller.registerVehicle(vehicleRegisterInteractor);

        view.mainLoop();
    }
}
//console run