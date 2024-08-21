import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface YourEntityDao {
    @Insert
    void insert(YourEntity entity);

    @Query("SELECT * FROM your_table_name")
    List<YourEntity> getAllEntities();
}
