/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import util.DbCon;

/**
 *
 * @author user
 */
public class DeshBoard2 extends javax.swing.JFrame {

    DbCon con = new DbCon();
    PreparedStatement ps;
    String sql = "";
    ResultSet rs;
    PrintTicket show=new PrintTicket();
    /**
     * Creates new form DeshBoard2
     */
    public DeshBoard2() {
        initComponents();

        getAllPassengerData();
        getAllFlightsData();

        getPassenger();
        getPassengerData();
        
        NonEditableFieldTicketBooking();
        
        getFlights();
        
        getAllTicketsData();
        
        getTicketId();
        
        DisplayCancelData();
        
        getCardTable();
//        getFlightsData();
        setTime();

        FlCodeCancl.setEditable(false);      
    }
    
    public void setTime(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                   java.util.Date date=new java.util.Date();
                   SimpleDateFormat tf=new SimpleDateFormat("h:mm:ss: aa");
                   SimpleDateFormat df=new SimpleDateFormat("EEEE, dd-MM-yyyy");
                   String time=tf.format(date);
                   
                   Font customFont = new Font("Arial", Font.BOLD, 15);
                    
                   timeLab.setFont(customFont);
                   dateLab.setFont(customFont);
                   
                   timeLab.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                   dateLab.setText(df.format(date));
                }
            }
        }).start();
    }
    
    
    

    public void ticketReset1(){
         showDate.setDate(null);
         sourceTickt.setSelectedItem(null);
         destinationTickt.setSelectedItem(null);
         showFlightCode.setText("");
         classTickt.setSelectedItem(null);
         timeTickt.setSelectedItem(null);
         seatTickt.setText("");
         flightCodeTickt.setSelectedItem(null);
    }
    
   
    //conver to util date to sql date
    public static Date convertDateToSql(java.util.Date utilDate) {
        if (utilDate != null) {
            return new Date(utilDate.getTime());
        }
        return null;
    }
    
    
    //date format for utill date, String date to util date
    public static java.util.Date formatStringdateToUtilDate(String dateString){
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            return dateformat.parse(dateString);  
        } catch (ParseException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    
    //Get data from mysql table
    String[] tableColumns = {"p_id", "p_name", "p_nationality", "p_gender", "p_passport", "p_address", "p_phone"};

    public void getAllPassengerData() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(tableColumns);

        tblPassengers.setModel(model);

        sql = "select * from passengers_table";

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("p_id");
                String name = rs.getString("p_name");
                String nationality = rs.getString("p_nationality");
                String gender = rs.getString("p_gender");
                String passport = rs.getString("p_passport");
                String address = rs.getString("p_address");
                String phone = rs.getString("p_phone");

                model.addRow(new Object[]{id, name, nationality, gender, passport, address, phone});
            }
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reset() {
        pName.setText(null);
        pNatinality.setSelectedItem(null);
        pGender.setSelectedItem(null);
        pPassport.setText(null);
        pAddress.setText(null);
        pPhone.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        timeLab = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCancellation = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnFlights = new javax.swing.JButton();
        btnPassengers = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        maintab = new javax.swing.JTabbedPane();
        home = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        flights = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        flClass = new javax.swing.JComboBox<>();
        flTime = new javax.swing.JComboBox<>();
        btnfDelete = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        flDate = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        flSource = new javax.swing.JComboBox<>();
        flDestination = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        flCode = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        flSeats = new javax.swing.JTextField();
        btnfSave = new javax.swing.JButton();
        btnfUpdate = new javax.swing.JButton();
        btnfReset = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passengers = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pPassport = new javax.swing.JTextField();
        pNatinality = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pGender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pAddress = new javax.swing.JTextField();
        pPhone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPassengers = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tickets = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        AddToCard = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengerTblP = new javax.swing.JTable();
        destinationTickt = new javax.swing.JComboBox<>();
        sourceTickt = new javax.swing.JComboBox<>();
        timeTickt = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        seatTickt = new javax.swing.JTextField();
        classTickt = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        showFlightCode = new javax.swing.JTextField();
        showDate = new com.toedter.calendar.JDateChooser();
        btnSearchFlight = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        phoneTicket = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnSaveTickt = new javax.swing.JButton();
        btnResetTicket = new javax.swing.JButton();
        btnPrintT = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        PassIdTickt = new javax.swing.JComboBox<>();
        nameTickt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        flightCodeTickt = new javax.swing.JComboBox<>();
        genderTicket = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        passportTickt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        amountTickt = new javax.swing.JTextField();
        nationalityTickt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        printTicket = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        nameTI = new javax.swing.JLabel();
        dateT = new javax.swing.JLabel();
        classT = new javax.swing.JLabel();
        sourceTI = new javax.swing.JLabel();
        destinationT = new javax.swing.JLabel();
        seatT = new javax.swing.JLabel();
        timeT = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        nameT = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        sourceT = new javax.swing.JLabel();
        flightCodeT = new javax.swing.JLabel();
        destinationTI = new javax.swing.JLabel();
        seatTI = new javax.swing.JLabel();
        flightCodeTI = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cancellation = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        btnSearchFlcode = new javax.swing.JButton();
        FlDateCancl = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCancel = new javax.swing.JTable();
        btnCanclBooking = new javax.swing.JButton();
        btnResetCancl = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        FlCodeCancl = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TIdCancl = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 113, 188));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/txtLogo.png"))); // NOI18N

        dateLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dateLab.setForeground(new java.awt.Color(255, 255, 255));
        dateLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        timeLab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        timeLab.setForeground(new java.awt.Color(255, 255, 255));
        timeLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLab, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(timeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

        jPanel3.setBackground(new java.awt.Color(41, 171, 226));

        btnCancellation.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCancellation.setText("Cancellation");
        btnCancellation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancellationMouseClicked(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnFlights.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnFlights.setText("Flights");
        btnFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFlightsMouseClicked(evt);
            }
        });
        btnFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightsActionPerformed(evt);
            }
        });

        btnPassengers.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnPassengers.setText("Passengers");
        btnPassengers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPassengersMouseClicked(evt);
            }
        });

        btnTickets.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnTickets.setText("Tickets");
        btnTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTicketsMouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logout (1).png"))); // NOI18N
        jButton3.setText("Log Out");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFlights, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPassengers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancellation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnCancellation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 530));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Unica One", 1, 60)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("DELTA AIR");
        jPanel21.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 340, 110));

        jLabel34.setFont(new java.awt.Font("Unica One", 1, 60)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("TO");
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 100, 110));

        jLabel7.setFont(new java.awt.Font("Unica One", 1, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome");
        jPanel21.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 270, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo22.png"))); // NOI18N
        jPanel21.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 210, 100));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/2.jpg"))); // NOI18N
        jPanel21.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 560));

        home.addTab("tab1", jPanel21);

        maintab.addTab("tab1", home);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "Luxuary" }));
        jPanel5.add(flClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 100, -1));

        flTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 AM", "3:00 AM", "5:00 AM", "7:00 AM", "9:00 AM", "11:00 AM", "01:00 PM", "03:00 PM", "05:00 PM", "07:00 PM", "09:00 PM", "11:00 PM" }));
        jPanel5.add(flTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 80, -1));

        btnfDelete.setBackground(new java.awt.Color(255, 102, 51));
        btnfDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnfDelete.setText("Delete");
        btnfDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfDeleteMouseClicked(evt);
            }
        });
        jPanel5.add(btnfDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Time");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 60, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Class");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 60, -1));
        jPanel5.add(flDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 120, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Flight Code");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Source");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, -1));

        flSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Khulna", "Syhlet", "Rajshahi", "Barishal", "Cumilla", "Chittagong", "Cox's Bazar" }));
        jPanel5.add(flSource, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, -1));

        flDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Khulna", "Syhlet", "Rajshahi", "Barishal", "Cumilla", "Chittagong", "Cox's Bazar" }));
        jPanel5.add(flDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 120, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Destination");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 120, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Date");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 120, -1));
        jPanel5.add(flCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Number of Seats");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 130, -1));
        jPanel5.add(flSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 90, -1));

        btnfSave.setBackground(new java.awt.Color(51, 204, 255));
        btnfSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnfSave.setText("Save");
        btnfSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfSaveMouseClicked(evt);
            }
        });
        jPanel5.add(btnfSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 70, -1));

        btnfUpdate.setBackground(new java.awt.Color(255, 204, 51));
        btnfUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnfUpdate.setText("Update");
        btnfUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfUpdateMouseClicked(evt);
            }
        });
        jPanel5.add(btnfUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        btnfReset.setBackground(new java.awt.Color(0, 204, 255));
        btnfReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnfReset.setText("Reset");
        btnfReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfResetMouseClicked(evt);
            }
        });
        jPanel5.add(btnfReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, -1));

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFlightsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblFlights);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 760, 170));

        jPanel6.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Flights");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1.jpg"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 880, 500));

        flights.addTab("tab1", jPanel5);

        maintab.addTab("tab2", flights);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(51, 204, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jPanel9.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 70, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 204, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        jPanel9.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        btnReset.setBackground(new java.awt.Color(0, 204, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel9.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 70, -1));

        btnDelete.setBackground(new java.awt.Color(255, 102, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel9.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));
        jPanel9.add(pPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 120, -1));

        pNatinality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladesh", "India", "Nepal", "United Kingdom", "Denmark", "Norway" }));
        jPanel9.add(pNatinality, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nationality");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, -1));
        jPanel9.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Name");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, -1));

        pGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel9.add(pGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Gender");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 60, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Passport No:");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Address");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));
        jPanel9.add(pAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 120, -1));
        jPanel9.add(pPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 120, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Phone");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        tblPassengers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPassengers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPassengersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPassengers);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 790, 190));

        jPanel10.setBackground(new java.awt.Color(51, 204, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Passengers");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 880, 510));

        passengers.addTab("tab1", jPanel9);

        maintab.addTab("tab3", passengers);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddToCard.setBackground(new java.awt.Color(0, 113, 188));
        AddToCard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddToCard.setForeground(new java.awt.Color(255, 255, 255));
        AddToCard.setText("Add Card");
        AddToCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCardMouseClicked(evt);
            }
        });
        jPanel13.add(AddToCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        passengerTblP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        passengerTblP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerTblPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passengerTblPMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(passengerTblP);

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 810, 60));

        destinationTickt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Khulna", "Syhlet", "Rajshahi", "Barishal", "Cumilla", "Chittagong", "Cox's Bazar" }));
        destinationTickt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationTicktActionPerformed(evt);
            }
        });
        jPanel13.add(destinationTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        sourceTickt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Khulna", "Syhlet", "Rajshahi", "Barishal", "Cumilla", "Chittagong", "Cox's Bazar" }));
        sourceTickt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTicktActionPerformed(evt);
            }
        });
        jPanel13.add(sourceTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, -1));

        timeTickt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "7:00 AM", "9:00 AM", "1:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "7:00 PM", "9:00 PM" }));
        jPanel13.add(timeTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 70, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Seat No");
        jPanel13.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 70, -1));

        seatTickt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                seatTicktFocusLost(evt);
            }
        });
        seatTickt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                seatTicktKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                seatTicktKeyTyped(evt);
            }
        });
        jPanel13.add(seatTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 60, -1));

        classTickt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "Luxuary" }));
        jPanel13.add(classTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 100, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("F-Available ");
        jPanel13.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 90, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Class");
        jPanel13.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 70, -1));
        jPanel13.add(showFlightCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 100, -1));
        jPanel13.add(showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, -1));

        btnSearchFlight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchFlight.setText("Search Flight");
        btnSearchFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightActionPerformed(evt);
            }
        });
        jPanel13.add(btnSearchFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Time");
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 50, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Date");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("Destination");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Source");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));
        jPanel13.add(phoneTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 110, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Phone");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        btnSaveTickt.setBackground(new java.awt.Color(0, 113, 188));
        btnSaveTickt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSaveTickt.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveTickt.setText("Booking Ticket");
        btnSaveTickt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveTicktMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveTicktMouseEntered(evt);
            }
        });
        btnSaveTickt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTicktActionPerformed(evt);
            }
        });
        jPanel13.add(btnSaveTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 160, -1));

        btnResetTicket.setBackground(new java.awt.Color(255, 204, 51));
        btnResetTicket.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetTicket.setText("Reset");
        btnResetTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetTicketMouseClicked(evt);
            }
        });
        btnResetTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTicketActionPerformed(evt);
            }
        });
        jPanel13.add(btnResetTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 70, -1));

        btnPrintT.setBackground(new java.awt.Color(102, 102, 102));
        btnPrintT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrintT.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintT.setText("Confirm Ticket");
        btnPrintT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintTMouseClicked(evt);
            }
        });
        btnPrintT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTActionPerformed(evt);
            }
        });
        jPanel13.add(btnPrintT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 150, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Passenger ID");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, -1));

        PassIdTickt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PassIdTicktItemStateChanged(evt);
            }
        });
        PassIdTickt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdTicktMouseClicked(evt);
            }
        });
        jPanel13.add(PassIdTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));

        nameTickt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTicktFocusLost(evt);
            }
        });
        jPanel13.add(nameTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 160, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Name");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("F-Code");
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 60, -1));

        flightCodeTickt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                flightCodeTicktItemStateChanged(evt);
            }
        });
        flightCodeTickt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightCodeTicktMouseClicked(evt);
            }
        });
        jPanel13.add(flightCodeTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 80, -1));
        jPanel13.add(genderTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Gender");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Passport No:");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));
        jPanel13.add(passportTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 100, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Amount");
        jPanel13.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));
        jPanel13.add(amountTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 100, -1));
        jPanel13.add(nationalityTickt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 100, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Nationality");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        tblTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTicketsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTickets);

        jPanel13.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 810, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1.jpg"))); // NOI18N
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 880, 510));

        jPanel14.setBackground(new java.awt.Color(51, 204, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tickets");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

        tickets.addTab("tab1", jPanel13);

        printTicket.setBackground(new java.awt.Color(255, 255, 255));
        printTicket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        printTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel46.setText("Time");
        printTicket.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dat.png"))); // NOI18N
        printTicket.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 20, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel48.setText("Destination");
        printTicket.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jPanel11.setBackground(new java.awt.Color(0, 113, 188));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/txtLogo.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("BOARDING PASS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        printTicket.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 60));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel51.setText("Date:");
        printTicket.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 100, 30));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Passenger Name:");
        printTicket.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 230, 40));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel53.setText("Source");
        printTicket.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel54.setText("Seat");
        printTicket.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel55.setText("Flight Code");
        printTicket.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel56.setText("Class");
        printTicket.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        nameTI.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        nameTI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printTicket.add(nameTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 250, 60));

        dateT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(dateT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 170, 40));

        classT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(classT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 150, 40));

        sourceTI.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(sourceTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 150, 40));

        destinationT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(destinationT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 150, 40));

        seatT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(seatT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 150, 40));

        timeT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(timeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 150, 40));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/barcoder.jpg"))); // NOI18N
        printTicket.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 290));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel58.setText("Passenger Name:");
        printTicket.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, 40));

        nameT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(nameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, 40));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/barcode2.png"))); // NOI18N
        printTicket.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 260, 40));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel60.setText("Source");
        printTicket.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel61.setText("Flight Code");
        printTicket.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel62.setText("Destination");
        printTicket.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel63.setText("Seat");
        printTicket.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        sourceT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(sourceT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 150, 40));

        flightCodeT.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(flightCodeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 150, 40));

        destinationTI.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(destinationTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 160, 40));

        seatTI.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(seatTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 110, 40));

        flightCodeTI.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        printTicket.add(flightCodeTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 130, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("PrintOut");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(printTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(printTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 920, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tickets.addTab("tab2", jPanel7);

        maintab.addTab("tab4", tickets);

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchFlcode.setBackground(new java.awt.Color(51, 204, 0));
        btnSearchFlcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchFlcode.setText("Search Flight Code");
        btnSearchFlcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchFlcodeMouseClicked(evt);
            }
        });
        jPanel17.add(btnSearchFlcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));
        jPanel17.add(FlDateCancl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        tblCancel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblCancel);

        jPanel17.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 740, 170));

        btnCanclBooking.setBackground(new java.awt.Color(255, 102, 102));
        btnCanclBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCanclBooking.setText("Cancel Booking");
        btnCanclBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCanclBookingMouseClicked(evt);
            }
        });
        btnCanclBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanclBookingActionPerformed(evt);
            }
        });
        jPanel17.add(btnCanclBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        btnResetCancl.setBackground(new java.awt.Color(51, 204, 255));
        btnResetCancl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetCancl.setText("Reset");
        jPanel17.add(btnResetCancl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 70, -1));

        bntExit.setBackground(new java.awt.Color(255, 102, 102));
        bntExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntExit.setText("Exit");
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });
        jPanel17.add(bntExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 70, -1));
        jPanel17.add(FlCodeCancl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 120, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Flight Code");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 80, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Flight Date");
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Ticket ID");
        jPanel17.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, -1));

        TIdCancl.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TIdCanclItemStateChanged(evt);
            }
        });
        TIdCancl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIdCanclMouseClicked(evt);
            }
        });
        jPanel17.add(TIdCancl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 110, -1));

        jPanel18.setBackground(new java.awt.Color(51, 204, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Cancellation");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/1.jpg"))); // NOI18N
        jPanel17.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 880, 510));

        cancellation.addTab("tab1", jPanel17);

        maintab.addTab("tab5", cancellation);

        jPanel4.add(maintab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 870, 600));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 870, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFlightsActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        maintab.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFlightsMouseClicked
        // TODO add your handling code here:
        maintab.setSelectedIndex(1);
    }//GEN-LAST:event_btnFlightsMouseClicked

    private void btnPassengersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPassengersMouseClicked
        // TODO add your handling code here:
        maintab.setSelectedIndex(2);

    }//GEN-LAST:event_btnPassengersMouseClicked

    private void btnTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseClicked
        // TODO add your handling code here:
