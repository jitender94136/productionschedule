package in.flexsol.productionschedule.dao;

import in.flexsol.productionschedule.modal.Record;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;







@Repository
public class LoginDaoImpl implements LoginDao {

//	 private JdbcTemplate jdbcTemplate;
//		
//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }

	public List<Record> getRecord() {
		//0String sql = "select * from record" ;
		//List<Record> records = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Record>(Record.class));
		//return records;
		return null;
	}

	
	
}
