public class Military extends Air {
    private boolean hasEjectionSystem;
    private int missileCount;

    public Military(double power, double maxspeed, double weight, String brand, double wingspan, double runwayLength, boolean hasEjectionSystem, int missileCount) {
        super(power, maxspeed, weight, brand, wingspan, runwayLength);
        this.hasEjectionSystem = hasEjectionSystem;
        this.missileCount = missileCount;
    }

    private void shoot(){
        Military military = new military();
        if (military.missileCount !=0){
            System.out.println("Ракета пошла");
        }
        else {
            System.out.println("Боеприпасы отсутствуют");
        }

        private void eject(){
                if (military.hasEjectionSystem){
                System.out.println("Катапультирование прошло успешно");
            }
            else {
                System.out.println("У вас нет такой системы");
            }


    }
    public String getDescription() {
        return super.getDescription() + String.format("hasEjectionSystem is %s missileCount is %s ", hasEjectionSystem, missileCount);
    }
}
