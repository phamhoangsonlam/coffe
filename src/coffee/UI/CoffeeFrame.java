/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffee.UI;

import coffee.Utils.Auth;
import coffee.Utils.MsgBox;
import coffee.Utils.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

/**
 *
 * @author Đặng Thành Trung
 */
public class CoffeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form CoffeeFrame
     */
    public CoffeeFrame() {
        initComponents();
        setLocationRelativeTo(null);
        init();
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
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        btnLichsu = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnSanPham = new javax.swing.JButton();
        btnThanhVien = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGioiThieu = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniSanPham = new javax.swing.JMenuItem();
        mniThanhVien = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniLSBH = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mniDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 13, 88));
        jPanel2.setLayout(new java.awt.GridLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 304, -1, -1));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/dangxuat32.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/ketthuc32.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/banhang32.png"))); // NOI18N
        jButton1.setText("Bán hàng");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(5, 10, 5, 10));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        btnLichsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLichsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/lichsu32.png"))); // NOI18N
        btnLichsu.setText("Lịch sử");
        btnLichsu.setFocusable(false);
        btnLichsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLichsu.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnLichsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLichsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichsuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLichsu);

        btnDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/doanhthu32.png"))); // NOI18N
        btnDoanhThu.setText("Doanh thu");
        btnDoanhThu.setFocusable(false);
        btnDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoanhThu.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnDoanhThu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDoanhThu);
        jToolBar1.add(jSeparator8);

        btnSanPham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/sanpham32.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSanPham);

        btnThanhVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/thanhvien32.png"))); // NOI18N
        btnThanhVien.setText("Thành viên");
        btnThanhVien.setFocusable(false);
        btnThanhVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThanhVien.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnThanhVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThanhVien);

        btnNhanVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/nhanvien32.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhanVien);
        jToolBar1.add(jSeparator2);

        btnGioiThieu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/gioithieu32.png"))); // NOI18N
        btnGioiThieu.setText("Giới thiệu");
        btnGioiThieu.setFocusable(false);
        btnGioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioiThieu.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnGioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioiThieuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGioiThieu);
        jToolBar1.add(jSeparator7);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/coffeee.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, -1, 580));

        pnlTrangThai.setBackground(new java.awt.Color(255, 255, 255));

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(153, 0, 51));
        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/coffeesys32.png"))); // NOI18N
        lblTrangThai.setText("Hệ quản lý Coffee");

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(153, 0, 51));
        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/dongho32.png"))); // NOI18N
        lblDongHo.setText("00:00:00 AM");
        lblDongHo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDongHo.setFocusable(false);
        lblDongHo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblDongHo.setVerifyInputWhenFocusTarget(false);

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(51, 0, 102));
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaiTro.setText("Vai Trò - (Chưa đăng nhập)");

        jLabel2.setText(" ");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai)
                .addGap(323, 323, 323)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblDongHo))
                    .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVaiTro)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1400, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/coffeegif.gif"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 50, 70));

        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/hetthong.gif"))); // NOI18N
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 50, 70));

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));
        jMenuBar1.setOpaque(false);

        mnuHeThong.setText("Hệ Thống");
        mnuHeThong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuHeThong.setHideActionText(true);
        mnuHeThong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mnuHeThong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnuHeThong.setMargin(new java.awt.Insets(4, 6, 4, 6));
        mnuHeThong.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mnuHeThong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        mniDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/dangnhap24.png"))); // NOI18N
        mniDangNhap.setText("    Đăng nhập");
        mniDangNhap.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/dangxuat24.png"))); // NOI18N
        mniDangXuat.setText("    Đăng xuất");
        mniDangXuat.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator3);

        mniDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/doimatkhau24.png"))); // NOI18N
        mniDoiMatKhau.setText("    Đổi mật khẩu");
        mniDoiMatKhau.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator4);

        mniKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/ketthuc24.png"))); // NOI18N
        mniKetThuc.setText("    Kết thúc");
        mniKetThuc.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");
        mnuQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuQuanLy.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/sanpham24.png"))); // NOI18N
        mniSanPham.setText("    Sản phẩm     ");
        mniSanPham.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSanPhamActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniSanPham);

        mniThanhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniThanhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/thanhvien24.png"))); // NOI18N
        mniThanhVien.setText("    Thành viên");
        mniThanhVien.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThanhVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniThanhVien);
        mnuQuanLy.add(jSeparator6);

        mniNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/nhanvien24.png"))); // NOI18N
        mniNhanVien.setText("    Nhân viên");
        mniNhanVien.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");
        mnuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuThongKe.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniLSBH.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mniLSBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/LichSu24.png"))); // NOI18N
        mniLSBH.setText("Lịch sử bán hàng");
        mniLSBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLSBHActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLSBH);
        mnuThongKe.add(jSeparator9);

        mniDoanhThu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/doanhthu24.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");
        mnuTroGiup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnuTroGiup.setMargin(new java.awt.Insets(4, 6, 4, 6));

        mniHuongDan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/huongdan24.png"))); // NOI18N
        mniHuongDan.setText("    Hướng dẫn    ");
        mniHuongDan.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);
        mnuTroGiup.add(jSeparator5);

        mniGioiThieu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/icon/gioithieu24.png"))); // NOI18N
        mniGioiThieu.setText("    Giới thiệu");
        mniGioiThieu.setMargin(new java.awt.Insets(5, 5, 5, 100));
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        doiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSanPhamActionPerformed
        sanPham();
    }//GEN-LAST:event_mniSanPhamActionPerformed

    private void mniThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThanhVienActionPerformed
        thanhVien();
    }//GEN-LAST:event_mniThanhVienActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        nhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniLSBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLSBHActionPerformed
        lichSuBanHang();
    }//GEN-LAST:event_mniLSBHActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        doanhThu();
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        banHang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLichsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichsuActionPerformed
        lichSuBanHang();
    }//GEN-LAST:event_btnLichsuActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        doanhThu();
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        sanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhVienActionPerformed
        thanhVien();
    }//GEN-LAST:event_btnThanhVienActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        nhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioiThieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGioiThieuActionPerformed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoffeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoffeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoffeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoffeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnGioiThieu;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnLichsu;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThanhVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniLSBH;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniSanPham;
    private javax.swing.JMenuItem mniThanhVien;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlTrangThai;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setIconImage(XImage.getAppIcon());
        this.setTitle("HỆ THỐNG QUẢN LÝ COFFEE");
        this.setLocationRelativeTo(null);

        new ChaoDialog(this, true).setVisible(true);
        new DangNhapDialog(this, true).setVisible(true);

        this.startDongHo();

        this.startVaiTro();

        if (Auth.isLogin()) {
            if (Auth.isManager()) {
                lblVaiTro.setText("Quản lý - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + ")");
            } else {
                lblVaiTro.setText("Nhân viên - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + ")");
            }
        } else {
            lblVaiTro.setText("Vai trò - (Chưa đăng nhập)");
        }

    }

    void startDongHo() {
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String timeStamp = new SimpleDateFormat("dd-MM-yyyy __"
                        + " HH:mm:ss").format(Calendar.getInstance().getTime());
                lblDongHo.setText(timeStamp);
            }
        }).start();
    }

    void startVaiTro() {
        new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Auth.isLogin()) {
                    if (Auth.isManager()) {
                        lblVaiTro.setText("Quản lý - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + " )");
                    } else {
                        lblVaiTro.setText("Nhân viên - " + Auth.user.getMaNV() + " (" + Auth.user.getHoTen() + " )");
                    }
                } else {
                    lblVaiTro.setText("Vai trò - (Chưa đăng nhập)");
                }
            }
        }).start();
    }

    void dangXuat() {
        Auth.clear();
        new DangNhapDialog(this, true).setVisible(true);
        btnDangXuat.setEnabled(Auth.isLogin());
    }
    
    void lichSuBanHang() {
        if (Auth.isLogin()) {
            new LichSuBanHangDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void doanhThu() {
        if (Auth.isLogin()) {
            new ThongKeDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void nhanVien() {
        if (Auth.isLogin()) {
            new NhanVienDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void thanhVien() {
        if (Auth.isLogin()) {
            new ThanhVienDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void doiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhauDiaLog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void sanPham() {
        if (Auth.isLogin()) {
            new SanPhamDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void banHang() {
        if (Auth.isLogin()) {
            new BanHangDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

}
