/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View.ViewQL;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import DomainModels.KhuyenMaiModel;
import Service.impl.KhuyenMaiServiceIblm;
import ViewModels.KhuyenMai;
import ViewModels.SanPham;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewKhuyenMai extends javax.swing.JInternalFrame {

    private List<KhuyenMai> listKM = new ArrayList<>();
    private List<SanPham> listSP = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel box1 = new DefaultComboBoxModel();
    private DefaultComboBoxModel box2 = new DefaultComboBoxModel();
    private DefaultComboBoxModel box3 = new DefaultComboBoxModel();
    private Service.impl.KhuyenMaiServiceIblm impl = new KhuyenMaiServiceIblm();

    /**
     * Creates new form ViewKhuyenMai
     */
    public ViewKhuyenMai() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI uI = (BasicInternalFrameUI) this.getUI();
        uI.setNorthPane(null);
        String header[] = {"ID", "Mã Khuyến Mãi", "Chương Trình Khuyến Mãi", "Hình Thức Giảm Giá", "Mức Giá", "Thời Gian Bắt Đầu", "Thời Gian Kết Thúc", "Trạng Thái", "Mô Tả"};
        bangKM.setModel(dtm);
        dtm.setColumnIdentifiers(header);
        cbbHinhThucGG.setModel(box1);
        box1.addElement("Giảm theo %");
        box1.addElement("Giảm theo số tiền");
        cbbSearchHinhThucGG.setModel(box2);
        box2.addElement("All");
        box2.addElement("Giảm theo %");
        box2.addElement("Giảm theo số tiền");
        cbbSearchTT.setModel(box3);
        box3.addElement("All");
        box3.addElement("Đang kích hoạt");
        box3.addElement("Hết hiệu lực sử dụng");
        listKM = impl.getAll();
        showData(listKM);
    }

    private void showData(List<KhuyenMai> km) {
        dtm.setRowCount(0);
        for (KhuyenMai x : km) {
            dtm.addRow(x.toRowData());
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbbHinhThucGG = new javax.swing.JComboBox<>();
        txtTenKM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMucGiam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btClear = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtMenhGia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bangKM = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbSearchHinhThucGG = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbbSearchTT = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        txtNgaybatDau = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdoDangKichHoat = new javax.swing.JRadioButton();
        rdoHetHieuLuc = new javax.swing.JRadioButton();
        bltAdd = new javax.swing.JButton();
        bltUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(814, 678));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chương trình khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(204, 0, 0))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo mã khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setText("Chương Trình Khuyến Mãi: ");

        cbbHinhThucGG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbHinhThucGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbHinhThucGGActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Giảm Giá: ");

        jLabel4.setText("Hình Thức Giảm Giá:");

        jLabel5.setText("Mức Giảm Giá: ");

        jLabel9.setText("ID: ");

        btClear.setBackground(new java.awt.Color(0, 255, 51));
        btClear.setText("Làm mới");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        txtID.setEnabled(false);

        txtMenhGia.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtMenhGia.setText("jLabel15");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jLabel8.setText("Mô Tả: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbHinhThucGG, javax.swing.GroupLayout.Alignment.LEADING, 0, 206, Short.MAX_VALUE)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMenhGia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(6, 6, 6))
                            .addComponent(btClear, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbHinhThucGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMucGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenhGia))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Khuyến Mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 51, 255))); // NOI18N

        bangKM.setModel(new javax.swing.table.DefaultTableModel(
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
        bangKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bangKMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bangKM);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel11.setText("Tìm Kiếm Mã Giảm Giá:");

        cbbSearchHinhThucGG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbSearchHinhThucGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSearchHinhThucGGActionPerformed(evt);
            }
        });

        jLabel12.setText("Hình Thức Giảm Giá:");

        jLabel13.setText("Trạng thái");

        cbbSearchTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbSearchTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSearchTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbSearchHinhThucGG, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbSearchTT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbbSearchHinhThucGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbbSearchTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thời gian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel6.setText("Thời Gian Bắt Đầu:");

        jLabel7.setText("Thời Gian Kết Thúc:");

        jLabel10.setText("Trạng Thái: ");

        buttonGroup1.add(rdoDangKichHoat);
        rdoDangKichHoat.setSelected(true);
        rdoDangKichHoat.setText("Đang kích hoạt");

        buttonGroup1.add(rdoHetHieuLuc);
        rdoHetHieuLuc.setText("Hết hiệu lực sử dụng");

        bltAdd.setBackground(new java.awt.Color(0, 51, 255));
        bltAdd.setForeground(new java.awt.Color(255, 255, 255));
        bltAdd.setText("Lưu");
        bltAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bltAddActionPerformed(evt);
            }
        });

        bltUpdate.setBackground(new java.awt.Color(0, 51, 255));
        bltUpdate.setForeground(new java.awt.Color(255, 255, 255));
        bltUpdate.setText("Sửa");
        bltUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bltUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bltAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bltUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNgaybatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(rdoDangKichHoat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(rdoHetHieuLuc)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgaybatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDangKichHoat)
                    .addComponent(rdoHetHieuLuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bltAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bltUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1093, 743);
    }// </editor-fold>//GEN-END:initComponents

    private void bltAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bltAddActionPerformed
        try {
            String ma = txtMaKM.getText();
            String ten = txtTenKM.getText();
            String hinhTGG = cbbHinhThucGG.getSelectedItem().toString();
            String mucG = txtMucGiam.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String ngaybatdau = sdf.format(txtNgaybatDau.getDate());

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String ngayketthuc = sdf1.format(txtNgayKetThuc.getDate());
            String mota = txtMoTa.getText();
            boolean status = rdoDangKichHoat.isSelected();
            String tt = "";
            if (status == true) {
                tt = "Đang kích hoạt";
            } else {
                tt = "Hết hiệu lực sử dụng";
            }
            KhuyenMaiModel km = new KhuyenMaiModel(ma, ten, hinhTGG, Double.valueOf(mucG), ngaybatdau, ngayketthuc, tt, mota);
            JOptionPane.showMessageDialog(this, impl.add(km));
            listKM = impl.getAll();
            showData(listKM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không được để trống !");
        }
    }//GEN-LAST:event_bltAddActionPerformed

    private void bltUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bltUpdateActionPerformed
        try {
            String id = txtID.getText();
            String ma = txtMaKM.getText();
            String ten = txtTenKM.getText();
            String hinhTGG = cbbHinhThucGG.getSelectedItem().toString();
            String mucG = txtMucGiam.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String ngaybatdau = sdf.format(txtNgaybatDau.getDate());

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String ngayketthuc = sdf1.format(txtNgayKetThuc.getDate());
            String mota = txtMoTa.getText();
            boolean status = rdoDangKichHoat.isSelected();
            String tt = "";
            if (status == true) {
                tt = "Đang kích hoạt";
            } else {
                tt = "Hết hiệu lực sử dụng";
            }
            KhuyenMaiModel km = new KhuyenMaiModel(ma, ten, hinhTGG, Double.valueOf(mucG), ngaybatdau, ngayketthuc, tt, mota);
            JOptionPane.showMessageDialog(this, impl.update(km, id));
            listKM = impl.getAll();
            showData(listKM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không được để trống !");
        }
    }//GEN-LAST:event_bltUpdateActionPerformed

    private void bangKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bangKMMouseClicked
        int row = bangKM.getSelectedRow();
        txtID.setText(bangKM.getValueAt(row, 0).toString());
        txtMaKM.setText(bangKM.getValueAt(row, 1).toString());
        txtTenKM.setText(bangKM.getValueAt(row, 2).toString());
        cbbHinhThucGG.setSelectedItem(bangKM.getValueAt(row, 3).toString());
        txtMucGiam.setText(bangKM.getValueAt(row, 4).toString());
        try {
            Date date = (Date) new SimpleDateFormat("yyyy-MM-dd").parse((String) bangKM.getValueAt(row, 5));
            txtNgaybatDau.setDate(date);
        } catch (ParseException ex) {

        }
        try {
            Date date1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse((String) bangKM.getValueAt(row, 6));
            txtNgayKetThuc.setDate(date1);
        } catch (ParseException ex) {

        }
        String check = bangKM.getValueAt(row, 7).toString();
        if (check.contains("Đang kích hoạt")) {
            rdoDangKichHoat.setSelected(true);
        } else {
            rdoHetHieuLuc.setSelected(true);
        }
        txtMoTa.setText(bangKM.getValueAt(row, 8).toString());
    }//GEN-LAST:event_bangKMMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.getText().isEmpty()) {
            showData(listKM);
        } else {
            List<KhuyenMai> search = impl.searchTheoMaKM("%" + txtSearch.getText() + "%");
            showData(search);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        txtID.setText("");
        txtMaKM.setText("");
        txtMoTa.setText("");
        txtMucGiam.setText("");
        txtTenKM.setText("");
        txtNgayKetThuc.setDate(null);
        txtNgaybatDau.setDate(null);
        cbbHinhThucGG.setSelectedIndex(0);
        rdoDangKichHoat.setSelected(true);
        rdoHetHieuLuc.setSelected(false);
    }//GEN-LAST:event_btClearActionPerformed

    private void cbbSearchHinhThucGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSearchHinhThucGGActionPerformed
        if (cbbSearchHinhThucGG.getSelectedItem().toString().equalsIgnoreCase("All")) {
            listKM = impl.getAll();
            showData(listKM);
        } else {
            List<KhuyenMai> searchTheoHinhThucGG = impl.searchTheoHinhThucGG(cbbSearchHinhThucGG.getSelectedItem().toString());
            showData(searchTheoHinhThucGG);
        }
    }//GEN-LAST:event_cbbSearchHinhThucGGActionPerformed

    private void cbbSearchTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSearchTTActionPerformed
        if (cbbSearchTT.getSelectedItem().toString().equalsIgnoreCase("All")) {
            listKM = impl.getAll();
            showData(listKM);
        } else {
            List<KhuyenMai> searchTheoTT = impl.searchTheoTrangThai(cbbSearchTT.getSelectedItem().toString());
            showData(searchTheoTT);
        }
    }//GEN-LAST:event_cbbSearchTTActionPerformed

    private void cbbHinhThucGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbHinhThucGGActionPerformed
        if (cbbHinhThucGG.getSelectedItem().toString().equalsIgnoreCase("Giảm theo số tiền")) {
            txtMenhGia.setText("VND");
        } else {
            txtMenhGia.setText("%");
        }
    }//GEN-LAST:event_cbbHinhThucGGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bangKM;
    private javax.swing.JButton bltAdd;
    private javax.swing.JButton bltUpdate;
    private javax.swing.JButton btClear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbHinhThucGG;
    private javax.swing.JComboBox<String> cbbSearchHinhThucGG;
    private javax.swing.JComboBox<String> cbbSearchTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoDangKichHoat;
    private javax.swing.JRadioButton rdoHetHieuLuc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JLabel txtMenhGia;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtMucGiam;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private com.toedter.calendar.JDateChooser txtNgaybatDau;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
