package com.group_finity.mascot.ui.debug;

import com.group_finity.mascot.Mascot;

public interface DebugUi {

    void update(Mascot mascot);

    void setAfterDisposeAction(Runnable action);

    void setVisible(boolean visible);

    void dispose();

}
