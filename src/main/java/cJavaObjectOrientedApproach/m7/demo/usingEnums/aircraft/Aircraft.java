package cJavaObjectOrientedApproach.m7.demo.usingEnums.aircraft;

public class Aircraft {

    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modeADecimal;

    public Aircraft(int modeADecimal, String model, WakeTurbulence wakeTurbulence) {
        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modeADecimal = modeADecimal;
    }

    public int getModeADecimal() {
        return modeADecimal;
    }

    public String getModel() {
        return model;
    }

    public WakeTurbulence getWakeTurbulence() {
        return wakeTurbulence;
    }
}
