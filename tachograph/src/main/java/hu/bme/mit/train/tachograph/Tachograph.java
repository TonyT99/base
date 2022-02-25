package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;

import java.util.Date;

public class Tachograph {
    Table<Date, Integer, Integer> t = HashBasedTable.create();

    public void addNewElement(Date currentTime, int joystickPosition, int referenceSpeed) {
        t.put(currentTime, joystickPosition, referenceSpeed);
    }

    public Table<Date, Integer, Integer> getTable() {
        return Tables.unmodifiableTable(t);
    }
}