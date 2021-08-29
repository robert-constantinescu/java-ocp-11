package cJavaObjectOrientedApproach.m7.demo.usingEnums.aircraft;

public enum WakeTurbulence {
    LIGHT(60),
    MEDIUM(90),
    HEAVY(110),
    SUPER(180);

    private int timeOffSet;

    WakeTurbulence(int timeOffSet) {
        this.timeOffSet = timeOffSet;
    }

    public int getTimeOffSet() {
        return timeOffSet;
    }
}
