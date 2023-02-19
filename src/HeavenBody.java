import java.util.*;

public class HeavenBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenBody> satellites;
    
    public HeavenBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenBody moon) {
        return this.satellites.add(moon);
    }
    
}
