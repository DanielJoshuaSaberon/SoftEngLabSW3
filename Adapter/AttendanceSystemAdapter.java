package LabSeatwork.Adapter;

import LabSeatwork.Adaptee.*;
import LabSeatwork.Target.*;

public class AttendanceSystemAdapter implements App {

    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public String integrateSystem() {
        return attendanceSystem.markAttendance();
    }
}
