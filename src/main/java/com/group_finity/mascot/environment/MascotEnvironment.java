package com.group_finity.mascot.environment;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.NativeFactory;

import java.awt.Point;

public class MascotEnvironment {

    private final Environment impl = NativeFactory.getInstance().getEnvironment();

    private final Mascot mascot;

    private Area currentWorkArea;

    public MascotEnvironment(Mascot mascot) {
        this.mascot = mascot;
    }

    public Area getWorkArea() {
        return getWorkArea(false);
    }

    public Area getWorkArea(Boolean ignoreSettings) {
        if (currentWorkArea != null) {
            if (ignoreSettings || Main.getInstance().isMultiscreenAllowed()) {
                // NOTE Windows
                if (currentWorkArea != impl.getWorkArea() && currentWorkArea.toRectangle().contains(impl.getWorkArea().toRectangle())) {
                    if (impl.getWorkArea().contains(mascot.getAnchor().x, mascot.getAnchor().y)) {
                        currentWorkArea = impl.getWorkArea();
                        return currentWorkArea;
                    }
                }

                // NOTE
                if (currentWorkArea.contains(mascot.getAnchor().x, mascot.getAnchor().y)) {
                    return currentWorkArea;
                }
            } else {
                return currentWorkArea;
            }
        }

        if (impl.getWorkArea().contains(mascot.getAnchor().x, mascot.getAnchor().y)) {
            currentWorkArea = impl.getWorkArea();
            return currentWorkArea;
        }

        for (Area area : impl.getScreens()) {
            if (area.contains(mascot.getAnchor().x, mascot.getAnchor().y)) {
                currentWorkArea = area;
                return currentWorkArea;
            }
        }

        currentWorkArea = impl.getWorkArea();
        return currentWorkArea;
    }

    public Area getActiveIE() {
        return impl.getActiveIE();
    }

    public String getActiveIETitle() {
        return impl.getActiveIETitle();
    }

    public Border getCeiling() {
        return getCeiling(false);
    }

    public Border getCeiling(boolean ignoreSeparator) {
        if (getActiveIE().getBottomBorder().isOn(mascot.getAnchor())) {
            return getActiveIE().getBottomBorder();
        }
        if (getWorkArea().getTopBorder().isOn(mascot.getAnchor())) {
            if (!ignoreSeparator || isScreenTopBottom()) {
                return getWorkArea().getTopBorder();
            }
        }
        return NotOnBorder.INSTANCE;
    }

    public ComplexArea getComplexScreen() {
        return impl.getComplexScreen();
    }

    public Location getCursor() {
        return impl.getCursor();
    }

    public Border getFloor() {
        return getFloor(false);
    }

    public Border getFloor(boolean ignoreSeparator) {
        if (getActiveIE().getTopBorder().isOn(mascot.getAnchor())) {
            return getActiveIE().getTopBorder();
        }
        if (getWorkArea().getBottomBorder().isOn(mascot.getAnchor())) {
            if (!ignoreSeparator || isScreenTopBottom()) {
                return getWorkArea().getBottomBorder();
            }
        }
        return NotOnBorder.INSTANCE;
    }

    public Area getScreen() {
        return impl.getScreen();
    }

    public Border getWall() {
        return getWall(false);
    }

    public Border getWall(boolean ignoreSeparator) {
        Border ieWall = mascot.isLookRight() ? getActiveIE().getLeftBorder() : getActiveIE().getRightBorder();
        if (ieWall.isOn(mascot.getAnchor())) {
            return ieWall;
        }

        Border screenWall = mascot.isLookRight() ? getWorkArea().getRightBorder() : getWorkArea().getLeftBorder();
        if (screenWall.isOn(mascot.getAnchor())) {
            if (!ignoreSeparator || isScreenLeftRight()) {
                return screenWall;
            }
        }

        return NotOnBorder.INSTANCE;
    }

    public void moveActiveIE(Point point) {
        impl.moveActiveIE(point);
    }


    /**
     * Doesn't do anything. Left for script compatibility.
     */
    @Deprecated
    public void restoreIE() {}

    /**
     * Doesn't do anything. Left for script compatibility
     */
    @Deprecated
    public void refreshWorkArea() {}

    private boolean isScreenTopBottom() {
        return impl.isScreenTopBottom(mascot.getAnchor());
    }

    private boolean isScreenLeftRight() {
        return impl.isScreenLeftRight(mascot.getAnchor());
    }

}
