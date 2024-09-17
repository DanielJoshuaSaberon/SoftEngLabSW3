package LabSeatwork.Adapter;

import LabSeatwork.Adaptee.*;
import LabSeatwork.Target.*;

public class GradingSystemAdapter implements App {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public String integrateSystem() {
        return gradingSystem.recordGrades();
    }
}
