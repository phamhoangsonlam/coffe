/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffee.DAO;

import coffee.Entity.LoaiSanPham;
import coffee.Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Đặng Thành Trung
 */
public class LoaiSanPhamDAO extends CoffeeDAO<LoaiSanPham, String>{
    
    String INSERT_SQL = "INSERT INTO LoaiSanPham (MaLoai, TenLoai) VALUES (?, ?)";
    String UPDATE_SQL = "UPDATE LoaiSanPham SET TenLoai=? WHERE MaLoai=?";
    String DELETE_SQL = "DELETE FROM LoaiSanPham WHERE MaLoai=?";
    String SELECT_ALL_SQL = "SELECT * FROM LoaiSanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM LoaiSanPham WHERE MaLoai =?";

    @Override
    public void insert(LoaiSanPham entity) {
        XJdbc.update(INSERT_SQL, entity.getMaLoaiSP(), entity.getTenLoaiSP());
    }

    @Override
    public void update(LoaiSanPham entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenLoaiSP(), entity.getMaLoaiSP());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public LoaiSanPham selectById(String id) {
        List<LoaiSanPham> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LoaiSanPham> selectBySql(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    LoaiSanPham entity = new LoaiSanPham();
                    entity.setMaLoaiSP(rs.getString("MaLoai"));
                    entity.setTenLoaiSP(rs.getString("TenLoai"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
}
