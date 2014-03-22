package com.belsofto.vet.ui.action;

import org.slf4j.Logger;

import java.awt.event.ActionEvent;

import static org.slf4j.LoggerFactory.getLogger;

final class ReportOptionsAction extends AdvancedAbstractAction {
    private static final Logger LOGGER = getLogger(ReportOptionsAction.class);

    ReportOptionsAction() {
        setEnabled(false);
    }

    @Override public void actionPerformed(ActionEvent e) {
        // TODO: implement
        LOGGER.debug("application would be closed");
        System.exit(0);
    }
}