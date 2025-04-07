package com.babe.screens;

import com.babe.components.*;
import com.babe.theme.AppTheme;
import com.babe.model.UserProfile;
import com.babe.panels.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;

public class SettingsScreen extends JPanel {
    private final UserProfile userProfile;

    public SettingsScreen(UserProfile userProfile) {
        this.userProfile = userProfile;
        setupScreen();
    }

    private void setupScreen() {
        setLayout(new BorderLayout());
        setBackground(new Color(240, 247, 255));

        // Tạo panel chính với hiệu ứng shadow và gradient
        JPanel mainPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                // Vẽ gradient background với màu sắc mới
                GradientPaint gradient = new GradientPaint(0, 0, 
                    new Color(245, 250, 255), 0, getHeight(), 
                    new Color(235, 245, 255));
                g2d.setPaint(gradient);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
                
                // Vẽ shadow với hiệu ứng mềm mại hơn
                int shadowSize = 10;
                for (int i = 0; i < shadowSize; i++) {
                    float alpha = (shadowSize - i) * 2f / shadowSize;
                    g2d.setColor(new Color(0, 0, 0, (int)(alpha * 3)));
                    g2d.setStroke(new BasicStroke(1.5f));
                    g2d.drawRoundRect(i, i, getWidth() - i * 2 - 1, getHeight() - i * 2 - 1, 25, 25);
                }
                
                // Vẽ border với hiệu ứng gradient
                GradientPaint borderGradient = new GradientPaint(0, 0,
                    new Color(255, 255, 255, 180), getWidth(), getHeight(),
                    new Color(200, 220, 255, 180));
                g2d.setPaint(borderGradient);
                g2d.setStroke(new BasicStroke(1.5f));
                g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 25, 25);
                
