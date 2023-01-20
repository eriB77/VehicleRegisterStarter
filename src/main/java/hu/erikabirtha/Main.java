package hu.erikabirtha;

public class Main {
    public static void main(String[] args) {
        //interactor
        VehiclePersistence vp = new FileStorage();
        Display presenter = new UIPresenter();
        Contoller contoller = new Contoller();

        VehicleRegisterAPI vehicleRegisterInteractor = new VehicleRegisterInteractor(vp, presenter);

        contoller.setVehicleRegister(vehicleRegisterInteractor);
        contoller.mainLoop();
    }
}
//console run