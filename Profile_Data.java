/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Profile_Data extends javax.swing.JFrame {

    /**
     * Creates new form Profile_Data
     */
    Profile aa = new Profile();
    Login bb = new Login();
    Deposit cc = new Deposit();

    public void openProfile() {
        System.out.println("Open Profile Form");
    }
    
    public Profile_Data() {
        if (Session.getLoginStatus() == "Active") {
            initComponents();
            setBiodata();
        } else {
            dispose();
            Login_Form.preview();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        BTC_Wallet = new javax.swing.JTextField();
        ETH_Wallet = new javax.swing.JTextField();
        BCH_Wallet = new javax.swing.JTextField();
        XRP_Wallet = new javax.swing.JTextField();
        DASH_Wallet = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        LTC_Wallet = new javax.swing.JTextField();
        withdraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        updateLTCWallet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updateDASHWallet = new javax.swing.JButton();
        updateXRPWallet = new javax.swing.JButton();
        updateBCHWallet = new javax.swing.JButton();
        updateETHWallet = new javax.swing.JButton();
        updateBTCWallet = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(95, 145, 64));
        setMinimumSize(new java.awt.Dimension(600, 565));
        setPreferredSize(new java.awt.Dimension(600, 565));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 565));
        getContentPane().setLayout(null);

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(170, 90, 410, 28);

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(address);
        address.setBounds(170, 130, 410, 28);

        email.setEditable(false);
        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(email);
        email.setBounds(170, 170, 410, 27);

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(password);
        password.setBounds(170, 210, 410, 27);

        BTC_Wallet.setBackground(new java.awt.Color(255, 255, 255));
        BTC_Wallet.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(BTC_Wallet);
        BTC_Wallet.setBounds(170, 250, 300, 27);

        ETH_Wallet.setBackground(new java.awt.Color(255, 255, 255));
        ETH_Wallet.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ETH_Wallet);
        ETH_Wallet.setBounds(170, 290, 300, 28);

        BCH_Wallet.setBackground(new java.awt.Color(255, 255, 255));
        BCH_Wallet.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(BCH_Wallet);
        BCH_Wallet.setBounds(170, 330, 300, 27);

        XRP_Wallet.setBackground(new java.awt.Color(255, 255, 255));
        XRP_Wallet.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(XRP_Wallet);
        XRP_Wallet.setBounds(170, 370, 300, 27);

        DASH_Wallet.setBackground(new java.awt.Color(255, 255, 255));
        DASH_Wallet.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(DASH_Wallet);
        DASH_Wallet.setBounds(170, 410, 300, 27);

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        edit.setForeground(new java.awt.Color(95, 145, 64));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(20, 490, 110, 30);

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(95, 145, 64));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(140, 490, 110, 30);

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cancel.setForeground(new java.awt.Color(95, 145, 64));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(260, 490, 100, 30);

        LTC_Wallet.setBackground(new java.awt.Color(255, 255, 255));
        LTC_Wallet.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(LTC_Wallet);
        LTC_Wallet.setBounds(170, 450, 300, 27);

        withdraw.setBackground(new java.awt.Color(255, 255, 255));
        withdraw.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        withdraw.setForeground(new java.awt.Color(95, 145, 64));
        withdraw.setText("Withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw);
        withdraw.setBounds(480, 490, 100, 30);

        deposit.setBackground(new java.awt.Color(255, 255, 255));
        deposit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        deposit.setForeground(new java.awt.Color(95, 145, 64));
        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        getContentPane().add(deposit);
        deposit.setBounds(370, 490, 100, 30);

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(95, 145, 64));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logout.setOpaque(true);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(510, 0, 90, 65);

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(95, 145, 64));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menu.setText("Menu");
        menu.setOpaque(true);
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(460, 0, 50, 65);

        updateLTCWallet.setBackground(new java.awt.Color(255, 255, 255));
        updateLTCWallet.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateLTCWallet.setForeground(new java.awt.Color(95, 145, 64));
        updateLTCWallet.setText("Update");
        updateLTCWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLTCWalletActionPerformed(evt);
            }
        });
        getContentPane().add(updateLTCWallet);
        updateLTCWallet.setBounds(480, 450, 100, 25);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Litecoin Wallet");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 450, 103, 19);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DASH Wallet");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 410, 103, 19);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ripple Wallet");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 370, 92, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bitcoin Cash Wallet");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 330, 135, 19);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ethereum Wallet");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 290, 115, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bitcoin Wallet");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 250, 96, 19);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 210, 68, 19);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 170, 37, 19);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 130, 58, 19);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 90, 39, 19);

        updateDASHWallet.setBackground(new java.awt.Color(255, 255, 255));
        updateDASHWallet.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateDASHWallet.setForeground(new java.awt.Color(95, 145, 64));
        updateDASHWallet.setText("Update");
        updateDASHWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDASHWalletActionPerformed(evt);
            }
        });
        getContentPane().add(updateDASHWallet);
        updateDASHWallet.setBounds(480, 410, 100, 25);

        updateXRPWallet.setBackground(new java.awt.Color(255, 255, 255));
        updateXRPWallet.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateXRPWallet.setForeground(new java.awt.Color(95, 145, 64));
        updateXRPWallet.setText("Update");
        updateXRPWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateXRPWalletActionPerformed(evt);
            }
        });
        getContentPane().add(updateXRPWallet);
        updateXRPWallet.setBounds(480, 370, 100, 25);

        updateBCHWallet.setBackground(new java.awt.Color(255, 255, 255));
        updateBCHWallet.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateBCHWallet.setForeground(new java.awt.Color(95, 145, 64));
        updateBCHWallet.setText("Update");
        updateBCHWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBCHWalletActionPerformed(evt);
            }
        });
        getContentPane().add(updateBCHWallet);
        updateBCHWallet.setBounds(480, 330, 100, 25);

        updateETHWallet.setBackground(new java.awt.Color(255, 255, 255));
        updateETHWallet.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateETHWallet.setForeground(new java.awt.Color(95, 145, 64));
        updateETHWallet.setText("Update");
        updateETHWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateETHWalletActionPerformed(evt);
            }
        });
        getContentPane().add(updateETHWallet);
        updateETHWallet.setBounds(480, 290, 100, 25);

        updateBTCWallet.setBackground(new java.awt.Color(255, 255, 255));
        updateBTCWallet.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        updateBTCWallet.setForeground(new java.awt.Color(95, 145, 64));
        updateBTCWallet.setText("Update");
        updateBTCWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTCWalletActionPerformed(evt);
            }
        });
        getContentPane().add(updateBTCWallet);
        updateBTCWallet.setBounds(480, 250, 100, 25);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/Image/Login_Header.png"))); // NOI18N
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(240, 65));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 460, 65);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setEmail(){
        email.setText(Session.getEmail());
    }
    
    public void setBTCWallet() {
        BTC_Wallet.setText(Session.getBTCWallet());
    }

    public void setETHWallet() {
        ETH_Wallet.setText(Session.getETHWallet());
    }

    public void setBCHWallet() {
        BCH_Wallet.setText(Session.getBCHWallet());
    }

    public void setXRPWallet() {
        XRP_Wallet.setText(Session.getXRPWallet());
    }

    public void setDASHWallet() {
        DASH_Wallet.setText(Session.getDASHWallet());
    }

    public void setLTCWallet() {
        LTC_Wallet.setText(Session.getLTCWallet());
    }

    public void setBiodata() {
        name.setText(Session.getName());
        address.setText(Session.getAddress());
        email.setText(Session.getEmail());
        password.setText(Session.getPassword());
        BTC_Wallet.setText(Session.getBTCWallet());
        ETH_Wallet.setText(Session.getETHWallet());
        BCH_Wallet.setText(Session.getBCHWallet());
        XRP_Wallet.setText(Session.getXRPWallet());
        DASH_Wallet.setText(Session.getDASHWallet());
        LTC_Wallet.setText(Session.getLTCWallet());
        name.setEditable(false);
        address.setEditable(false);
        email.setEditable(false);
        password.setEditable(false);
        password.setEditable(false);
        BTC_Wallet.setEditable(false);
        ETH_Wallet.setEditable(false);
        BCH_Wallet.setEditable(false);
        XRP_Wallet.setEditable(false);
        DASH_Wallet.setEditable(false);
        LTC_Wallet.setEditable(false);
    }

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        name.setText(Session.getName());
        address.setText(Session.getAddress());
        email.setText(Session.getEmail());
        password.setText(Session.getPassword());
        name.setEditable(false);
        address.setEditable(false);
        email.setEditable(false);
        password.setEditable(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (email.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            email.requestFocus();
        } else if (name.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            name.requestFocus();
        } else if (address.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            address.requestFocus();
        } else {
            aa.saveData(email.getText(), name.getText(), address.getText(), password.getText(), Session.getUserID());
            JOptionPane.showMessageDialog(null, "Data Edited");
            aa.seeData(Session.getUserID());
            name.setText("");
            address.setText("");
            email.setText("");
            password.setText("");
            setEmail();
            aa.seeUpdatedPassword(Session.getUserID());
            password.setText(Session.getPassword());
            aa.seeUpdatedName(Session.getUserID());
            name.setText(Session.getName());
            aa.seeUpdatedAddress(Session.getUserID());
            address.setText(Session.getAddress());
            name.setEditable(false);
            address.setEditable(false);
            email.setEditable(false);
            password.setEditable(false);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        name.setEditable(true);
        address.setEditable(true);
        email.setEditable(true);
        password.setEditable(true);
        password.setText("");
    }//GEN-LAST:event_editActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        dispose();
        Deposit_Form.preview();
    }//GEN-LAST:event_depositActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        dispose();
        Withdrawal_Form.preview();
    }//GEN-LAST:event_withdrawActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Are You Sure to Logout?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            bb.logout();
            System.exit(0);
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        dispose();
        Menu.preview();
    }//GEN-LAST:event_menuMouseClicked

    private void updateBTCWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTCWalletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            cc.saveWalletBTC(Session.getUserID());
            BTC_Wallet.setText("");
            aa.seeData(Session.getUserID());
            aa.seeUpdatedWalletBTC(Session.getUserID());
            setBTCWallet();
        }
    }//GEN-LAST:event_updateBTCWalletActionPerformed

    private void updateETHWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateETHWalletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            cc.saveWalletETH(Session.getUserID());
            ETH_Wallet.setText("");
            aa.seeData(Session.getUserID());
            aa.seeUpdatedWalletETH(Session.getUserID());
            setETHWallet();
        }
    }//GEN-LAST:event_updateETHWalletActionPerformed

    private void updateBCHWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBCHWalletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            cc.saveWalletBCH(Session.getUserID());
            BCH_Wallet.setText("");
            aa.seeData(Session.getUserID());
            aa.seeUpdatedWalletBCH(Session.getUserID());
            setBCHWallet();
        }
    }//GEN-LAST:event_updateBCHWalletActionPerformed

    private void updateXRPWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateXRPWalletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            cc.saveWalletXRP(Session.getUserID());
            XRP_Wallet.setText("");
            aa.seeData(Session.getUserID());
            aa.seeUpdatedWalletXRP(Session.getUserID());
            setXRPWallet();
        }
    }//GEN-LAST:event_updateXRPWalletActionPerformed

    private void updateDASHWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDASHWalletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            cc.saveWalletDASH(Session.getUserID());
            DASH_Wallet.setText("");
            aa.seeData(Session.getUserID());
            aa.seeUpdatedWalletDASH(Session.getUserID());
            setDASHWallet();
        }
    }//GEN-LAST:event_updateDASHWalletActionPerformed

    private void updateLTCWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLTCWalletActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            cc.saveWalletLTC(Session.getUserID());
            LTC_Wallet.setText("");
            aa.seeData(Session.getUserID());
            aa.seeUpdatedWalletLTC(Session.getUserID());
            setLTCWallet();
        }
    }//GEN-LAST:event_updateLTCWalletActionPerformed

    public static void preview() {
        Profile_Data form = new Profile_Data();
        form.setLocationRelativeTo(null);
        form.openProfile();
        form.getContentPane().setBackground(Color.decode("#5f9140"));
        form.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            preview();
        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BCH_Wallet;
    private javax.swing.JTextField BTC_Wallet;
    private javax.swing.JTextField DASH_Wallet;
    private javax.swing.JTextField ETH_Wallet;
    private javax.swing.JTextField LTC_Wallet;
    private javax.swing.JTextField XRP_Wallet;
    private javax.swing.JTextField address;
    private javax.swing.JButton cancel;
    private javax.swing.JButton deposit;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menu;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JButton save;
    private javax.swing.JButton updateBCHWallet;
    private javax.swing.JButton updateBTCWallet;
    private javax.swing.JButton updateDASHWallet;
    private javax.swing.JButton updateETHWallet;
    private javax.swing.JButton updateLTCWallet;
    private javax.swing.JButton updateXRPWallet;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
