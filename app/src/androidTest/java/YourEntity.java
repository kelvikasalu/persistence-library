import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "your_table_name")
public class YourEntity {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;
    // Add other fields as needed
}
