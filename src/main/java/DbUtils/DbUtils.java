package DbUtils;
import DbUtils.DummySimplestPlusMetaData;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.table.TableModel;
import java.sql.ResultSet;

public class DbUtils
{
    public static TableModel resultSetToTableModel(final ResultSet set) {
        try {
            final ResultSetMetaData metaData = set.getMetaData();
            final int columnCount = metaData.getColumnCount();
            final Vector<String> columnNames = new Vector<String>();
            for (int i = 0; i < columnCount; ++i) {
                columnNames.addElement(metaData.getColumnLabel(i + 1));
            }
            final Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (set.next()) {
                final Vector<Object> obj = new Vector<Object>();
                for (int j = 1; j <= columnCount; ++j) {
                    obj.addElement(set.getObject(j));
                }
                data.addElement(obj);
            }
            return new DefaultTableModel(data, columnNames);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static List resultSetToNestedList(final ResultSet set) {
        try {
            final ResultSetMetaData metaData = set.getMetaData();
            final int columnCount = metaData.getColumnCount();
            final ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < columnCount; ++i) {
                list.add(metaData.getColumnLabel(i + 1));
            }
            final ArrayList<ArrayList<Object>> list2 = new ArrayList<ArrayList<Object>>();
            while (set.next()) {
                final ArrayList<Object> list3 = new ArrayList<Object>();
                for (int j = 1; j <= columnCount; ++j) {
                    list3.add(set.getObject(j));
                }
                list2.add(list3);
            }
            return list2;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] array) {
        System.out.println(resultSetToTableModel((ResultSet)new DummySimplestPlusMetaData()).getValueAt(0, 0));
    }
}