                g2d.dispose();
            }
        };
        mainPanel.setOpaque(false);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Thêm top bar với hiệu ứng mới
        mainPanel.add(createTopBar(), BorderLayout.NORTH);

        // Tạo content panel với scroll
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Thêm các section với khoảng cách đẹp hơn
        contentPanel.add(new GeneralSettingsPanel(userProfile));
        contentPanel.add(Box.createVerticalStrut(40));
        contentPanel.add(new AccountSettingsPanel(userProfile));
        contentPanel.add(Box.createVerticalStrut(40));
        contentPanel.add(new SecurityPrivacyPanel(userProfile));

        // Tạo scroll pane với style mới
        JScrollPane scrollPane = new JScrollPane(contentPanel) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Vẽ background mờ
                g2d.setColor(new Color(255, 255, 255, 50));
                g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
                
                g2d.dispose();
            }
        };
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        
        // Tùy chỉnh thanh cuộn với style mới
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(100, 150, 255, 100);
                this.trackColor = new Color(240, 247, 255, 0);
                this.thumbDarkShadowColor = new Color(80, 120, 200);
                this.thumbLightShadowColor = new Color(120, 160, 255);
                this.thumbHighlightColor = new Color(160, 200, 255);
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return createZeroButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return createZeroButton();
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
                if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
                    return;
                }

                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                // Vẽ thumb với góc bo tròn và gradient
                GradientPaint gradient = new GradientPaint(
                    thumbBounds.x, thumbBounds.y, new Color(140, 180, 255, 100),
                    thumbBounds.x + thumbBounds.width, thumbBounds.y + thumbBounds.height,
                    new Color(100, 150, 255, 100));
                g2.setPaint(gradient);
                g2.fillRoundRect(thumbBounds.x, thumbBounds.y,
                        thumbBounds.width, thumbBounds.height, 10, 10);

                // Vẽ border cho thumb
                g2.setColor(new Color(255, 255, 255, 50));
                g2.setStroke(new BasicStroke(1.0f));
                g2.drawRoundRect(thumbBounds.x, thumbBounds.y,
                        thumbBounds.width - 1, thumbBounds.height - 1, 10, 10);

                g2.dispose();
            }

            private JButton createZeroButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                return button;
            }
        });

        mainPanel.add(scrollPane, BorderLayout.CENTER);
        add(mainPanel, BorderLayout.CENTER);
    }

    private JPanel createTopBar() {
        JPanel topBar = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Vẽ gradient background với màu sắc mới
                GradientPaint gradient = new GradientPaint(0, 0, 
                    new Color(255, 255, 255, 200), 0, getHeight(), 
                    new Color(245, 250, 255, 200));
                g2d.setPaint(gradient);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                
                // Vẽ border bottom với gradient
                GradientPaint borderGradient = new GradientPaint(
                    0, getHeight() - 2,
                    new Color(230, 240, 250, 100),
                    getWidth(), getHeight() - 2,
                    new Color(200, 220, 240, 100));
                g2d.setPaint(borderGradient);
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(20, getHeight() - 1, getWidth() - 20, getHeight() - 1);
                
                g2d.dispose();
            }
        };
        topBar.setOpaque(false);
        topBar.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        // Icon và tiêu đề với hiệu ứng mới
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        titlePanel.setOpaque(false);

        // Tạo icon với hiệu ứng hover
        JLabel iconLabel = new JLabel(createIcon("/com/img/settings.png"));
        iconLabel.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        iconLabel.setForeground(new Color(100, 100, 100));
        
        JLabel titleLabel = new JLabel("Cài đặt");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(40, 40, 40));

        titlePanel.add(iconLabel);
        titlePanel.add(titleLabel);
        topBar.add(titlePanel, BorderLayout.WEST);

        return topBar;
    }

    private ImageIcon createIcon(String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image image = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    // WrapLayout class
    class WrapLayout extends FlowLayout {
        public WrapLayout(int align, int hgap, int vgap) {
            super(align, hgap, vgap);
        }

        @Override
        public Dimension preferredLayoutSize(Container target) {
            return layoutSize(target, true);
        }

        @Override
        public Dimension minimumLayoutSize(Container target) {
            Dimension minimum = layoutSize(target, false);
            minimum.width -= (getHgap() + 1);
            return minimum;
        }

        private Dimension layoutSize(Container target, boolean preferred) {
            synchronized (target.getTreeLock()) {
                int targetWidth = target.getWidth();
                Container container = target;

                while (container.getSize().width == 0 && container.getParent() != null) {
                    container = container.getParent();
                }

                targetWidth = container.getSize().width;

                if (targetWidth == 0) {
                    targetWidth = Integer.MAX_VALUE;
                }

                int hgap = getHgap();
                int vgap = getVgap();
                Insets insets = target.getInsets();
                int horizontalInsetsAndGap = insets.left + insets.right + (hgap * 2);
                int maxWidth = targetWidth - horizontalInsetsAndGap;

                Dimension dim = new Dimension(0, 0);
                int rowWidth = 0;
                int rowHeight = 0;

                int nmembers = target.getComponentCount();
                for (int i = 0; i < nmembers; i++) {
                    Component m = target.getComponent(i);
                    if (m.isVisible()) {
                        Dimension d = preferred ? m.getPreferredSize() : m.getMinimumSize();
                        if (rowWidth + d.width > maxWidth) {
                            addRow(dim, rowWidth, rowHeight);
                            rowWidth = 0;
                            rowHeight = 0;
                        }
                        if (rowWidth != 0) {
                            rowWidth += hgap;
                        }
                        rowWidth += d.width;
                        rowHeight = Math.max(rowHeight, d.height);
                    }
                }
                addRow(dim, rowWidth, rowHeight);

                dim.width += horizontalInsetsAndGap;
                dim.height += insets.top + insets.bottom + vgap * 2;

                return dim;
            }
        }

        private void addRow(Dimension dim, int rowWidth, int rowHeight) {
            dim.width = Math.max(dim.width, rowWidth);
            if (dim.height > 0) {
                dim.height += getVgap();
            }
            dim.height += rowHeight;
        }
    }

    // Custom button với hiệu ứng đẹp
    private class ModernButton extends JButton {
        private boolean isHovered = false;
        private float hoverAlpha = 0f;
        private Timer hoverTimer;
        private Color primaryColor;
        private Color hoverColor;
        
        public ModernButton(String text, Color primaryColor) {
            super(text);
            this.primaryColor = primaryColor;
            this.hoverColor = new Color(
                Math.min(255, primaryColor.getRed() + 20),
                Math.min(255, primaryColor.getGreen() + 20),
                Math.min(255, primaryColor.getBlue() + 20)
            );
            
            setup();
        }
        
        private void setup() {
            setOpaque(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setContentAreaFilled(false);
            setFont(new Font("Segoe UI", Font.BOLD, 14));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            // Timer cho animation
            hoverTimer = new Timer(20, e -> {
                if (isHovered && hoverAlpha < 1f) {
                    hoverAlpha = Math.min(1f, hoverAlpha + 0.1f);
                    repaint();
                } else if (!isHovered && hoverAlpha > 0f) {
                    hoverAlpha = Math.max(0f, hoverAlpha - 0.1f);
                    repaint();
                } else {
                    ((Timer)e.getSource()).stop();
                }
            });
            
            // Mouse listeners
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    isHovered = true;
                    if (!hoverTimer.isRunning()) {
                        hoverTimer.start();
                    }
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    isHovered = false;
                    if (!hoverTimer.isRunning()) {
                        hoverTimer.start();
                    }
                }
            });
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
            // Tính toán màu hiện tại dựa trên trạng thái hover
            Color currentColor = new Color(
                (int) (primaryColor.getRed() * (1 - hoverAlpha) + hoverColor.getRed() * hoverAlpha),
                (int) (primaryColor.getGreen() * (1 - hoverAlpha) + hoverColor.getGreen() * hoverAlpha),
                (int) (primaryColor.getBlue() * (1 - hoverAlpha) + hoverColor.getBlue() * hoverAlpha)
            );
            
            // Vẽ background
            g2.setColor(currentColor);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
            
            // Vẽ text với màu đen và font đậm hơn
            g2.setColor(new Color(0, 0, 0));
            g2.setFont(new Font("Segoe UI", Font.BOLD, 15));
            FontMetrics fm = g2.getFontMetrics();
            int textX = (getWidth() - fm.stringWidth(getText())) / 2;
            int textY = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g2.drawString(getText(), textX, textY);
            
            g2.dispose();
        }
    }
    
    // Custom toggle switch với animation
    private class ToggleSwitch extends JComponent {
        private boolean selected = false;
        private float animationState = 0f;
        private Timer animationTimer;
        
        public ToggleSwitch() {
            setPreferredSize(new Dimension(50, 25));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            animationTimer = new Timer(20, e -> {
                if (selected && animationState < 1f) {
                    animationState = Math.min(1f, animationState + 0.1f);
                    repaint();
                } else if (!selected && animationState > 0f) {
                    animationState = Math.max(0f, animationState - 0.1f);
                    repaint();
                } else {
                    ((Timer)e.getSource()).stop();
                }
            });
            
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    selected = !selected;
                    if (!animationTimer.isRunning()) {
                        animationTimer.start();
                    }
                }
            });
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // Vẽ background
            g2.setColor(new Color(
                (int) (200 * (1 - animationState) + 100 * animationState),
                (int) (200 * (1 - animationState) + 150 * animationState),
                (int) (200 * (1 - animationState) + 255 * animationState)
            ));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
            
            // Vẽ nút toggle
            int diameter = getHeight() - 4;
            int x = (int) (2 + (getWidth() - diameter - 4) * animationState);
            g2.setColor(Color.WHITE);
            g2.fillOval(x, 2, diameter, diameter);
            
            g2.dispose();
        }
    }
} 