//      
        maintab.setSelectedIndex(3);
//        PassIdTickt.removeAllItems();
//        getPassenger();
        
//        
    }//GEN-LAST:event_btnTicketsMouseClicked

    private void btnCancellationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancellationMouseClicked
        // TODO add your handling code here:
//        getAllTicketsData();
        getTicketId();
       
        maintab.setSelectedIndex(4);
    }//GEN-LAST:event_btnCancellationMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:

        sql = "INSERT INTO passengers_table(p_name, p_nationality, p_gender, p_passport, p_address, p_phone)value(?,?,?,?,?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, pName.getText().trim());
            ps.setString(2, pNatinality.getSelectedItem().toString());
            ps.setString(3, pGender.getSelectedItem().toString());
            ps.setString(4, pPassport.getText().trim());
            ps.setString(5, pAddress.getText().trim());
            ps.setString(6, pPhone.getText().trim());

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data saved");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not saved" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAllPassengerData();
        
        getPassenger();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
//   tableColumns ={"p_id", "p_name", "p_nationality", "p_gender", "p_passport", "p_address", "p_phone"};  

        String Idnumber = id;

        sql = "update passengers_table set p_name=?, p_nationality=?, p_gender=?, p_passport=?, p_address=?, p_phone=? where p_id=?";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, pName.getText().trim());
            ps.setString(2, pNatinality.getSelectedItem().toString());
            ps.setString(3, pGender.getSelectedItem().toString());
            ps.setString(4, pPassport.getText().trim());
            ps.setString(5, pAddress.getText().trim());
            ps.setString(6, pPhone.getText().trim());
            ps.setInt(7, Integer.parseInt(Idnumber.trim()));

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data Updated");
            getAllPassengerData();

            id = null;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Not Saved" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked
    String id;
    private void tblPassengersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPassengersMouseClicked
        // TODO add your handling code here:

        int row = tblPassengers.getSelectedRow();

        id = tblPassengers.getModel().getValueAt(row, 0).toString();
        String name = tblPassengers.getModel().getValueAt(row, 1).toString();
        String nationality = tblPassengers.getModel().getValueAt(row, 2).toString();
        String gender = tblPassengers.getModel().getValueAt(row, 3).toString();
        String passport = tblPassengers.getModel().getValueAt(row, 4).toString();
        String address = tblPassengers.getModel().getValueAt(row, 5).toString();
        String phone = tblPassengers.getModel().getValueAt(row, 6).toString();

        pName.setText(name);
        pNatinality.setSelectedItem(nationality);
        pGender.setSelectedItem(gender);
        pPassport.setText(passport);
        pAddress.setText(address);
        pPhone.setText(phone);

    }//GEN-LAST:event_tblPassengersMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        String Idnum = id;
        sql = "delete from passengers_table where p_id=?";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(Idnum.trim()));

            ps.executeLargeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data Deleted");
            reset();

            getAllPassengerData();

            id = null;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not saved" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    //Strting flights module from here
    //get data from mysql table
    String[] flTableColumns = {"fl_id", "fl_code", "fl_source", "fl_destination", "fl_date", "fl_time", "fl_class", "fl_seats"};

    public void getAllFlightsData() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(flTableColumns);

        tblFlights.setModel(model);

        sql = "select * from flight_table";

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id =rs.getInt("fl_id");
                String code = rs.getString("fl_code");
                String source = rs.getString("fl_source");
                String destination = rs.getString("fl_destination");
                Date date = rs.getDate("fl_date");
                String time = rs.getString("fl_time");
                String fclass =rs.getString("fl_class");
                int seats = rs.getInt("fl_seats");

                model.addRow(new Object[]{id, code, source, destination, date, time, fclass, seats});
            }
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnfSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfSaveMouseClicked
        // TODO add your handling code here:
        sql = "INSERT INTO flight_table(fl_code, fl_source, fl_destination, fl_date, fl_time, fl_class, fl_seats)value(?,?,?,?,?,?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, flCode.getText().trim());
            ps.setString(2, flSource.getSelectedItem().toString());
            ps.setString(3, flDestination.getSelectedItem().toString());
            ps.setDate(4, convertDateToSql(flDate.getDate()));
            ps.setString(5, flTime.getSelectedItem().toString());
            ps.setString(6, flClass.getSelectedItem().toString());
            ps.setInt(7, Integer.parseInt(flSeats.getText().trim()));
            

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data Saved");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Not Saved" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAllFlightsData();
        getFlights();

    }//GEN-LAST:event_btnfSaveMouseClicked

    
    
    ///// Start Tickets module from here/////////// 
    //ID Method
    public void getPassenger() {
        sql = "SELECT * FROM passengers_table";
//        PassIdTickt.removeAllItems();
        
        try {
            ps = con.getCon().prepareStatement(sql);           
            ResultSet rs1 = ps.executeQuery();

            while (rs1.next()) {
                
                int p_id = rs1.getInt("p_id");
                PassIdTickt.addItem(String.valueOf(p_id));
//                System.out.println(p_id);

            }
            
            ps.close();
            con.getCon().close();
            rs1.close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Name method
    public void getPassengerData() {
//        nameTickt.setText(null);
        
        sql = "select * from passengers_table where p_id =?";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(PassIdTickt.getSelectedItem().toString()));
            rs = ps.executeQuery();
            

            while (rs.next()) {
                nameTickt.setText(rs.getString("p_name"));
                genderTicket.setText(rs.getString("p_gender"));
                passportTickt.setText(rs.getString("p_passport"));
                nationalityTickt.setText(rs.getString("p_nationality"));
                phoneTicket.setText(rs.getString("p_phone"));
                
            }

            ps.close();
            rs.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // NonEditable field in tickets
        public void NonEditableFieldTicketBooking(){
        nameTickt.setEditable(false);
        genderTicket.setEditable(false);
        passportTickt.setEditable(false);
        nationalityTickt.setEditable(false);
        phoneTicket.setEditable(false);
        
    }
        
    //For flights code mothod 
    public void getFlights() {
        sql = "SELECT * FROM flight_table";
        try {
            ps = con.getCon().prepareStatement(sql);           
            ResultSet rs1l = ps.executeQuery();

            while (rs1l.next()) {
                
                String fl_code = rs1l.getString("fl_code");
                flightCodeTickt.addItem(String.valueOf(fl_code));
                
//                System.out.println(fl_code);
            }
            
            ps.close();
            con.getCon().close();
            rs1l.close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void ticketReset(){
//        PassIdTickt.setSelectedIndex(-1);
        nameTickt.setText("");
//        flightCodeTickt.setSelectedIndex(-1);
        genderTicket.setText("");
        passportTickt.setText("");
        amountTickt.setText("");
        nationalityTickt.setText("");
        phoneTicket.setText("");
    }
 
    
//    get ticket filed's data from mysql table
    String[] ticktTableColumns = {"ticket_id", "p_name", "source", "destination", "class", "time", "date", "seat", "fl_code", "p_gender", "p_passport", "amount", "nationality", "phone"};

    public void getAllTicketsData() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(ticktTableColumns);

        tblTickets.setModel(model);

        sql = "select * from ticket_table";

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ticket_id");
                String name = rs.getString("p_name");
                String source = rs.getString("source");
                String destination = rs.getString("destination");
                String fclass = rs.getString("class");
                String time = rs.getString("time");
                Date date = rs.getDate("date");
                String seat = rs.getString("seat");
                String code = rs.getString("fl_code");
                String gender = rs.getString("p_gender");
                String passport = rs.getString("p_passport");
                int amount = rs.getInt("amount");
                String nationality = rs.getString("nationality");
                String phone = rs.getString("phone");

                model.addRow(new Object[]{id, name, source, destination, fclass, time, date, seat, code, gender, passport, amount, nationality, phone});
            }
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

    
    private void btnSaveTicktMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveTicktMouseClicked
        // TODO add your handling code here:
        
        if(PassIdTickt.getSelectedIndex()==-1 || flightCodeTickt.getSelectedIndex()== -1 || amountTickt.getText().isEmpty() || seatTickt.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Data missing");
        }
        else{
        sql = "INSERT INTO ticket_table(p_name, fl_code, p_gender, p_passport, amount, nationality, phone, source, destination, date, class, time, seat )value(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);
//            ps.setInt(1, Integer.parseInt(PassIdTickt.getSelectedItem().toString()));
            ps.setString(1, nameTickt.getText().trim());
            ps.setString(2, flightCodeTickt.getSelectedItem().toString());
            ps.setString(3, genderTicket.getText().trim());
            ps.setString(4, passportTickt.getText().trim());
            ps.setString(5, amountTickt.getText().trim());
            ps.setString(6, nationalityTickt.getText().trim());
            ps.setString(7, phoneTicket.getText().trim());
            ps.setString(8, sourceTickt.getSelectedItem().toString());
            ps.setString(9, destinationTickt.getSelectedItem().toString());
            ps.setDate(10, convertDateToSql(showDate.getDate()));
            ps.setString(11, classTickt.getSelectedItem().toString());
            ps.setString(12, timeTickt.getSelectedItem().toString());
            ps.setString(13, seatTickt.getText().trim());
            
            

            ps.executeUpdate();
            ps.close();
            con.getCon().close();
//            ticketReset();

            JOptionPane.showMessageDialog(rootPane, "Ticket Booked");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ticket not booked" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAllTicketsData();
        
        
        }
    }//GEN-LAST:event_btnSaveTicktMouseClicked

    
        //Name method
//    public void getFlightsData() {
////        nameTickt.setText(null);
//        
//        sql = "select * from flight_table where fl_id =?";
//
//        try {
//            ps = con.getCon().prepareStatement(sql);
//            ps.setString(1, flightCodeTickt.getSelectedItem().toString());
//            rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                sourceTickt.setText(rs.getString("fl_source"));
//                destinationTickt.setText(rs.getString("fl_destination"));
//                timeTickt.setText(rs.getString("fl_date"));   
//            }
//
//            ps.close();
//            rs.close();
//            con.getCon().close();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
    // NonEditable field in tickets
//        public void NonEditableFlightData(){
//        sourceTickt.setEditable(false);
//        destinationTickt.setEditable(false);
//        timeTickt.setEditable(false);       
//    }
 
    
    private void btnSaveTicktMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveTicktMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveTicktMouseEntered

    private void PassIdTicktItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PassIdTicktItemStateChanged
        // TODO add your handling code here:    
        getPassengerData();
    }//GEN-LAST:event_PassIdTicktItemStateChanged

    private void nameTicktFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTicktFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTicktFocusLost
    int fid;
    private void tblFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFlightsMouseClicked
        // TODO add your handling code here:
        
        int row = tblFlights.getSelectedRow();
        fid = Integer.parseInt(tblFlights.getModel().getValueAt(row, 0).toString());
        String code = tblFlights.getModel().getValueAt(row, 1).toString();
        String source = tblFlights.getModel().getValueAt(row, 2).toString();
        String destination = tblFlights.getModel().getValueAt(row, 3).toString();
        java.util.Date date = formatStringdateToUtilDate(tblFlights.getModel().getValueAt(row, 4).toString());
        String time = tblFlights.getModel().getValueAt(row, 5).toString();
        String fclass = tblFlights.getModel().getValueAt(row, 6).toString();
        String seats = tblFlights.getModel().getValueAt(row, 7).toString();
        

        flCode.setText(code);
        flSource.setSelectedItem(source);
        flDestination.setSelectedItem(destination);
        flDate.setDate(date);
        flTime.setSelectedItem(time);
        flClass.setSelectedItem(fclass);
        flSeats.setText(seats);
    }//GEN-LAST:event_tblFlightsMouseClicked

   
