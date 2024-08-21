import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {YourEntity.class}, version = 1)
public abstract class YourDatabase extends RoomDatabase {
    public abstract YourEntityDao yourEntityDao();
}
