package webprog.pers.hobbyhuset.hobbyhuset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppRepository {

    @Autowired
    private JdbcTemplate db;

    public List<Vare> hentVarer() {
        String sql = "SELECT * FROM Vare";
        return db.query(sql, new BeanPropertyRowMapper<Vare>(Vare.class));
    }
}
