public class JedliksToyCar {
    int battery = 100;
    int meters = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery != 0) {
            battery -= 1;
            meters += 20;
        }
    }
}
