import java.util.HashMap;

class ParkingSystem {
    HashMap<Integer,Integer> map = new HashMap<>();
    public ParkingSystem(int big, int medium, int small) {
        map.put(1,big);
        map.put(2,medium);
        map.put(3,small);
    }

    public boolean addCar(int carType) {
        boolean result = false;
        if (map.containsKey(carType) && map.get(carType) > 0){
            result = true;
            int value = map.get(carType);
            map.replace(carType,value-1);
        }
        return result;
    }

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(2,1,1);
        boolean param_1 = obj.addCar(1);
        boolean param_2 = obj.addCar(2);
        boolean param_3 = obj.addCar(3);
        boolean param_4 = obj.addCar(1);
        boolean param_5 = obj.addCar(1);
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */