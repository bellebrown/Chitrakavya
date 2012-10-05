/*
 * InformationExtractionView.java
 */
package informationextraction;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import tagger.TaggerApp;
import tagger.Translate;
import xmlparse.XMLParser;

public class InformationExtractionView extends FrameView {

    public InformationExtractionView(SingleFrameApplication app) {
        super(app);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        XMLParserButton = new javax.swing.JButton();
        TaggerButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AuthorButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jSpinner1 = new javax.swing.JSpinner();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(informationextraction.InformationExtractionApp.class).getContext().getResourceMap(InformationExtractionView.class);
        mainPanel.setFont(resourceMap.getFont("mainPanel.font")); // NOI18N
        mainPanel.setName("mainPanel"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        XMLParserButton.setText(resourceMap.getString("XMLParserButton.text")); // NOI18N
        XMLParserButton.setName("XMLParserButton"); // NOI18N
        XMLParserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XMLParserButtonActionPerformed(evt);
            }
        });

        TaggerButton.setText(resourceMap.getString("TaggerButton.text")); // NOI18N
        TaggerButton.setName("TaggerButton"); // NOI18N
        TaggerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaggerButtonActionPerformed(evt);
            }
        });

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        AuthorButton.setText(resourceMap.getString("AuthorButton.text")); // NOI18N
        AuthorButton.setName("AuthorButton"); // NOI18N
        AuthorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(XMLParserButton)
                        .addGap(18, 18, 18)
                        .addComponent(TaggerButton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(AuthorButton)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(XMLParserButton)
                            .addComponent(TaggerButton)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AuthorButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        menuBar.setName("menuBar"); // NOI18N

        jSpinner1.setName("jSpinner1"); // NOI18N

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    private void XMLParserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XMLParserButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);
        File file = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
        XMLParser obj = new XMLParser();
        int a = obj.convert(file.getName());
        if (a == 1) {
            JOptionPane.showMessageDialog(fc, "Conversion success!");
        }
    }//GEN-LAST:event_XMLParserButtonActionPerformed

    private void AuthorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Authors: \nRamachandra Kousik A S! \nHariharan B \nVamsi Krishna B\nIIIT, Bangalore");
    }//GEN-LAST:event_AuthorButtonActionPerformed

    private void TaggerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaggerButtonActionPerformed
        TaggerApp t = new TaggerApp();
        t.setTitle("Information Extraction - Tagger");
        t.show();
    }//GEN-LAST:event_TaggerButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuthorButton;
    private javax.swing.JButton TaggerButton;
    private javax.swing.JButton XMLParserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
