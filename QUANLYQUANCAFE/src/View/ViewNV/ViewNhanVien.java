/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.ViewNV;

import View.ViewQL.*;
import View.ViewLogin;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ViewNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form ViewQuanLySanPham
     */
    private Color defaulColor,
            /**
             * Creates new form ViewQuanLySanPham
             */
            clickedColor;

    public ViewNhanVien() {
        initComponents();
        defaulColor = new Color(145, 94, 65);
        clickedColor = new Color(156, 132, 122);
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);

        ThanhToan.setBackground(clickedColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);

        ViewThanhToan m = new ViewThanhToan();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(m).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        QuanLyKhuyenMai = new javax.swing.JPanel();
        txtQuanLyKhuyenMai = new javax.swing.JLabel();
        QuanLySanPham = new javax.swing.JPanel();
        txtSanPham = new javax.swing.JLabel();
        ThongKe = new javax.swing.JPanel();
        txtThongKe = new javax.swing.JLabel();
        DangXuat = new javax.swing.JPanel();
        txtDangXuat = new javax.swing.JLabel();
        QuanLyNhanVien = new javax.swing.JPanel();
        txtQuanLyNhanVien = new javax.swing.JLabel();
        anh = new javax.swing.JLabel();
        QuanLyBan = new javax.swing.JPanel();
        txtQuanLyBan = new javax.swing.JLabel();
        LichSuOrder = new javax.swing.JPanel();
        txtLichSuOrder1 = new javax.swing.JLabel();
        ThanhToan = new javax.swing.JPanel();
        txtThanhToan1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(145, 94, 65));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        QuanLyKhuyenMai.setBackground(new java.awt.Color(156, 132, 122));

        txtQuanLyKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQuanLyKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQuanLyKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/promotion (1).png"))); // NOI18N
        txtQuanLyKhuyenMai.setText("     Khuyến mãi");
        txtQuanLyKhuyenMai.setToolTipText("");
        txtQuanLyKhuyenMai.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtQuanLyKhuyenMaiMouseMoved(evt);
            }
        });
        txtQuanLyKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuanLyKhuyenMaiMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQuanLyKhuyenMaiMousePressed(evt);
            }
        });

        javax.swing.GroupLayout QuanLyKhuyenMaiLayout = new javax.swing.GroupLayout(QuanLyKhuyenMai);
        QuanLyKhuyenMai.setLayout(QuanLyKhuyenMaiLayout);
        QuanLyKhuyenMaiLayout.setHorizontalGroup(
            QuanLyKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(QuanLyKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLyKhuyenMaiLayout.createSequentialGroup()
                    .addGap(0, 46, Short.MAX_VALUE)
                    .addComponent(txtQuanLyKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        QuanLyKhuyenMaiLayout.setVerticalGroup(
            QuanLyKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(QuanLyKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtQuanLyKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        QuanLySanPham.setBackground(new java.awt.Color(156, 132, 122));

        txtSanPham.setBackground(new java.awt.Color(156, 132, 122));
        txtSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/combo (1).png"))); // NOI18N
        txtSanPham.setText("     Sản phẩm");
        txtSanPham.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtSanPhamMouseMoved(evt);
            }
        });
        txtSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSanPhamMousePressed(evt);
            }
        });

        javax.swing.GroupLayout QuanLySanPhamLayout = new javax.swing.GroupLayout(QuanLySanPham);
        QuanLySanPham.setLayout(QuanLySanPhamLayout);
        QuanLySanPhamLayout.setHorizontalGroup(
            QuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLySanPhamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        QuanLySanPhamLayout.setVerticalGroup(
            QuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLySanPhamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ThongKe.setBackground(new java.awt.Color(156, 132, 122));

        txtThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bar-chart (1).png"))); // NOI18N
        txtThongKe.setText("     Thống kê");
        txtThongKe.setToolTipText("");
        txtThongKe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtThongKeMouseMoved(evt);
            }
        });
        txtThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtThongKeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtThongKeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ThongKeLayout = new javax.swing.GroupLayout(ThongKe);
        ThongKe.setLayout(ThongKeLayout);
        ThongKeLayout.setHorizontalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ThongKeLayout.setVerticalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeLayout.createSequentialGroup()
                .addComponent(txtThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        DangXuat.setBackground(new java.awt.Color(156, 132, 122));

        txtDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout (1).png"))); // NOI18N
        txtDangXuat.setText("     Đăng xuất");
        txtDangXuat.setToolTipText("");
        txtDangXuat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtDangXuatMouseMoved(evt);
            }
        });
        txtDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDangXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDangXuatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangXuatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        QuanLyNhanVien.setBackground(new java.awt.Color(156, 132, 122));

        txtQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQuanLyNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/team (1).png"))); // NOI18N
        txtQuanLyNhanVien.setText("     Nhân viên");
        txtQuanLyNhanVien.setToolTipText("");
        txtQuanLyNhanVien.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtQuanLyNhanVienMouseMoved(evt);
            }
        });
        txtQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuanLyNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQuanLyNhanVienMousePressed(evt);
            }
        });

        javax.swing.GroupLayout QuanLyNhanVienLayout = new javax.swing.GroupLayout(QuanLyNhanVien);
        QuanLyNhanVien.setLayout(QuanLyNhanVienLayout);
        QuanLyNhanVienLayout.setHorizontalGroup(
            QuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(QuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLyNhanVienLayout.createSequentialGroup()
                    .addGap(0, 46, Short.MAX_VALUE)
                    .addComponent(txtQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        QuanLyNhanVienLayout.setVerticalGroup(
            QuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
            .addGroup(QuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanLyNhanVienLayout.createSequentialGroup()
                    .addComponent(txtQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        anh.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        anh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/zyro-image (1).png"))); // NOI18N
        anh.setText("CoffeeShop");

        QuanLyBan.setBackground(new java.awt.Color(156, 132, 122));

        txtQuanLyBan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQuanLyBan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQuanLyBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/side-table (2).png"))); // NOI18N
        txtQuanLyBan.setText("     Bàn");
        txtQuanLyBan.setToolTipText("");
        txtQuanLyBan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtQuanLyBanMouseMoved(evt);
            }
        });
        txtQuanLyBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuanLyBanMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQuanLyBanMousePressed(evt);
            }
        });

        javax.swing.GroupLayout QuanLyBanLayout = new javax.swing.GroupLayout(QuanLyBan);
        QuanLyBan.setLayout(QuanLyBanLayout);
        QuanLyBanLayout.setHorizontalGroup(
            QuanLyBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLyBanLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtQuanLyBan, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        QuanLyBanLayout.setVerticalGroup(
            QuanLyBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtQuanLyBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        LichSuOrder.setBackground(new java.awt.Color(156, 132, 122));

        txtLichSuOrder1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtLichSuOrder1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtLichSuOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bill (1).png"))); // NOI18N
        txtLichSuOrder1.setText("     Hoá đơn");
        txtLichSuOrder1.setToolTipText("");
        txtLichSuOrder1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtLichSuOrder1MouseMoved(evt);
            }
        });
        txtLichSuOrder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLichSuOrder1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLichSuOrder1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout LichSuOrderLayout = new javax.swing.GroupLayout(LichSuOrder);
        LichSuOrder.setLayout(LichSuOrderLayout);
        LichSuOrderLayout.setHorizontalGroup(
            LichSuOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LichSuOrderLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtLichSuOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LichSuOrderLayout.setVerticalGroup(
            LichSuOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichSuOrderLayout.createSequentialGroup()
                .addComponent(txtLichSuOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ThanhToan.setBackground(new java.awt.Color(156, 132, 122));

        txtThanhToan1.setBackground(new java.awt.Color(156, 132, 122));
        txtThanhToan1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtThanhToan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtThanhToan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wallet (1).png"))); // NOI18N
        txtThanhToan1.setText("     Bán hàng");
        txtThanhToan1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtThanhToan1MouseMoved(evt);
            }
        });
        txtThanhToan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtThanhToan1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtThanhToan1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ThanhToanLayout = new javax.swing.GroupLayout(ThanhToan);
        ThanhToan.setLayout(ThanhToanLayout);
        ThanhToanLayout.setHorizontalGroup(
            ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhToanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtThanhToan1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ThanhToanLayout.setVerticalGroup(
            ThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhToanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtThanhToan1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuanLySanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuanLyKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LichSuOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuanLyBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anh)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(anh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LichSuOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuanLyBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuanLyKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1079, 731));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSanPhamMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSanPhamMouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(clickedColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtSanPhamMouseMoved

    private void txtSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSanPhamMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này");
    }//GEN-LAST:event_txtSanPhamMouseClicked

    private void txtSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSanPhamMousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(clickedColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtSanPhamMousePressed

    private void txtThongKeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThongKeMouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(clickedColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtThongKeMouseMoved

    private void txtThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThongKeMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này");
    }//GEN-LAST:event_txtThongKeMouseClicked

    private void txtThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThongKeMousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(clickedColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtThongKeMousePressed

    private void txtDangXuatMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDangXuatMouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(clickedColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtDangXuatMouseMoved

    private void txtDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDangXuatMouseClicked
        this.dispose();
        ViewLogin m = new ViewLogin();
        m.setVisible(true);
    }//GEN-LAST:event_txtDangXuatMouseClicked

    private void txtDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDangXuatMousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(clickedColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtDangXuatMousePressed

    private void txtQuanLyNhanVienMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyNhanVienMouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(clickedColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtQuanLyNhanVienMouseMoved

    private void txtQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyNhanVienMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này");
    }//GEN-LAST:event_txtQuanLyNhanVienMouseClicked

    private void txtQuanLyNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyNhanVienMousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(clickedColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtQuanLyNhanVienMousePressed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_jPanel2MouseMoved

    private void txtQuanLyKhuyenMaiMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyKhuyenMaiMouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(clickedColor);
    }//GEN-LAST:event_txtQuanLyKhuyenMaiMouseMoved

    private void txtQuanLyKhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyKhuyenMaiMousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(clickedColor);
    }//GEN-LAST:event_txtQuanLyKhuyenMaiMousePressed

    private void txtQuanLyKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyKhuyenMaiMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này");
    }//GEN-LAST:event_txtQuanLyKhuyenMaiMouseClicked

    private void txtThanhToan1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThanhToan1MouseMoved
        ThanhToan.setBackground(clickedColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtThanhToan1MouseMoved

    private void txtThanhToan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThanhToan1MouseClicked
        ViewThanhToan m = new ViewThanhToan();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(m).setVisible(true);
    }//GEN-LAST:event_txtThanhToan1MouseClicked

    private void txtThanhToan1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThanhToan1MousePressed
        ThanhToan.setBackground(clickedColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtThanhToan1MousePressed

    private void txtLichSuOrder1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLichSuOrder1MouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(clickedColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtLichSuOrder1MouseMoved

    private void txtLichSuOrder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLichSuOrder1MouseClicked
        ViewHoaDon m = new ViewHoaDon();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(m).setVisible(true);
    }//GEN-LAST:event_txtLichSuOrder1MouseClicked

    private void txtLichSuOrder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLichSuOrder1MousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(clickedColor);
        QuanLyBan.setBackground(defaulColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtLichSuOrder1MousePressed

    private void txtQuanLyBanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyBanMouseMoved
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(clickedColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtQuanLyBanMouseMoved

    private void txtQuanLyBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyBanMouseClicked
        JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này");
    }//GEN-LAST:event_txtQuanLyBanMouseClicked

    private void txtQuanLyBanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuanLyBanMousePressed
        ThanhToan.setBackground(defaulColor);
        LichSuOrder.setBackground(defaulColor);
        QuanLyBan.setBackground(clickedColor);
        QuanLySanPham.setBackground(defaulColor);
        ThongKe.setBackground(defaulColor);
        QuanLyNhanVien.setBackground(defaulColor);
        DangXuat.setBackground(defaulColor);
        QuanLyKhuyenMai.setBackground(defaulColor);
    }//GEN-LAST:event_txtQuanLyBanMousePressed

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
            java.util.logging.Logger.getLogger(ViewQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DangXuat;
    private javax.swing.JPanel LichSuOrder;
    private javax.swing.JPanel QuanLyBan;
    private javax.swing.JPanel QuanLyKhuyenMai;
    private javax.swing.JPanel QuanLyNhanVien;
    private javax.swing.JPanel QuanLySanPham;
    private javax.swing.JPanel ThanhToan;
    private javax.swing.JPanel ThongKe;
    private javax.swing.JLabel anh;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtDangXuat;
    private javax.swing.JLabel txtLichSuOrder1;
    private javax.swing.JLabel txtQuanLyBan;
    private javax.swing.JLabel txtQuanLyKhuyenMai;
    private javax.swing.JLabel txtQuanLyNhanVien;
    private javax.swing.JLabel txtSanPham;
    private javax.swing.JLabel txtThanhToan1;
    private javax.swing.JLabel txtThongKe;
    // End of variables declaration//GEN-END:variables
}
