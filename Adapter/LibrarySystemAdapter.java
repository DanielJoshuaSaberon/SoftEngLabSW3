package LabSeatwork.Adapter;

import LabSeatwork.Adaptee.*;
import LabSeatwork.Target.*;

public class LibrarySystemAdapter implements App {
    public LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public String integrateSystem() {
        return librarySystem.manageBooks();
    }
}