//    String fid;
    private void btnfUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfUpdateMouseClicked
        // TODO add your handling code here:        

        sql = "update flight_table set fl_code=?, fl_source=?, fl_destination=?, fl_date=?, fl_time=?, fl_class=?, fl_seats=? where fl_id=?";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setString(1, flCode.getText().trim());
            ps.setString(2, flSource.getSelectedItem().toString());
            ps.setString(3, flDestination.getSelectedItem().toString());
            ps.setDate(4, convertDateToSql(flDate.getDate()));
            ps.setString(5, flTime.getSelectedItem().toString());
            ps.setString(6, flClass.getSelectedItem().toString());
            ps.setString(7, flSeats.getText().trim());
            ps.setInt(8, fid);

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data Updated");
            
            getAllFlightsData();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data Not Saved" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
                                  
   
    }//GEN-LAST:event_btnfUpdateMouseClicked

    private void PassIdTicktMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdTicktMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PassIdTicktMouseClicked

    private void btnfDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfDeleteMouseClicked
        // TODO add your handling code here:
        
//               
//        sql = "delete from flight_table where fl_id=?";
//
//        try {
//            ps = con.getCon().prepareStatement(sql);
//            ps.setInt(1, fid);
//
//            ps.executeLargeUpdate();
//            ps.close();
//            con.getCon().close();
//
//            JOptionPane.showMessageDialog(rootPane, "Data Deleted");
//            reset();
//
//            getAllFlightsData();
//
////            
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane, "Data not saved" + ex);
//            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }   

    sql = "delete from flight_table where fl_id=?";
    
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, fid);
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            
            JOptionPane.showMessageDialog(rootPane, "Data Deleted");
            flightReset();
            getAllFlightsData();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not Delete" +ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }//GEN-LAST:event_btnfDeleteMouseClicked
        public void flightReset() {
        flCode.setText(null);
        flSource.setSelectedItem(null);
        flDestination.setSelectedItem(null);
        flDate.setDate(null);
        flTime.setSelectedItem(null);
        flClass.setSelectedItem(null);
        pAddress.setText(null);
        flSeats.setText(null);
    }
        
    private void btnfResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfResetMouseClicked
        // TODO add your handling code here:
        flightReset();
    }//GEN-LAST:event_btnfResetMouseClicked

    private void btnResetTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetTicketMouseClicked
        // TODO add your handling code here:
        ticketReset();
    }//GEN-LAST:event_btnResetTicketMouseClicked
    int tid;
    private void tblTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTicketsMouseClicked
        // TODO add your handling code here:
        
        int row = tblTickets.getSelectedRow();
        
        tid = Integer.parseInt(tblTickets.getModel().getValueAt(row, 0).toString());
        String name = tblTickets.getModel().getValueAt(row, 1).toString();
        String source = tblTickets.getModel().getValueAt(row, 2).toString();
        String destination = tblTickets.getModel().getValueAt(row, 3).toString();
        String fclass = tblTickets.getModel().getValueAt(row, 4).toString();
        String time = tblTickets.getModel().getValueAt(row, 5).toString();
        java.util.Date date = formatStringdateToUtilDate(tblTickets.getModel().getValueAt(row, 6).toString());
        String seat = tblTickets.getModel().getValueAt(row, 7).toString();
        String code = tblTickets.getModel().getValueAt(row, 8).toString();
        String gender = tblTickets.getModel().getValueAt(row, 9).toString();
        String passport = tblTickets.getModel().getValueAt(row, 10).toString();
        String amount = tblTickets.getModel().getValueAt(row, 11).toString();
        String nationality = tblTickets.getModel().getValueAt(row, 12).toString();
        String phone = tblTickets.getModel().getValueAt(row, 13).toString();

        nameTickt.setText(name);
        sourceTickt.setSelectedItem(source);
        destinationTickt.setSelectedItem(destination);
        classTickt.setSelectedItem(fclass);
        timeTickt.setSelectedItem(time);
        showDate.setDate(date);
        seatTickt.setText(seat);
        flightCodeTickt.setSelectedItem(code);
        genderTicket.setText(gender);
        passportTickt.setText(passport);
        amountTickt.setText(amount);
        nationalityTickt.setText(nationality);
        phoneTicket.setText(phone);
    }//GEN-LAST:event_tblTicketsMouseClicked

    
    //Cancelling start here//
    private void getTicketId(){
        sql = "SELECT * FROM ticket_table";
        TIdCancl.removeAllItems();
        try {
            ps = con.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                String ticket_id = rs.getString("ticket_id");
                TIdCancl.addItem(String.valueOf(ticket_id));
            }
            ps.close();
            con.getCon().close();
            rs.close();
                       
        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void getFlCode(){
        sql = "SELECT fl_code from ticket_table where ticket_id=?";
        
        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(TIdCancl.getSelectedItem().toString()));
            rs = ps.executeQuery();
            
            while(rs.next()){
                FlCodeCancl.setText(rs.getString("fl_code"));
            }
            ps.close();
            rs.close();
            con.getCon().close();                        
            
        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    
    int Cfid;
    private void btnCanclBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCanclBookingMouseClicked
        // TODO add your handling code here:
        if(FlCodeCancl.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Missing Information");
        }
        else{
         sql = "INSERT INTO cancellation_table(canc_id, ticket_id, fl_code, canc_date)value(?,?,?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);
            ps.setInt(1, Cfid);
            ps.setString(2, TIdCancl.getSelectedItem().toString());
            ps.setString(3, FlCodeCancl.getText().trim());
            ps.setDate(4, convertDateToSql(FlDateCancl.getDate()));
            

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Ticket Cancelled");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ticket is not cancelled" + ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        cancel();
        DisplayCancelData();
        getAllTicketsData();

        

    }//GEN-LAST:event_btnCanclBookingMouseClicked

    String[] cancelTableColumns = {"canc_id", "ticket_id", "fl_code", "canc_date"};

    public void DisplayCancelData() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(cancelTableColumns);

        tblCancel.setModel(model);

        sql = "select * from cancellation_table";

        try {
            ps = con.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int cfid = rs.getInt("canc_id");
                String ticketId = rs.getString("ticket_id");
                String flCode = rs.getString("fl_code");
                Date cancDate = rs.getDate("canc_date");
                

                model.addRow(new Object[]{cfid, ticketId, flCode, cancDate});
            }
            ps.close();
            con.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    /// Remove ticket from booked table///
    public void cancel(){
        sql = "delete from ticket_table where ticket_id="+TIdCancl.getSelectedItem();
    
        try {
            ps=con.getCon().prepareStatement(sql);
//            ps.setInt(1, fid);
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not Delete" +ex);
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    private void TIdCanclMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIdCanclMouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_TIdCanclMouseClicked

    private void TIdCanclItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TIdCanclItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TIdCanclItemStateChanged

    private void btnSearchFlcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchFlcodeMouseClicked
        // TODO add your handling code here:
        getFlCode();
    }//GEN-LAST:event_btnSearchFlcodeMouseClicked

    private void flightCodeTicktItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_flightCodeTicktItemStateChanged
        // TODO add your handling code here:
//        getFlightsData();
        
    }//GEN-LAST:event_flightCodeTicktItemStateChanged

    private void flightCodeTicktMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightCodeTicktMouseClicked
        // TODO add your handling code here:
        getAllFlightsData();
    }//GEN-LAST:event_flightCodeTicktMouseClicked

    private void btnSearchFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightActionPerformed
        // TODO add your handling code here:
        
        sql="select * from flight_table  where fl_source=? And fl_destination=?";
        
        try {
            ps = con.getCon().prepareStatement(sql);
//            String data=rs.getString("fl_source");

           String source=sourceTickt.getSelectedItem().toString();
           String destination=destinationTickt.getSelectedItem().toString();
            
           ps.setString(1, source);
           ps.setString(2, destination);
//           ps.setDate(3, flightDate);
           
//           ps.setDate(3, convertDateToSql(showDate.getDate()));
           
           rs=ps.executeQuery(); 
           
//            String show=sourceTickt.getText().trim();
        
        if(rs.next()){
            Date flightDate=rs.getDate("fl_date");
            showDate.setDate(flightDate);
            String flightCode=rs.getString("fl_code");
            showFlightCode.setText(flightCode);
            String flTime=rs.getString("fl_time");
            timeTickt.setSelectedItem(flTime);
            String flClass=rs.getString("fl_class");
            classTickt.setSelectedItem(flClass);
            
            JOptionPane.showMessageDialog(rootPane, "available");
           
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Not available");
        }
        rs.close();
        ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchFlightActionPerformed

    private void btnResetTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTicketActionPerformed
        // TODO add your handling code here:
        ticketReset1();
         
    }//GEN-LAST:event_btnResetTicketActionPerformed

    private void seatTicktFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seatTicktFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_seatTicktFocusLost

    private void destinationTicktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationTicktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationTicktActionPerformed

    private void sourceTicktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTicktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTicktActionPerformed

    private void seatTicktKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatTicktKeyPressed
        // TODO add your handling code here:       
//                sql="select fl_seats from flight_table where fl_seats=?";        
//        try {
//            ps = con.getCon().prepareStatement(sql);
//
//           String seat=flSeats.getText().trim();
//           
//           ps.setString(1, seat);           
//           rs=ps.executeQuery(); 
//
//        if(rs.next()){
//            int fseat=rs.getInt("fl_seats");
//            
//            int tseats=Integer.parseInt(seatTickt.getText().trim());
//            
//            if(tseats > fseat){
//                 JOptionPane.showMessageDialog(rootPane, "Seat Not available");
//            } 
//        }
//        
//        else{
//           JOptionPane.showMessageDialog(rootPane, "Seat available");
//        }
//        rs.close();
//        ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(DeshBoard2.class.getName()).log(Level.SEVERE, null, ex);
//        } 
    }//GEN-LAST:event_seatTicktKeyPressed

    private void seatTicktKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatTicktKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_seatTicktKeyTyped

    private void passengerTblPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerTblPMouseClicked
        // TODO add your handling code here:
           
        
        
    }//GEN-LAST:event_passengerTblPMouseClicked

    private void btnCanclBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanclBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCanclBookingActionPerformed

    private void AddToCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCardMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) passengerTblP.getModel();
        String name = nameTickt.getText().trim();
//       Date date = formatStringdateToUtilDate(showDate.getDate());
        Date date = convertDateToSql(showDate.getDate());
        String source = sourceTickt.getSelectedItem().toString();
        String destination = destinationTickt.getSelectedItem().toString();
        String code = flightCodeTickt.getSelectedItem().toString();
        String fclass = classTickt.getSelectedItem().toString();
        String time = timeTickt.getSelectedItem().toString();
        int seat = Integer.parseInt(seatTickt.getText().trim());
       
