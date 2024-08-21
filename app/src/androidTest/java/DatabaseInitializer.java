import android.content.Context;

import androidx.room.Room;

public class DatabaseInitializer {
    private static YourDatabase database;

    public static void init(Context context) {
        if (database == null) {
            database = Room.databaseBuilder(
                    context.getApplicationContext(),
                    YourDatabase.class,
                    "your_database_name"
            ).build();
        }
    }

    public static YourDatabase getDatabase() {
        return database;
    }
}

