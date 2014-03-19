package by.bsu.fpmi.vet.ui.composite;

import by.bsu.fpmi.vet.ui.component.TitledPanel;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import static by.bsu.fpmi.vet.util.MessageUtils.getMessage;

public final class ControlPanel extends TitledPanel {
    private final JButton enhancementButton =
            new JButton(getMessage("ui.panel.control.button.videoImageEnhancementControls"));
    private final JButton playMovementButton =
            new JButton(getMessage("ui.panel.control.button.playAllFramesWithMovement"));
    private final JButton playSoundButton = new JButton(getMessage("ui.panel.control.button.playAllFramesWithSound"));

    public ControlPanel() {
        super(getMessage("ui.panel.control.title"));
        arrangeComponents();
    }

    private void configureComponents() {

    }

    private void arrangeComponents() {
        JPanel content = getContent();
        content.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        content.add(enhancementButton, gbc);

        gbc.gridy = 1;
        content.add(playMovementButton, gbc);

        gbc.gridy = 2;
        content.add(playSoundButton, gbc);
    }
}