//      java.util.Date date = convertUtilDateToSqlDate(sDate.getDate());

        List<Object> productList = new ArrayList<>();
        productList.add(new Object[]{name, source, destination, code, fclass, time, date, seat});

        int row = model.getRowCount();
        
        for (Object i : productList) {
            model.insertRow(row, (Object[]) i);
        }
        getAllTicketsData();
        ticketReset();
  
    }//GEN-LAST:event_AddToCardMouseClicked

    private void btnPrintTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintTMouseClicked
        // TODO add your handling code here:
        show.setVisible(true);   
    }//GEN-LAST:event_btnPrintTMouseClicked

    private void passengerTblPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerTblPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerTblPMouseEntered

    private void btnPrintTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintTActionPerformed

    private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bntExitActionPerformed

    private void btnSaveTicktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTicktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveTicktActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LogIn login=new LogIn();
        login.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeshBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeshBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeshBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeshBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeshBoard2().setVisible(true);
            }
        });
    }
 
    //Print Start from here//
     public void getCardTable() {   
         
        String[] columns = {"Customer Name", "SORUCE", "DESTINATION", "F_CODE", "CLASS", "TIME", "DATE", "SEAT"};
        DefaultTableModel cardAdd = new DefaultTableModel();
        cardAdd.setColumnIdentifiers(columns);
        passengerTblP.setModel(cardAdd);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCard;
    private javax.swing.JTextField FlCodeCancl;
    private com.toedter.calendar.JDateChooser FlDateCancl;
    private javax.swing.JComboBox<String> PassIdTickt;
    private javax.swing.JComboBox<String> TIdCancl;
    private javax.swing.JTextField amountTickt;
    private javax.swing.JButton bntExit;
    private javax.swing.JButton btnCancellation;
    private javax.swing.JButton btnCanclBooking;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFlights;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPassengers;
    private javax.swing.JButton btnPrintT;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetCancl;
    private javax.swing.JButton btnResetTicket;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveTickt;
    private javax.swing.JButton btnSearchFlcode;
    private javax.swing.JButton btnSearchFlight;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnfDelete;
    private javax.swing.JButton btnfReset;
    private javax.swing.JButton btnfSave;
    private javax.swing.JButton btnfUpdate;
    private javax.swing.JTabbedPane cancellation;
    private javax.swing.JLabel classT;
    private javax.swing.JComboBox<String> classTickt;
    private javax.swing.JLabel dateLab;
    private javax.swing.JLabel dateT;
    private javax.swing.JLabel destinationT;
    private javax.swing.JLabel destinationTI;
    private javax.swing.JComboBox<String> destinationTickt;
    private javax.swing.JComboBox<String> flClass;
    private javax.swing.JTextField flCode;
    private com.toedter.calendar.JDateChooser flDate;
    private javax.swing.JComboBox<String> flDestination;
    private javax.swing.JTextField flSeats;
    private javax.swing.JComboBox<String> flSource;
    private javax.swing.JComboBox<String> flTime;
    private javax.swing.JLabel flightCodeT;
    private javax.swing.JLabel flightCodeTI;
    private javax.swing.JComboBox<String> flightCodeTickt;
    private javax.swing.JTabbedPane flights;
    private javax.swing.JTextField genderTicket;
    private javax.swing.JTabbedPane home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane maintab;
    private javax.swing.JLabel nameT;
    private javax.swing.JLabel nameTI;
    private javax.swing.JTextField nameTickt;
    private javax.swing.JTextField nationalityTickt;
    private javax.swing.JTextField pAddress;
    private javax.swing.JComboBox<String> pGender;
    private javax.swing.JTextField pName;
    private javax.swing.JComboBox<String> pNatinality;
    private javax.swing.JTextField pPassport;
    private javax.swing.JTextField pPhone;
    private javax.swing.JTable passengerTblP;
    private javax.swing.JTabbedPane passengers;
    private javax.swing.JTextField passportTickt;
    private javax.swing.JTextField phoneTicket;
    private javax.swing.JPanel printTicket;
    private javax.swing.JLabel seatT;
    private javax.swing.JLabel seatTI;
    private javax.swing.JTextField seatTickt;
    private com.toedter.calendar.JDateChooser showDate;
    private javax.swing.JTextField showFlightCode;
    private javax.swing.JLabel sourceT;
    private javax.swing.JLabel sourceTI;
    private javax.swing.JComboBox<String> sourceTickt;
    private javax.swing.JTable tblCancel;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTable tblPassengers;
    private javax.swing.JTable tblTickets;
    private javax.swing.JTabbedPane tickets;
    private javax.swing.JLabel timeLab;
    private javax.swing.JLabel timeT;
    private javax.swing.JComboBox<String> timeTickt;
    // End of variables declaration//GEN-END:variables

    private java.util.Date convertUtilDateToSqlDate(java.util.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
