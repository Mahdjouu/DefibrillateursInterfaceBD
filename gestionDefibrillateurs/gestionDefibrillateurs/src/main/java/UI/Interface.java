package UI;

import database.Connexion;
import mapping.Defibrillateur;

import java.awt.*;
import java.util.List;

/**
 * @author Arthur
 */

public class Interface extends javax.swing.JFrame {

    private String password;
    private Connexion connexion;
    private enum Etat {
            EDIT, ADD, DELETE
    }
    private Etat etat;

    public Interface(Connexion connexion, String password) {
        System.setProperty( "file.encoding", "UTF-8" );
        this.connexion = connexion;
        this.password = password;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        List<String> stringList;
        List<Defibrillateur> defibfillateurList;


        java.awt.GridBagConstraints gridBagConstraints;

        dialogPassword = new javax.swing.JDialog();
        btnAnnulerPwd = new javax.swing.JButton();
       	btnValiderPwd = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        formFrame = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        formId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        formCoord = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        formNomSite = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        formAdresse = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        formCommune = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        formEmplacement = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        formDispositif = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        formTypeStruct = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnConfirmer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        formCategorie = new javax.swing.JTextField();
        formAccessibilite = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDefibrillateurs = new javax.swing.JTable();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboTypeStruct = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboCategorie = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboAccessibilite = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboTypeDispo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        radioCoord = new javax.swing.JRadioButton();
        radioFiltres = new javax.swing.JRadioButton();
        btnRechercher = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textLatitude = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textLongitude = new javax.swing.JTextField();
        nbResults = new javax.swing.JTextField();


        formFrame.setMinimumSize(new java.awt.Dimension(400, 450));
        formFrame.setPreferredSize(new java.awt.Dimension(750, 500));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setMinimumSize(new java.awt.Dimension(350, 375));
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 375));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("id :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 7, 0, 8);
        jPanel8.add(jLabel3, gridBagConstraints);

        formId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        formId.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        formId.setText("150");
        formId.setEnabled(false);
        formId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formIdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 4, 0);
        jPanel8.add(formId, gridBagConstraints);

        jLabel5.setText("Coordonnees :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel5, gridBagConstraints);

        formCoord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        formCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formCoordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 6);
        jPanel8.add(formCoord, gridBagConstraints);

        jLabel10.setText("Nom du site :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel10, gridBagConstraints);

        formNomSite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 6);
        jPanel8.add(formNomSite, gridBagConstraints);

        jLabel11.setText("Adresse :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel11, gridBagConstraints);
        formAdresse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 6);
        jPanel8.add(formAdresse, gridBagConstraints);

        jLabel12.setText("Commune :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel12, gridBagConstraints);
        formCommune.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 6);
        jPanel8.add(formCommune, gridBagConstraints);

        jLabel13.setText("Emplacement :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel13, gridBagConstraints);
        formEmplacement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 6);
        jPanel8.add(formEmplacement, gridBagConstraints);

        jLabel14.setText("Type de dispositif :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel14, gridBagConstraints);

        formDispositif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N


        /*
                ####################    REQUETE    ####################
         */

        stringList = connexion.getTypeDispo();
        String[] formDispositifModel = new String[stringList.size()];
        for(int i = 0; i < formDispositifModel.length; i++)
            formDispositifModel[i] = stringList.get(i);

        formDispositif.setModel(new javax.swing.DefaultComboBoxModel<>(formDispositifModel));
        formDispositif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDispositifActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 6);
        jPanel8.add(formDispositif, gridBagConstraints);

        jLabel15.setText("Type de structure :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel15, gridBagConstraints);

        formTypeStruct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N


        /*
                ####################    REQUETE    ####################
         */

        stringList = connexion.getTypeStruct();
        String[] formTypeStructModel = new String[stringList.size()];
        for(int i = 0; i < formTypeStructModel.length; i++)
            formTypeStructModel[i] = stringList.get(i);

        formTypeStruct.setModel(new javax.swing.DefaultComboBoxModel<>(formTypeStructModel));
        formTypeStruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formTypeStructActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 6);
        jPanel8.add(formTypeStruct, gridBagConstraints);

        jLabel16.setText("Categorie de structure :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel16, gridBagConstraints);

        jLabel17.setText("Accessibilite :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel8.add(jLabel17, gridBagConstraints);

        btnConfirmer.setBackground(new java.awt.Color(51, 153, 255));
        btnConfirmer.setText("Confirmer");
        btnConfirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(15, 2, 8, 5);
        jPanel8.add(btnConfirmer, gridBagConstraints);

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 8, 2);
        jPanel8.add(btnAnnuler, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel18.setText("Saisir les informations du defibrillateurs :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(12, 16, 7, 10);
        jPanel8.add(jLabel18, gridBagConstraints);

        formCategorie.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 4, 6);
        jPanel8.add(formCategorie, gridBagConstraints);

        formAccessibilite.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 4, 6);
        jPanel8.add(formAccessibilite, gridBagConstraints);


        javax.swing.GroupLayout formFrameLayout = new javax.swing.GroupLayout(formFrame.getContentPane());
        formFrame.getContentPane().setLayout(formFrameLayout);
        formFrameLayout.setHorizontalGroup(
                formFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        formFrameLayout.setVerticalGroup(
                formFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        dialogPassword.setTitle("Confirmer mot de passe");
        dialogPassword.setMinimumSize(new Dimension(400, 200));
        dialogPassword.setResizable(false);
        dialogPassword.setLocationRelativeTo(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 164, 249), 2, true));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Veuillez entrer le mot de passe pour confirmer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 21, 11, 21);
        jPanel2.add(jLabel20, gridBagConstraints);

        btnAnnulerPwd.setText("Annuler");
        btnAnnulerPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerPwdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(btnAnnulerPwd, gridBagConstraints);

        btnValiderPwd.setBackground(new java.awt.Color(0, 153, 255));
        btnValiderPwd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnValiderPwd.setText("Confirmer");
        btnValiderPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderPwdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(btnValiderPwd, gridBagConstraints);

        passwordField.setForeground(new java.awt.Color(255, 0, 0));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 18);
        jPanel2.add(passwordField, gridBagConstraints);


        javax.swing.GroupLayout dialogPasswordLayout = new javax.swing.GroupLayout(dialogPassword.getContentPane());
        dialogPassword.getContentPane().setLayout(dialogPasswordLayout);
        dialogPasswordLayout.setHorizontalGroup(
                dialogPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dialogPasswordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        dialogPasswordLayout.setVerticalGroup(
                dialogPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dialogPasswordLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des defibrillateurs");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 420));
        setPreferredSize(new java.awt.Dimension(1250, 450));
        setSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(360, 358));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setAutoscrolls(true);


        /*
                ####################    REQUETE    ####################
         */

        defibfillateurList = connexion.getDefibrillateursFiltres("","","","");
        String[][] tableDefibrillateursModel = new String[defibfillateurList.size()][4];
        for(int i = 0; i < tableDefibrillateursModel.length; i++) {
            tableDefibrillateursModel[i][0] = String.valueOf(defibfillateurList.get(i).getId());
            tableDefibrillateursModel[i][1] = defibfillateurList.get(i).getAdresse();
            tableDefibrillateursModel[i][2] = defibfillateurList.get(i).getNomSite();
            tableDefibrillateursModel[i][3] = defibfillateurList.get(i).getEmplacement();
        }

        tableDefibrillateurs.setModel(new javax.swing.table.DefaultTableModel(
                tableDefibrillateursModel,
                new String[]{
                        "id", "Adresse", "Nom_Site", "Emplacement"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDefibrillateurs.setRowHeight(18);
        tableDefibrillateurs.setSelectionBackground(new java.awt.Color(70, 182, 255));
        tableDefibrillateurs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDefibrillateurs.setShowGrid(true);
        jScrollPane2.setViewportView(tableDefibrillateurs);
        if (tableDefibrillateurs.getColumnModel().getColumnCount() > 0) {
            tableDefibrillateurs.getColumnModel().getColumn(0).setMinWidth(20);
            tableDefibrillateurs.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableDefibrillateurs.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel4, gridBagConstraints);

        btnSupprimer.setBackground(new java.awt.Color(255, 102, 102));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.setPreferredSize(new java.awt.Dimension(100, 23));
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel1.add(btnSupprimer, gridBagConstraints);

        btnModifier.setBackground(new java.awt.Color(255, 255, 51));
        btnModifier.setText("Details / Modifier");
        btnModifier.setPreferredSize(new java.awt.Dimension(100, 23));
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel1.add(btnModifier, gridBagConstraints);

        btnAjouter.setBackground(new java.awt.Color(51, 153, 255));
        btnAjouter.setText("Ajouter");
        btnAjouter.setPreferredSize(new java.awt.Dimension(100, 23));
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel1.add(btnAjouter, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Type de structure : ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 4, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        comboTypeStruct.setEditable(true);


        /*
                ####################    REQUETE    ####################
         */

        stringList = connexion.getTypeStruct();
        String[] comboTypeStructModel = new String[stringList.size()+1];
        comboTypeStructModel[0] = "";
        for(int i = 1; i < comboTypeStructModel.length; i++)
            comboTypeStructModel[i] = stringList.get(i-1);

        comboTypeStruct.setModel(new javax.swing.DefaultComboBoxModel<>(comboTypeStructModel));
        comboTypeStruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeStructActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 6);
        jPanel1.add(comboTypeStruct, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Categorie de structure : ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 4, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        comboCategorie.setEditable(true);


        /*
                ####################    REQUETE    ####################
         */

        stringList = connexion.getCategorieStruct();
        String[] comboCategorieModel = new String[stringList.size()+1];
        comboCategorieModel[0] = "";
        for(int i = 1; i < comboCategorieModel.length; i++)
            comboCategorieModel[i] = stringList.get(i-1);

        comboCategorie.setModel(new javax.swing.DefaultComboBoxModel<>(comboCategorieModel));
        comboCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategorieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 6);
        jPanel1.add(comboCategorie, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Accessibilite : ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 4, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        comboAccessibilite.setEditable(true);


        /*
                ####################    REQUETE    ####################
         */

        stringList = connexion.getAccessibilite();
        String[] comboAccessibiliteModel = new String[stringList.size()+1];
        comboAccessibiliteModel[0] = "";
        for(int i = 1; i < comboAccessibiliteModel.length; i++)
            comboAccessibiliteModel[i] = stringList.get(i-1);

        comboAccessibilite.setModel(new javax.swing.DefaultComboBoxModel<>(comboAccessibiliteModel));
        comboAccessibilite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAccessibiliteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 6);
        jPanel1.add(comboAccessibilite, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Type de dispositif : ");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 9, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        comboTypeDispo.setEditable(true);


        /*
                ####################    REQUETE    ####################
         */

        stringList = connexion.getTypeDispo();
        String[] comboTypeDispoModel = new String[stringList.size()+1];
        comboTypeDispoModel[0] = "";
        for(int i = 1; i < comboTypeDispoModel.length; i++)
            comboTypeDispoModel[i] = stringList.get(i-1);

        comboTypeDispo.setModel(new javax.swing.DefaultComboBoxModel<>(comboTypeDispoModel));
        comboTypeDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeDispoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 6, 6);
        jPanel1.add(comboTypeDispo, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Liste des defibrillateurs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        radioCoord.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioCoord);
        radioCoord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCoord.setText("Par coordonnees");
        radioCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCoordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 9, 0);
        jPanel1.add(radioCoord, gridBagConstraints);

        radioFiltres.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioFiltres);
        radioFiltres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioFiltres.setSelected(true);
        radioFiltres.setText("Par filtres");
        radioFiltres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFiltresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 9, 0);
        jPanel1.add(radioFiltres, gridBagConstraints);

        btnRechercher.setBackground(new java.awt.Color(0, 204, 0));
        btnRechercher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 3);
        jPanel1.add(btnRechercher, gridBagConstraints);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 11, 0, 5);
        jPanel1.add(jSeparator1, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Recherche");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel1.add(jLabel19, gridBagConstraints);

        jLabel6.setText("x : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 4, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        textLatitude.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 6);
        jPanel1.add(textLatitude, gridBagConstraints);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("y : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        textLongitude.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        jPanel1.add(textLongitude, gridBagConstraints);

        nbResults.setEditable(false);
        nbResults.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbResults.setText(tableDefibrillateurs.getRowCount() + " resultats");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(nbResults, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="ActionPerformed Methods">

    private void radioCoordActionPerformed(java.awt.event.ActionEvent evt) {
        textLatitude.setEditable(true);
        textLongitude.setEditable(true);
        comboTypeStruct.setEnabled(false);
        comboCategorie.setEnabled(false);
        comboTypeDispo.setEnabled(false);
        comboAccessibilite.setEnabled(false);
    }

    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {
        refreshTable();
    }

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {
        if (tableDefibrillateurs.getSelectedRowCount() == 1) {
            resetForm();
            formFrame.setTitle("Modification d'un defibrillateur");
            formFrame.pack();
            formFrame.setLocationRelativeTo(this);
            formFrame.setVisible(true);
            int id = Integer.valueOf((String)tableDefibrillateurs.getValueAt(tableDefibrillateurs.getSelectedRow(),0));
            Defibrillateur defibrillateur = connexion.getDefibrillateurInfos(id);

            formId.setText(String.valueOf(id));
            formCoord.setText(defibrillateur.getGeoPoint());
            formNomSite.setText(defibrillateur.getNomSite());
            formAdresse.setText(defibrillateur.getAdresse());
            formCommune.setText(defibrillateur.getCommune());
            formEmplacement.setText(defibrillateur.getEmplacement());
            formDispositif.setSelectedItem(defibrillateur.getTypeDispositif());
            formTypeStruct.setSelectedItem(defibrillateur.getStructure().getTypeStructure());
            formCategorie.setText(defibrillateur.getStructure().getCategorieStructure());
            formAccessibilite.setText(defibrillateur.getStructure().getAccessibilite());
            this.etat = Etat.EDIT;
        }
    }

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {
        if(tableDefibrillateurs.getSelectedRowCount() == 1) {
            dialogPassword.pack();
            dialogPassword.setLocationRelativeTo(this);
            dialogPassword.setVisible(true);
            this.etat = Etat.DELETE;
        }
    }

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {
        resetForm();
        formId.setText(String.valueOf(connexion.getMaxId()+1));
        formFrame.setTitle("Ajout d'un defibrillateur");
        formFrame.pack();
        formFrame.setLocationRelativeTo(this);
        formFrame.setVisible(true);
        this.etat = Etat.ADD;
    }

    private void radioFiltresActionPerformed(java.awt.event.ActionEvent evt) {
        textLatitude.setEditable(false);
        textLongitude.setEditable(false);
        comboTypeStruct.setEnabled(true);
        comboCategorie.setEnabled(true);
        comboTypeDispo.setEnabled(true);
        comboAccessibilite.setEnabled(true);
    }

    private void formTypeStructActionPerformed(java.awt.event.ActionEvent evt) {
        String[] strings = connexion.getCatAccessByType(formTypeStruct.getSelectedItem().toString());
        formCategorie.setText(strings[0]);
        formAccessibilite.setText(strings[1]);
    }

    private void btnConfirmerActionPerformed(java.awt.event.ActionEvent evt) {
        dialogPassword.setVisible(true);
    }

    private void btnAnnulerPwdActionPerformed(java.awt.event.ActionEvent evt) {
        dialogPassword.setVisible(false);
        passwordField.setText("");
    }

    private void btnValiderPwdActionPerformed(java.awt.event.ActionEvent evt) {
        if(!passwordField.getText().equals(password)) {
            passwordField.setText("Incorrect password ! Try \"sibd2020\"");
        }
        else {
            switch (etat) {
                case ADD:
                    connexion.addDefibrilateur(Integer.valueOf(formId.getText()), formCoord.getText(),
                            formNomSite.getText(), formAdresse.getText(), formCommune.getText(),
                            formEmplacement.getText(), formDispositif.getSelectedItem().toString(),
                            formTypeStruct.getSelectedItem().toString());
                    break;

                case EDIT:
                    connexion.updateDefibrillateur(Integer.valueOf(formId.getText()), formCoord.getText(),
                            formNomSite.getText(), formAdresse.getText(), formCommune.getText(),
                            formEmplacement.getText(), formDispositif.getSelectedItem().toString(),
                            formTypeStruct.getSelectedItem().toString());
                    break;

                case DELETE:
                    connexion.deleteDefibrillateur(Integer.valueOf((String)tableDefibrillateurs.getValueAt(tableDefibrillateurs.getSelectedRow(),0)));
                    break;
            }

            dialogPassword.setVisible(false);
            formFrame.setVisible(false);
            passwordField.setText("");
            refreshTable();
        }
    }

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {
        formFrame.setVisible(false);
    }

    private void comboTypeStructActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void formIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void formCoordActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void comboCategorieActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void comboAccessibiliteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void comboTypeDispoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void formDispositifActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // </editor-fold>


    private void resetForm() {
        formAdresse.setText("");
        formCommune.setText("");
        formCoord.setText("");
        formEmplacement.setText("");
        formId.setText("");
        formNomSite.setText("");
        formAccessibilite.setText("");
        formCategorie.setText("");
        formDispositif.setSelectedIndex(0);
        formTypeStruct.setSelectedIndex(0);
    }

    public void refreshTable() {
        if(radioFiltres.isSelected()) {

            List<Defibrillateur> defibfillateurList = connexion.getDefibrillateursFiltres(comboTypeDispo.getSelectedItem().toString(), comboTypeStruct.getSelectedItem().toString(), comboCategorie.getSelectedItem().toString(), comboAccessibilite.getSelectedItem().toString());
            String[][] tableDefibrillateursModel = new String[defibfillateurList.size()][4];
            for (int i = 0; i < tableDefibrillateursModel.length; i++) {
                tableDefibrillateursModel[i][0] = String.valueOf(defibfillateurList.get(i).getId());
                tableDefibrillateursModel[i][1] = defibfillateurList.get(i).getAdresse();
                tableDefibrillateursModel[i][2] = defibfillateurList.get(i).getNomSite();
                tableDefibrillateursModel[i][3] = defibfillateurList.get(i).getEmplacement();
            }

            tableDefibrillateurs.setModel(new javax.swing.table.DefaultTableModel(
                    tableDefibrillateursModel,
                    new String[]{
                            "id", "Adresse", "Nom_Site", "Emplacement"
                    }
            ) {
                Class[] types = new Class[]{
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                        false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
        }

        else if(radioCoord.isSelected()) {

            List<Defibrillateur> defibfillateurList = connexion.getDefibrillateursCoords(textLatitude.getText(), textLongitude.getText());
            String[][] tableDefibrillateursModel = new String[defibfillateurList.size()][4];
            for (int i = 0; i < tableDefibrillateursModel.length; i++) {
                tableDefibrillateursModel[i][0] = String.valueOf(defibfillateurList.get(i).getId());
                tableDefibrillateursModel[i][1] = defibfillateurList.get(i).getAdresse();
                tableDefibrillateursModel[i][2] = defibfillateurList.get(i).getNomSite();
                tableDefibrillateursModel[i][3] = defibfillateurList.get(i).getEmplacement();
            }

            tableDefibrillateurs.setModel(new javax.swing.table.DefaultTableModel(
                    tableDefibrillateursModel,
                    new String[]{
                            "id", "Adresse", "Nom_Site", "Emplacement"
                    }
            ) {
                Class[] types = new Class[]{
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                        false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

        }
        nbResults.setText(tableDefibrillateurs.getRowCount() + " resultats");
        tableDefibrillateurs.getColumnModel().getColumn(0).setMinWidth(30);
        tableDefibrillateurs.getColumnModel().getColumn(0).setPreferredWidth(30);
        tableDefibrillateurs.getColumnModel().getColumn(0).setMaxWidth(100);
    }

    public void createAndDisplay() {
        /* Look and Feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the frame */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface(connexion, password).setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnConfirmer;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnAnnulerPwd;
    private javax.swing.JButton btnValiderPwd;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboAccessibilite;
    private javax.swing.JComboBox<String> comboCategorie;
    private javax.swing.JComboBox<String> comboTypeDispo;
    private javax.swing.JComboBox<String> comboTypeStruct;
    private javax.swing.JDialog dialogPassword;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField formAccessibilite;
    private javax.swing.JTextField formAdresse;
    private javax.swing.JTextField formCategorie;
    private javax.swing.JTextField formCommune;
    private javax.swing.JTextField formCoord;
    private javax.swing.JComboBox<String> formDispositif;
    private javax.swing.JTextField formEmplacement;
    private javax.swing.JFrame formFrame;
    private javax.swing.JTextField formId;
    private javax.swing.JTextField formNomSite;
    private javax.swing.JComboBox<String> formTypeStruct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioCoord;
    private javax.swing.JRadioButton radioFiltres;
    private javax.swing.JTable tableDefibrillateurs;
    private javax.swing.JTextField textLatitude;
    private javax.swing.JTextField textLongitude;
    private javax.swing.JTextField nbResults;
    // End of variables declaration
    // </editor-fold>


}
