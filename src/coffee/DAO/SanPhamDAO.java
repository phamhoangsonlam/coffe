/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffee.DAO;

import coffee.Entity.SanPham;
import coffee.Utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Đặng Thành Trung
 */
public class SanPhamDAO extends CoffeeDAO<SanPham, String>{
    
    
    String INSERT_SQL = "INSERT INTO SanPham (MaSanPham, TenSanPham, DonGia, Size, Hinh, MaLoai) VALUES (?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SanPham SET TenSanPham=?, DonGia=?, Size=?, Hinh=?, MaLoai=? WHERE MaSanPham=?";
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSanPham=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSanPham =?";

    @Override
    public void insert(SanPham entity) {
        XJdbc.update(INSERT_SQL, 
                entity.getMaSP(), 
                entity.getTenSP(), 
                entity.getDonGia(), 
                entity.getSize(), 
                entity.getHinh(), 
                entity.getLoaiSP());
    }

    @Override
    public void update(SanPham entity) {
         XJdbc.update(UPDATE_SQL, 
                 entity.getTenSP(), 
                 entity.getDonGia(), 
                 entity.getSize(), 
                 entity.getHinh(), 
                 entity.getLoaiSP(), 
                 entity.getMaSP());
    }

    @Override
    public void delete(String id) {
         XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public SanPham selectById(String id) {
        List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSanPham"));
                entity.setTenSP(rs.getString("TenSanPham"));
                entity.setDonGia(rs.getDouble("DonGia"));
                entity.setLoaiSP(rs.getString("MaLoai"));
                entity.setSize(rs.getString("Size"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
 
    
    public List<SanPham> selectByLoaiSP(String maLoai) {
        String sql = "SELECT * FROM SanPham WHERE MaLoai = ?";
        return this.selectBySql(sql, maLoai);
    }
}
