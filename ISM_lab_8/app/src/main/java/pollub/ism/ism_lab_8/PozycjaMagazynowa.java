package pollub.ism.ism_lab_8;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Warzywniak")
public class PozycjaMagazynowa {
    @PrimaryKey(autoGenerate = true)
    public int _id;
    public String NAME;
    public int QUANTITY;
    public int OLD_QUANTITY;
    public String data;
    public String czas;

}
