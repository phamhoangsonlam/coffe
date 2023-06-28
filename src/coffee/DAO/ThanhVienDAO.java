/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffee.DAO;

import coffee.Entity.ThanhVien;
import coffee.Utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Đặng Thành Trung
 */
public class ThanhVienDAO extends CoffeeDAO<ThanhVien, String> {

    String INSERT_SQL = "INSERT INTO ThanhVien VALUES (?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ThanhVien SET TenThanhVien=?, MaNV=?, NgayThem =?,LoaiThe = ?, SDT = ?,Email =?,GhiChu=? WHERE MaThanhVien=?";
    String DELETE_SQL = "DELETE FROM ThanhVien WHERE MaThanhVien = ?";
    String SELECT_ALL_SQL = "select * from ThanhVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM ThanhVien where MaThanhVien=?";

    @Override
    public void insert(ThanhVien entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaTV(),
                entity.getTenTV(),
                entity.getMaNV(),
                entity.getNgayThem(),
                entity.getLoaiThe(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getGhiChu()
        );
    }

    @Override
    public void update(ThanhVien entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getTenTV(),
                entity.getMaNV(),
                entity.getNgayThem(),
                entity.getLoaiThe(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getGhiChu(),
                entity.getMaTV()
        );
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public ThanhVien selectById(String id) {
        List<ThanhVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ThanhVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ThanhVien> selectBySql(String sql, Object... args) {
        List<ThanhVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ThanhVien entity = new ThanhVien();
                    entity.setMaTV(rs.getString("MaThanhVien"));
                    entity.setTenTV(rs.getString("TenThanhVien"));
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setNgayThem(rs.getDate("NgayThem"));
                    entity.setLoaiThe(rs.getString("LoaiThe"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setGhiChu(rs.getString("GhiChu"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    
    public List<ThanhVien> selectByLoaiThe(String loaiThe) {
        String sql = "SELECT * FROM ThanhVien WHERE LoaiThe = ?";
        return this.selectBySql(sql, loaiThe);
    }
    

}
