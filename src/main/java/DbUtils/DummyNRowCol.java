/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbUtils;
/**
 *
 * @author OM NAIK
 */
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class DummyNRowCol extends DummySimplest
{
    private List<List<String>> data;
    private int numCols;
    private int numRows;
    private int rowPointer;
    
    public DummyNRowCol(final int numRows, final int numCols) {
        this.rowPointer = -1;
        this.numRows = numRows;
        this.numCols = numCols;
        this.fillData(this.data = new ArrayList<List<String>>(numRows));
    }
    
    private void fillData(final List<List<String>> data) {
        for (int i = 0; i < this.numRows; ++i) {
            final List<String> row = new ArrayList<String>(this.numCols);
            data.add(row);
            for (int j = 0; j < this.numCols; ++j) {
                final String val = Integer.toString((int)(Math.random() * 2.147483647E9), 36);
                row.add(val);
            }
        }
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        return new DummySimplestMetaData((DummySimplestMetaData)null);
    }
    
    public Object getObject(final int columnIndex) throws SQLException {
        return this.data.get(this.rowPointer).get(columnIndex - 1);
    }
    
    public String getString(final int columnIndex) throws SQLException {
        return this.data.get(this.rowPointer).get(columnIndex - 1);
    }
    
    public boolean next() throws SQLException {
        ++this.rowPointer;
        return this.rowPointer < this.numRows;
    }
    
    private class DummySimplestMetaData implements ResultSetMetaData
    {

        private DummySimplestMetaData(DummySimplestMetaData dummySimplestMetaData) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public String getCatalogName(final int column) throws SQLException {
            return null;
        }
        
        public String getColumnClassName(final int column) throws SQLException {
            return "java.lang.String";
        }
        
        public int getColumnCount() throws SQLException {
            return DummyNRowCol.this.numCols;
        }
        
        public int getColumnDisplaySize(final int column) throws SQLException {
            return 0;
        }
        
        public String getColumnLabel(final int column) throws SQLException {
            return String.format("%s%d", "Column", column);
        }
        
        public String getColumnName(final int column) throws SQLException {
            return String.format("%s%d", "Column", column);
        }
        
        public int getColumnType(final int column) throws SQLException {
            return 12;
        }
        
        public String getColumnTypeName(final int column) throws SQLException {
            return "VARCHAR";
        }
        
        public int getPrecision(final int column) throws SQLException {
            return 0;
        }
        
        public int getScale(final int column) throws SQLException {
            return 0;
        }
        
        public String getSchemaName(final int column) throws SQLException {
            return null;
        }
        
        public String getTableName(final int column) throws SQLException {
            if (column != 1) {
                throw new SQLException("Index can only be 1 for this metadata");
            }
            return "DummyTable";
        }
        
        public boolean isAutoIncrement(final int column) throws SQLException {
            return false;
        }
        
        public boolean isCaseSensitive(final int column) throws SQLException {
            return false;
        }
        
        public boolean isCurrency(final int column) throws SQLException {
            return false;
        }
        
        public boolean isDefinitelyWritable(final int column) throws SQLException {
            return false;
        }
        
        public int isNullable(final int column) throws SQLException {
            return 0;
        }
        
        public boolean isReadOnly(final int column) throws SQLException {
            return false;
        }
        
        public boolean isSearchable(final int column) throws SQLException {
            return false;
        }
        
        public boolean isSigned(final int column) throws SQLException {
            return false;
        }
        
        public boolean isWritable(final int column) throws SQLException {
            return false;
        }

        @Override
        public <T> T unwrap(Class<T> iface) throws SQLException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isWrapperFor(Class<?> iface) throws SQLException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}